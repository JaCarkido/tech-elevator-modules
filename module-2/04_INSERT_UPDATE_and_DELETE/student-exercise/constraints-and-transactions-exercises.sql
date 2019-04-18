-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
 BEGIN TRANSACTION;
 INSERT INTO actor
 (first_name, last_name)
 VALUES ('Hampton', 'Avenue'),('Lisa', 'Byway')
 ;
 SELECT actor_id, first_name, last_name
 FROM actor
 WHERE last_name = 'Byway'
            OR last_name = 'Avenue'    
 ; 
 COMMIT;
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
SELECT name
FROM language
WHERE language_id = 1
;

BEGIN TRANSACTION;
INSERT INTO film
        (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008,
        1 ,198)
;
SELECT title, description, length, release_year, language_id
FROM film
WHERE title = 'Euclidean PI'
;
COMMIT;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
BEGIN TRANSACTION;
INSERT INTO film_actor
        (film_id, actor_id)
VALUES( (SELECT film_id FROM film WHERE title = 'Euclidean PI')
        , (SELECT actor_id FROM actor WHERE first_name = 'Hampton' AND last_name = 'Avenue') )
        ,( (SELECT film_id FROM film WHERE title = 'Euclidean PI')
        , (SELECT actor_id FROM actor WHERE first_name = 'Lisa' AND last_name = 'Byway') )
;
SELECT f.title, a.actor_id, fa.film_id
  FROM film f
  INNER JOIN film_actor fa
  ON f.film_id = fa.film_id
  INNER JOIN actor a
  ON fa.actor_id = a.actor_id
WHERE a.first_name ILIKE 'Hampton' AND a.last_name ILIKE 'Avenue'
                OR a.first_name ILIKE 'Lisa' AND a.last_name ILIKE 'Byway'
;
COMMIT;

-- 4. Add Mathmagical to the category table.

BEGIN TRANSACTION;
INSERT INTO category
  (name)               --(category_id, name) dont need this because data type is serial
VALUES ('Mathmagical')   

--VALUES ((SELECT MAX(category_id) FROM category)+1, 'Mathmagical') --I know now that the category_id will auto generage
;
SELECT category_id, name
FROM category
;
COMMIT;


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
BEGIN TRANSACTION;

UPDATE film_category
   SET  category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical')
WHERE film_id IN (SELECT film_id FROM film 
                  WHERE title IN ('Euclidean PI', 'EGG IGBY','KARATE MOON','RANDOM GO','YOUNG LANGUAGE')
                  )
;

SELECT f.title, c.name
  FROM film f
  INNER JOIN film_category fc
  ON f.film_id = fc.film_id
  INNER JOIN category c
  ON fc.category_id = c.category_id
WHERE f.title = 'Euclidean PI'
        OR f.title ILIKE 'EGG IGBY'
        OR f.title ILIKE 'KARATE MOON'
        OR f.title ILIKE 'RANDOM GO'
        OR f.title ILIKE 'YOUNG LANGUAGE'
;
ROLLBACK;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
BEGIN TRANSACTION;
UPDATE film
  SET rating = 'G'
WHERE film_id IN (SELECT fc.film_id 
       FROM category c 
       JOIN film_category fc 
       ON c.category_id = fc.category_id
       JOIN film f
       ON fc.film_id = f.film_id
       WHERE c.name ILIKE 'Mathmagical')
;
SELECT title, rating
FROM film
WHERE title = 'RANDOM GO'
        OR title = 'YOUNG LANGUAGE'
        OR title = 'KARATE MOON'
        OR title = 'EGG IGBY'
        OR title = 'Euclidean PI'
;
COMMIT;

-- 7. Add a copy of "Euclidean PI" to all the stores.
BEGIN TRANSACTION;
INSERT INTO inventory
        (store_id,film_id)
SELECT store_id, (SELECT film_id FROM film WHERE title = 'Euclidean PI')
        FROM store
        ;

SELECT inventory_id
  FROM inventory i 
  JOIN film f
  ON f.film_id = i.film_id
WHERE f.title = 'Euclidean PI'
;
COMMIT;        
-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;
DELETE FROM film
WHERE title = 'Euclidean PI'
;
ROLLBACK;
-- Will not delete because it violates the key constraint as it is refrenced  in film_actor

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;
DELETE FROM category
WHERE name = 'Mathmagical'
;
ROLLBACK;

--again key constraint. the key is refrenced by film_categroy



-- 10. Delete all links to Mathmagical in the film_category table. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;
DELETE FROM film_category
WHERE category_id IN (SELECT category_id FROM category WHERE name = 'Mathmagical')
;
COMMIT;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
BEGIN TRANSACTION;
DELETE FROM category
WHERE name = 'Euclidean PI'
;
COMMIT;
-- it succeeded because it is no longer key constrained by film_category

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

SELECT *
FROM information_schema.referential_constraints
WHERE constraint_name LIKE '%film_id%'
;

-- We need to get rid of any set that refrecnes the film as its parent.  
-- this includes film_actor and inventory (film_category was also a constraint that we have removed)