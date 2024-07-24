package com.tus.grade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentGradeTest {
	
	StudentGrade studentGrade;
	
	@BeforeEach
	void setUp() {
		studentGrade = new StudentGrade();
	}

	@Test
	void testGradeA() {
		assertEquals('A',studentGrade.getGrade(85));
	}
	
	@Test
	void testGradeB() {
		assertEquals('B',studentGrade.getGrade(73));
	}
	
	@Test
	void testGradeC() {
		assertEquals('C',studentGrade.getGrade(60));
	}
	
	@Test
	void testGradeD() {
		assertEquals('D',studentGrade.getGrade(45));
	}
	
	@Test
	void testGradeE() {
		assertEquals('E',studentGrade.getGrade(30));
	}
	
	@Test
	void testGradeF() {
		assertEquals('F',studentGrade.getGrade(20));
	}

}
