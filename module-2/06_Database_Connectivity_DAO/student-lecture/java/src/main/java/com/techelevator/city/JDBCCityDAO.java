package com.techelevator.city;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCCityDAO implements CityDAO { //implement the interface for the city table

	private JdbcTemplate myJdbcTemplate;
	
	public JDBCCityDAO(DataSource aDataSource) {				//constructor for DAO - receive a data source when instantiated
		this.myJdbcTemplate = new JdbcTemplate(aDataSource);	// instantiate a JdbcTemplate object and assign class reference 
	}

	@Override
	public void save(City newCity) { // receives a city object and returns nothing
									 // going to add the city object to the database (INSERT)
		String sqlInsertCity = "INSERT INTO city(id, name, countrycode, district, population) " +
							   "VALUES(?, ?, ?, ?, ?)";
		newCity.setId(getNextCityId());
		myJdbcTemplate.update(sqlInsertCity, newCity.getId(),             // replace first '?' w/value returned by getID -ID in the city that was passed in
											 newCity.getName(),			  // replace second '?' w/value returned by getName()
											 newCity.getCountryCode(),	  // replace third '?' w/value returned by  getCountrycCode()
											 newCity.getDistrict(),       // replace fourth '?' w/value returned by getDistrict
											 newCity.getPopulation());    // replace fifth '?' w/value returned by  getPopulation
	}
	
	@Override
	public City findCityById(long id) {
		City theCity = null;
		String sqlFindCityById = "SELECT id, name, countrycode, district, population "+
							   "FROM city "+
							   "WHERE id = ?";
		SqlRowSet results = myJdbcTemplate.queryForRowSet(sqlFindCityById, id);
		if(results.next()) {
			theCity = mapRowToCity(results);
		}
		return theCity;
	}

	@Override
	public List<City> findCityByCountryCode(String countryCode) {
		ArrayList<City> cities = new ArrayList<>();
		String sqlFindCityByCountryCode = "SELECT id, name, countrycode, district, population "+
										   "FROM city "+
										   "WHERE countrycode = ?";
		SqlRowSet results = myJdbcTemplate.queryForRowSet(sqlFindCityByCountryCode, countryCode);
		while(results.next()) {
			City theCity = mapRowToCity(results);
			cities.add(theCity);
		}
		return cities;
	}

	@Override
	public List<City> findCityByDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(City city) {  //receive a city object and update the database with the values
		
		String theUpdate= "UPDATE city "      +   //created the UPDATE statement
						  "SET name     = ? "+   //to use the values in the object passed
						  ",countrycode = ? "+   
						  ",district    = ? "+
						  ",population  = ? "+
						  "WHERE id     = ? ";   //id is the primary key we basically never update it
		
		myJdbcTemplate.update(theUpdate					// run the update statement
									,city.getName()			// replace first '?' with name from object passed
									,city.getCountryCode()
									,city.getDistrict()
									,city.getPopulation()
									,city.getId()
							);
	
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	private long getNextCityId() {
		SqlRowSet nextIdResult = myJdbcTemplate.queryForRowSet("SELECT nextval('seq_city_id')");
		if(nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new city");
		}
	}

	private City mapRowToCity(SqlRowSet results) {   //create an object of the class and assign the results from the SQUL statement
		City theCity;								 // Define an object to return
		theCity = new City();						 // Instantiate object to return (run ctor)
		theCity.setId(results.getLong("id"));							// Get the ID from the result and assign to object
		theCity.setName(results.getString("name"));						// Get the Name from the result and assign to object
		theCity.setCountryCode(results.getString("countrycode"));		// Get the country code from the result and assign to object
		theCity.setDistrict(results.getString("district"));				// Get the district fromt he result and assign to object
		theCity.setPopulation(results.getInt("population"));			// Get the population for the result na se assign to object
		return theCity;								 // Return the object
	}
}
