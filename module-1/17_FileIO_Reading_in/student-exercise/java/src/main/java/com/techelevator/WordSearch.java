package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	

	public static void main(String[] args) {
	
		int lineNumber = 0;
		File inputFile =  getInputFileFromUser();
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("Type the word you would like to find: ");
		String stringToSearch = userStringInput.nextLine();
		System.out.println("Will this search be case sensitive?  [Y]es [N]o");
		String userResponse = userStringInput.nextLine();
		
		
		try {
			Scanner fileScanner = new Scanner(inputFile);
			
			
		      
				while(fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					String lineNoPunct = line.replaceAll("\\p{Punct}", "");
					String [] words = lineNoPunct.split(" ");
					lineNumber ++;
					for (String wordsInArray: words) {
						if(userResponse.contains("y")) {
							if(wordsInArray.equals(stringToSearch)) {   // if case sensitive use .equals()
							System.out.println(lineNumber + ": " + line);
							}
						
						}
						else if(wordsInArray.equalsIgnoreCase(stringToSearch)) { //otherwise equalsIgnoreCase
						System.out.println(lineNumber + ": " + line);
						}
					}
					}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
			
	}
//method to get file location from the user
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the path to a file: ");
		String filePath = userInput.nextLine();
		File inputFile = new File(filePath);
	
		if(!inputFile.exists()) {
			System.out.println("File does not exist.");
			System.exit(1);
		}	
		else if(!inputFile.isFile()) {
			System.out.println(filePath + " is not a file");
			System.exit(1);
		}
		return inputFile;
	}

}
