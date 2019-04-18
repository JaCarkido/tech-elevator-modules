package com.techelevator;

public class HomeworkAssignment {

//Class Data Members ---------------------------------------------------------------------------------------
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
// CTOR -----------------------------------------------------------------------------------------Constructor

public HomeworkAssignment (int possibleMarks) {
	this.possibleMarks = possibleMarks;
	
	
}


// Setters and Getters --------------------------------------------------------


/**
 * @return the totalMarks
 */
public int getTotalMarks() {
	return totalMarks;
}

/**
 * @param totalMarks the totalMarks to set
 */
public void setTotalMarks(int totalMarks) {
	this.totalMarks = totalMarks;
}

/**
 * @return the possibleMarks
 */
public int getPossibleMarks() {
	return possibleMarks;
}


/**
 * @return the submitterName
 */
public String getSubmitterName() {
	return submitterName;
}

/**
 * @param submitterName the submitterName to set
 */
public void setSubmitterName(String submitterName) {
	this.submitterName = submitterName;
}

/**
 * @return the letterGrade
 */
public String getLetterGrade() {
double gradeValue = ((double) totalMarks / (double) possibleMarks) * 100;
	
	
	
	if(gradeValue >= 90) {
		letterGrade = "A";
	}
	else {
		if(gradeValue < 90 && gradeValue >=80) {
			letterGrade = "B";
		}
		else {
			if(gradeValue < 80 && gradeValue >= 70) {
				letterGrade = "C";
			}
			else {
				if(gradeValue < 70 && gradeValue >= 60) {
					letterGrade = "D";
				}
				else {
					letterGrade = "F";
				}
			}
		}
	}
	return letterGrade;
}

/**
 * @param letterGrade the letterGrade to set
 */
public void setLetterGrade(String letterGrade) {
	this.letterGrade = letterGrade;
}
	
//Class Methods ----------------------------------------------------------------







	
}
