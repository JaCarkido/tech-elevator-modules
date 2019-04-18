package com.techelevator;


public class KataFizzBuzz {
	
	private int num;
	private String result;
	

	
	public KataFizzBuzz() {
	
	}
	
	public String fizzBuzz(int number) {
		//result.valueOf(number);
		//return result;
		
		String numberAsString = new Integer(number).toString();
		
		if(number >= 1 && number <= 100) {
			if(number % 3 == 0 && number % 5 == 0) {
				return "FizzBuzz?";
			}
			else {
				if(numberAsString.contains("3")) {
					if(numberAsString.contains("5")) {
						return "FizzBuzz?";
				}
				
				return "Fizz";
		
			}
			 if(numberAsString.contains("5")) {
				 if(numberAsString.contains("3")) {
					 return "FizzBuzz?";
				 }
				 return "Buzz";
			
			}
			else {
						if(number % 3 == 0)  {
							return "Fizz";
						}
						if(number % 5 == 0) {
							return "Buzz";
					
						}
					
					return numberAsString;
					}
			
			}
		}
	//what should 51 return as? contains a 5 but divisible by 3
			
		return "";
		
		
	}
	

}
