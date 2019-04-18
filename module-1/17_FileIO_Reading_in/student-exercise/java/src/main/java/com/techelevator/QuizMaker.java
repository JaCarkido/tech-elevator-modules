package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
	
		File inputFile = getFileFromUser();
		Scanner userAnswer = new Scanner(System.in);
		String answerGuess = "";
		int numCorrect = 0;
		int numAsked = 0;
		
		
		try {
			Scanner fileScanner = new Scanner(inputFile);
			while(fileScanner.hasNextLine()){
				
				String line = fileScanner.nextLine();
				String[] questionStrings = line.split("\\|");         //each question array will only have 5 indexes pritn indexs 0-5 then replace them 
				
				for(String questionParts : questionStrings) {
					if(questionParts.contains("*")) {
						String answerActual = questionParts;
						System.out.println( answerActual);
					}
				//System.out.println("Please select your answer");
				//answerGuess = userAnswer.nextLine();
				
				// if questionsString answer = the index that contains * then numCorrect++; numAsked++; System.out.println("That's Correct!")	
				// else numAsked ++; System.out.println("Sorry, the correct answer was: " + correctAnswer);
				
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static File getFileFromUser() {
		Scanner userInput= new Scanner(System.in);
		System.out.println("Please enter the file location");
		String filePath = userInput.nextLine();
		File inputFile = new File (filePath);
		
		if(!inputFile.exists()) {
			System.out.println("The file does not exist!");
			System.exit(1);
		}
		else if (!inputFile.isFile()) {
			System.out.println(filePath + " is not a file!");
		}
		
		
		return inputFile;
	}

}
