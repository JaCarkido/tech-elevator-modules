package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
 
		// System.out.println( " " + );
		
		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int numberOfRacoons = 3;
		int racoonsLeaving = 2;
		int racoonsLeft = numberOfRacoons - racoonsLeaving;
		
		System.out.println( "remaining racoons " + racoonsLeft );
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int fewerBees = numberOfFlowers - numberOfBees;
		
		System.out.println( "amount fewer bees " + fewerBees );
		
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int initialPigeons = 1;
		int arrivingPigeons = 1;
		int totalPigeons = initialPigeons + arrivingPigeons;
		System.out.println( "total pigeons " + totalPigeons );
		
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int initialOwls = 3;
		int arrivingOwls = 2;
		int totalOwls = initialOwls + arrivingOwls;
		System.out.println( "Total Owls " + totalOwls);
		
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int initialWorkingBeavers = 2;
		int beaversLeavingToSwim = 1;
		int remainingBeaversWorking = initialWorkingBeavers - beaversLeavingToSwim;
		System.out.println( "Remaining beavers at work " + remainingBeaversWorking);
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int initialToucansOnLimb = 2;
		int arrivingToucans = 1;
		int totalToucansOnLimb = initialToucansOnLimb + arrivingToucans;
		System.out.println( "Total toucans on limb " + totalToucansOnLimb);
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int extraSquirrels = numberOfSquirrels - numberOfNuts;
		System.out.println( "number of extra squirrels is " + extraSquirrels);

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		int numberOfQuarters = 1;
		int numberOfDimes = 1;
		int numberOfNickles = 2;
		int valueOfOneQuarter = 25;
		int valueOfOneDime = 10;
		int valueOfOneNickle = 5;
		
		int totalMoney = numberOfQuarters * valueOfOneQuarter + numberOfDimes * valueOfOneDime + numberOfNickles * valueOfOneNickle;
		
		System.out.println( "total money in cents " + totalMoney); //double returned .4499999998
				
		
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int brierMuffins = 18;
		int macadamsMuffins = 20;
		int flanneryMuffins = 17;
		int totalFirstGradeMuffins = brierMuffins + macadamsMuffins + flanneryMuffins;
		
		System.out.println( "Total miffins baked by first grade classes " + totalFirstGradeMuffins);
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		double costYoYo = .24;
		double costWhistle = .14;
		double totalSpent = costYoYo + costWhistle;
		System.out.println( "total spent on toys in dollars " + totalSpent);
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallows = 8;
		int miniMarshmallows = 10; 
		//did she use 8 and 10 for each of the rice krispies if so then 
			//int numberOfRiceKrispies = 5;
			//int marshmallowsPerRiceKrispie = largeMarshmallows + miniMarshmallows;
			//int totalMarshmallowsUsed = marshmallowsPerRiceKrispie * numberOfRiceKrispies;
		int totalMarshmallowsUsed = largeMarshmallows + miniMarshmallows;
		System.out.println( "number of marshmallows used is " + totalMarshmallowsUsed );
		
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int hiltHouseSnowfall = 29;
		int brecknockElementarySnowfall = 17;
		int snowfallDifference = hiltHouseSnowfall - brecknockElementarySnowfall;
		System.out.println( "difference of snowfall in inches is " + snowfallDifference);
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		int startingFunds = 10;
		int costToyTruck = 3;
		int costPencilCase = 2;
		int remainingFunds = startingFunds - costToyTruck - costPencilCase;
		System.out.println( "remaining money in dollars is " + remainingFunds );
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int marbleCollection = 16;
		int lostMarbles = 7;
		int remainingMarbles = marbleCollection - lostMarbles;
		System.out.println( "Marbles Josh has remaining is " + remainingMarbles );
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		
		int meganSeashells = 19;
		int targetNumberOfSeashells = 25;
		int seashellsThatNeedCollected = targetNumberOfSeashells - meganSeashells;
		System.out.println( "the seashells Megan must collect is " + seashellsThatNeedCollected );
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
		System.out.println( "number of green balloons is " + greenBalloons );
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int startingBooksOnShelf = 38;
		int booksAddedToShelf = 10;
		int totalBooksOnShelf = startingBooksOnShelf + booksAddedToShelf;
		System.out.println( "total books on shelf is " + totalBooksOnShelf);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int legsPerBee = 6;
		int amountOfBees = 8;
		int totalLegs = legsPerBee * amountOfBees;
		System.out.println( "total legs is " + totalLegs);
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double costCone = .99;
		double costTwoCones = costCone * 2;
		System.out.println( "cost of two cones is " + costTwoCones);

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int totalRocksNeeded = 125;
		int rocksHiltHas = 64;
		int rocksRemaining = totalRocksNeeded - rocksHiltHas;
		System.out.println( "rocks remaining " + rocksRemaining);
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		
		int marblesHiltHas = 38;
		int marblesHiltLost = 15;
		int marblesHiltHasLeft = marblesHiltHas - marblesHiltLost;
		System.out.println( "marbles Hilt has left is " + marblesHiltHasLeft );
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int driveDistance = 78;
		int milesDriven = 32;
		int milesRemaining = driveDistance - milesDriven;
		System.out.println( "miles remaining is " + milesRemaining);
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		
		int timeShovelingMorning = 90;
		int timeShovelingAfternoon = 45;
		int totalTimeShoveling = timeShovelingMorning + timeShovelingAfternoon;
		System.out.println( "total time spent shoveling in minutes is " +totalTimeShoveling);
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		double hotdogsPurchased = 6;
		double costPerHotdog = .5;
		double totalHotdogCost = hotdogsPurchased + costPerHotdog;
		System.out.println("total cost of hotdogs " + totalHotdogCost );
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int moneyHiltHas = 50;
		int costOfPencil = 7;
		int pencilsThatCanBePurchased = moneyHiltHas / costOfPencil;
		System.out.println("amount of pencils Hilt can buy is " +pencilsThatCanBePurchased );
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int butterfliesSeen = 33;
		int orangeButterflies = 20;
		int redButterflies = butterfliesSeen - orangeButterflies;
		System.out.println("number of red butterflies is " + redButterflies);
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		int amountPaidWith = 100;
		int costCandy = 54;
		int changeDue = amountPaidWith - costCandy;
		System.out.println("change due in cents is " + changeDue);
		
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int treesInMarksYard = 13;
		int treesMarkPlants = 12;
		int totalTreesInMarksYard = treesInMarksYard + treesMarkPlants;
		System.out.println("total trees in Mark's yard is " + totalTreesInMarksYard);
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		
		int daysUntilVisit = 2;
		int hoursPerDay = 24;
		int hoursUntilVisit = daysUntilVisit * hoursPerDay;
		System.out.println(" hours until Joy visits her grandma is " + hoursUntilVisit );

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int numberOfKimsCousins = 4;
		int gumPerCousin = 5;
		int totalGumNeeded = numberOfKimsCousins * gumPerCousin;
		System.out.println( "pieces of gum needed is " + totalGumNeeded );
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		double dansTotalMoney = 3.00;
		double costCandyBar = 1.00;
		double dansRemainingMoney = dansTotalMoney - costCandyBar;
		System.out.println( "dan's remaining money is " + dansRemainingMoney );
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int numberOfBoats = 5;
		int personPerBoat = 3;
		int totalPeopleInBoats = numberOfBoats * personPerBoat;
		System.out.println("total people in boats is " + totalPeopleInBoats );
		
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int beginningLegos = 380;
		int legosLost = 57;
		int remainingLegos = beginningLegos - legosLost;
		System.out.println("number of legos left is " + remainingLegos );
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int currentMuffinsAurthorHas = 35;
		int totalMuffinsAurthorMustBake = 83;
		int numberMuffinsAurthorNeeds = totalMuffinsAurthorMustBake - currentMuffinsAurthorHas;
		System.out.println("number of muffins Aurthor still must bake is " +numberMuffinsAurthorNeeds );
		
		
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int numberOfCrayonsWillyHas = 1400;
		int numberOfCrayonsLucyHas = 290;
		int differenceInNumberOfCrayons = numberOfCrayonsWillyHas - numberOfCrayonsLucyHas;
		System.out.println ("difference in number of crayonsis " + differenceInNumberOfCrayons );
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersPerPage = 10;
		int numberOfPages = 22;
		int totalStickers = stickersPerPage * numberOfPages;
		System.out.println("total sticker count is " + totalStickers);
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		
		int numberOfCupcakes = 96;
		int numberOfChildren = 8;
		int numberOfCupcakesPerChild = numberOfCupcakes / numberOfChildren;
		System.out.println("The number of cupcakes each child can have is " + numberOfCupcakesPerChild );
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int numberOfGingerbreadCookies = 47;
		int gingerBreadCookiesPerJar = 6;
		int numberOfJarsNeeded = numberOfGingerbreadCookies / gingerBreadCookiesPerJar;
		int totalGingerbreadCookiesUsed = gingerBreadCookiesPerJar * numberOfJarsNeeded;
		int leftoverGingerbreadCookies = numberOfGingerbreadCookies - totalGingerbreadCookiesUsed;
		System.out.println("the number of leftover gingerbread cookies is " + leftoverGingerbreadCookies); 
		
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int numberTotalCroissants = 59;
		int numberOfNeighbors = 8;
		int croissantsPerNeighbor = numberTotalCroissants / numberOfNeighbors;
		int totalCroissantsUsed = croissantsPerNeighbor * numberOfNeighbors;
		int leftoverCroissants = numberTotalCroissants - totalCroissantsUsed;
		System.out.println("number of left of Croissants is " + leftoverCroissants );


        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int totalOatmealCookies = 276;
		int oatmealCookiesPerTray = 12;
		int totalTraysNeeded = totalOatmealCookies / oatmealCookiesPerTray;
		System.out.println("the total amount of trays needed is " +totalTraysNeeded );
		
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int totalPretzels = 480;
		int pretzelsPerServing = 12;
		int numberOfServings =  totalPretzels / pretzelsPerServing;
		System.out.println("the number of servings made is " + numberOfServings );
		
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int lemonCupcakesBaked = 53;
		int lemonCupcakesRemaining = 2;
		int lemonCupcakesPerBox = 3;
		int lemonCupcakesGivenAway = lemonCupcakesBaked - lemonCupcakesRemaining;
		int boxesGivenAway = lemonCupcakesGivenAway / lemonCupcakesPerBox;
		System.out.println("the number of boxes given awat is " + boxesGivenAway );
		
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int carrotsPrepared = 74;
		int peopleServedCarrots = 12;
		int carrotsPerPerson = carrotsPrepared / peopleServedCarrots;
		int carrotsServed = carrotsPerPerson * peopleServedCarrots;
		int carrotsLeft = carrotsPrepared - carrotsServed;
		System.out.println("the number of carrots left is " + carrotsLeft);
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int totalNumberOfTeddyBears = 98;
		int teddyBearsPerShelf = 7;
		int shelvesFilled = totalNumberOfTeddyBears / teddyBearsPerShelf;
		System.out.println("the number of shelves needed is " + shelvesFilled );
		
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int picturesPerAlbum = 20;
		int totalPictures = 480;
		int albumsNeeded =  totalPictures / picturesPerAlbum;
		System.out.println("the number of albums needed is " + albumsNeeded );
		
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int totalTradingCards = 94;
		int tradingCardsPerBox = 8;
		int boxesFilled = totalTradingCards / tradingCardsPerBox;
		int totalCardsInFilledBoxes = boxesFilled * tradingCardsPerBox;
		int cardsInUnfilledBox = totalTradingCards - totalCardsInFilledBoxes;
		System.out.println("the number of cards left in the unfilled box is " + cardsInUnfilledBox );
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int numberOfBooks = 210;
		int numberOfShelves = 10;
		int numberOfBooksPerShelf = numberOfBooks / numberOfShelves;
		System.out.println("the number of books per shelf is " + numberOfBooksPerShelf );
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int croissantsBaked = 17;
		int guestsServedCroissants = 7;
		int croissantsPerGuest = croissantsBaked / guestsServedCroissants;
		System.out.println("the number of croissants served to each guest is " + croissantsPerGuest );
		
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

		double oneRoom = 12 * 14;
		double billHourly = oneRoom / 2.15;
		double jillHourly = oneRoom /1.90;
		double combinedHourly = billHourly + jillHourly;
		double fiveRooms = oneRoom * 5;
		double timeForFiveRooms = fiveRooms / combinedHourly;
		System.out.println("the amount of hours for both to paint five rooms is " + timeForFiveRooms );
		
		double oneWorkDay = 8;
		double sixHundredTwentyThreeRooms = oneRoom * 623;
		double timeToPaintSixHundredTwentyThreeRooms = sixHundredTwentyThreeRooms / combinedHourly;
		double daysToPaint = timeToPaintSixHundredTwentyThreeRooms / oneWorkDay;
		System.out.println("the number of days to paint 623 rooms is " + daysToPaint );
		
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

		String myFirstName = "James";
		String myLastName = "Carkido";
		String myMiddleInitial = "A";
		
		String myFullName = myLastName + ", " + myFirstName + " " + myMiddleInitial + ".";
		System.out.println("Full Name: " + myFullName );
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		double distanceFromNewYorkToChicago = 800;
		double distanceAlreadyTraveled = 537;
		double percentOfTripCompleted = distanceAlreadyTraveled / distanceFromNewYorkToChicago * 100;
		System.out.println(" the percent traveled is " + percentOfTripCompleted );
		
		percentOfTripCompleted = (int) percentOfTripCompleted;
		
		System.out.println("the pecent traveled is " + percentOfTripCompleted );
		

	}

}
