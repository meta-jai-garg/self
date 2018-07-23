package marksheet;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradingTest {

	float[] grades = { 60, 50, 80.03f, 33.33f, 60, 64 };
	Grading grading = new Grading();

	@Test
	public void findAverageGrade() {
		assertEquals(57.89, grading.averageGrade(grades), 0.1);
	}

	@Test
	public void findMaximuGrade() {
		assertEquals(80.03, grading.maximumGrade(grades), 0.1);
	}

	@Test
	public void findMinimumGrade() {
		assertEquals(33.33, grading.minimumGrade(grades), 0.1);
	}

	@Test
	public void findPercentageOfPassedStudents() {
		assertEquals(83.33, grading.passedStudentPercentage(grades), 0.1);
	}

}
