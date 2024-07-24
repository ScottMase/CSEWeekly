package com.tus.grade;

public class StudentGrade {
	public char getGrade(int studentGrade) {
		char result;
		if (studentGrade >= 85)
			result = 'A';
		else if (studentGrade >= 70)
			result = 'B';
		else if (studentGrade >= 55)
			result = 'C';
		else if (studentGrade >= 40)
			result = 'D';
		else if (studentGrade >= 25)
			result = 'E';
		else
			result = 'F';
		return result;
	}

}

