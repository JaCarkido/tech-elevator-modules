package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Map Exercises
	 */

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 *
	 *animalGroups.get(animalNameIn.toLower()); // this takes input and forces it to lower case
	 *then set map key values to all one case (in our case lower)
	 *use string method to convert what is sent in to my case
	 *
	 *
	 *
	 */
	public String animalGroupName(String animalName) {
		Map<String, String>animalGroups = new HashMap<String, String>();
		animalGroups.put("rhino", "Crash");
		animalGroups.put("giraffe", "Tower");
		animalGroups.put("elephant", "Herd");
		animalGroups.put("lion", "Pride");
		animalGroups.put("crow", "Murder");
		animalGroups.put("pigeon", "Kit");
		animalGroups.put("flamingo", "Pat");
		animalGroups.put("deer", "Herd");
		animalGroups.put("dog", "Pack");
		animalGroups.put("crocodile", "Float");
		
		
		if(!(animalGroups.containsKey(animalName.toLowerCase()))){
			return "unknown";
			
		}
		return animalGroups.get(animalName.toLowerCase());	
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public Double isItOnSale(String itemNumber) {
		Map<String, Double>discount = new HashMap<String, Double>();
		
		discount.put("kitchen4001", 0.20);
		discount.put("garage1070", 0.15);
		discount.put("livingroom", 0.10);
		discount.put("kitchen6073", 0.40);
		discount.put("bedroom3434", 0.60);
		discount.put("bath0073", 0.15);
		
		if(!(discount.containsKey(itemNumber.toLowerCase()))) {
			return 0.00;
		}
		
		return discount.get(itemNumber.toLowerCase());
		
	}

	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		
		Set<String>keys = peterPaul.keySet(); //create a set to loop
		
		for(String money: keys) {
			if((peterPaul.get("Peter") > 0) && (peterPaul.get("Paul") < 1000)){ 
				if(peterPaul.get("Peter") % 2 == 1) {
				peterPaul.put("Paul", (peterPaul.get("Paul") + peterPaul.get("Peter") / 2) ); //takes 1/2 peter's money and gives it to paul and fixes rounding issue
				peterPaul.put("Peter", (peterPaul.get("Peter") / 2) + 1); // sets peter's new halved value and fixes rounding issue by adding 1
				} else {
					peterPaul.put("Paul", (peterPaul.get("Paul") + peterPaul.get("Peter") / 2)); //takes 1/2 peter's money and gives it to paul
					peterPaul.put("Peter", (peterPaul.get("Peter") / 2) ); // sets peter's new halved value
				}
			}
		}
		
		//System.out.println(peterPaul);
		return peterPaul;
	}

    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		 //Set<String>keys = peterPaul.keySet();
		
		int petersMoney = peterPaul.get("Peter");
		int paulsMoney = peterPaul.get("Paul");
		int partnershipMoney = 0;
		int petersContribution = 0;
		int paulsContribution = 0;
		
		if (petersMoney >= 5000 && paulsMoney >= 10000) {
			
			petersContribution = petersMoney / 4;							//determines 1/4 of his total money
			petersMoney = petersMoney - petersContribution;					//subtracts contribution from their total money
																			//System.out.println("peters contribution is " +petersContribution);
			paulsContribution = paulsMoney / 4;
			paulsMoney = paulsMoney - paulsContribution; 					
			
			partnershipMoney = paulsContribution + petersContribution;		//sum of 1/4 of each persons total 
																			//place new values back in the map
			peterPaul.put("Peter", petersMoney);
			peterPaul.put("Paul", paulsMoney);
			peterPaul.put("PeterPaulPartnership", partnershipMoney);
		}
		
																			//System.out.println(peterPaul);
		return peterPaul;
	}

	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array,
	 * there is a key of its first character with the value of its last character. In cases where two or more words have 
	 * the same first letter, but different last letters, words towards the end of the array take precedence
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> beginningAndEnding = new HashMap<String, String>();
		
		
		
		for (int i =0; i < words.length; i++) {
			
			String word = words[i];
			String key = word.substring(0,1);
			String value = word.substring(word.length() -1);
																	//System.out.println("value is " + value);
			beginningAndEnding.put(key, value);
		}
																	//System.out.println(beginningAndEnding);
		return beginningAndEnding;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the
	 * number of times that string appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer>wordCount = new HashMap<String, Integer>();
		
		for(int i = 0; i < words.length; i++) {  				// loops through array
			String key = words[i];								// saves string from array[i] into key
			int counter = 0;									// initialize counter
			for(int j = 0; j < words.length; j++) {				// loop grabs words[i] and compares it to rest of array
				if(words[i].contentEquals(words[j])) {
					counter++;									// if .equals then we add 1 to the counter
				}
			}
			wordCount.put(key, counter);						// we return words[i] as the key and the counter as the value
					
			
		}
		
																			//System.out.println(wordCount);
		return wordCount;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		
			Map<Integer, Integer>integerCount = new HashMap<Integer, Integer>();   //create <Integer, Integer> map
			
			for(int i = 0; i < ints.length; i++) {  				// loop through the array of ints
				Integer key = ints[i];								// save or key value as the int
				int counter = 0;									// initialize our counter
				for(int j = 0; j < ints.length; j++) {				// loop to compare our key value against the rest of the array
					if(ints[i] == ints[j]) {						
						counter++;									//if match is found we incriment counter
					}
				}
				integerCount.put(key, counter);						//set int[i] to key and counter to value
						
				
			}
			
			//System.out.println(integerCount);																	/
			return integerCount;
		
	}

	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> wordMultiple = new HashMap<String, Boolean>();
		
		for(int i = 0; i < words.length; i++) {
			String key = words[i];
			boolean value = false;
			int counter = 0;
			
			for(int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					counter++;
				}
			}
			if(counter >= 2) {            //using counter to compare and deciding to set value to true based on counter #
				value = true;
			}
			wordMultiple.put(key, value);
		}
		//System.out.println(wordMultiple);
		return wordMultiple;
	}

	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2,
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 *
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		Map<String, Integer>consolidateInventory = new HashMap<String, Integer>();
		
		// take 1 key from map1 and match it against all keys in map 2
		// if the key.equal then add the values and return them as a key/value in newMap
		// if the key is not equal then return the key and its original value in newMap
		// I will need two loops (mainWarehouse and remoteWarehouse)
		// must set up variables for key and value
		// create set?
		Set<String>keysMain = mainWarehouse.keySet();
		Set<String>keysRemote = remoteWarehouse.keySet();
		
		
		for(String main : keysMain) {
			//String key = main;
			Integer value = mainWarehouse.get(main);
			
			for(String remote: keysRemote) {
				if(main.contentEquals(remote)) {
					value = mainWarehouse.get(main) + remoteWarehouse.get(remote);
				}else {
					if(!remote.contentEquals(main)) {
						consolidateInventory.put(remote, remoteWarehouse.get(remote));
					}
				}
			}
			consolidateInventory.put(main, value);
		}
		
		//for( String :) //must be string we are looping keys which are set as string
		
		//if(mainWarehouse(i).equals(remoteWarehouse(j))) {
			// add the values 
			//put the key and the value into newMap
		
		
		//System.out.println(consolidateInventory);
		return consolidateInventory;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1.
	 *
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer>last2Revisited = new HashMap<String, Integer>();
		//String array words we must move through and determine pairs
		
		//string loop
		
		
		
		for (int i = 0; i < words.length; i++) {
			int counter = 0;                               //must be within the for loop to reset
			
			if(words[i].length() < 2) {						//if less than 2 then impossible return 0
				last2Revisited.put(words[i],0);
			}else {
				String end = words[i].substring(words[i].length() - 2);    // takes the last two of the string so that we can compare later
				//System.out.println("the words end is " + end);
				for(int j = 0; j < words[i].length() -2; j++) {			   // this loops through each string at words[i]
					if(words[i].substring(j, j + 2).equals(end)) {		   // determines whether or not to increase the counter
					counter++;
					}
				}
			}
			last2Revisited.put(words[i], counter);						    // add to map before restarting loop
		}
		
		//System.out.println(last2Revisited);                               //output check
		return last2Revisited;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		
		Map<String, String> distinctValuesMap = new HashMap<String, String>();
		 
		for (int i= 0; i < stringList.size(); i++) {
			distinctValuesMap.put(stringList.get(i), stringList.get(i));
			
		}
		Set<String>distinctValuesSet = distinctValuesMap.keySet();
		List<String>distinctValues = new ArrayList<String>(distinctValuesSet);
		System.out.println(distinctValues);
		
		return distinctValues;
	}
		
}

