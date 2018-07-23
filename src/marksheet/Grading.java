package marksheet;

/**
 * This class contain methods to 1. Find Average Grade 2. Find Maximum Grade 3.
 * Find Minimum Grade 4. Find Percentage of Passed Student
 *
 * @author Jai Kumar Garg
 */
class Grading {
	/**
	 * Computes average grade of all the students
	 *
	 * @param grades
	 *            is an array requires the length of must be > 0
	 * @return average grade for all the students
	 * 
	 * @throws ArithmeticException
	 */
	float averageGrade(float[] grades) throws ArithmeticException {
		float totalGrade = 0.0f;
		for (float f : grades) {
			totalGrade += f;
		}
		return Math.round((totalGrade / grades.length) * 100.0f) / 100.0f;
	}

	/**
	 * Finds maximum grade in given array
	 *
	 * @param grades
	 *            is an array requires the length of array must be > 0
	 * @return maximum grade from the grades array
	 * 
	 * @throws ArithmeticException
	 */
	float maximumGrade(float[] grades) throws ArithmeticException {
		float max = grades[0];
		for (float f : grades) {
			if (max < f) {
				max = f;
			}
		}
		return Math.round(max * 100.0f) / 100.0f;
	}

	/**
	 * Finds minimum grade in given array
	 *
	 * @param grades
	 *            is an array requires the length of array must be > 0
	 * @return minimum grade from the grades array
	 * 
	 * @throws ArithmeticException
	 */
	float minimumGrade(float[] grades) throws ArithmeticException {
		float min = grades[0];
		for (float f : grades) {
			if (min > f) {
				min = f;
			}
		}
		return Math.round(min * 100.0f) / 100.0f;
	}

	/**
	 * Computes percentage of students passed assuming grade>=40 as Pass
	 *
	 * @param grades
	 *            is an array requires the length of array must be > 0
	 * @return percentage of pass students
	 * 
	 * @throws ArithmeticException
	 */
	float passedStudentPercentage(float[] grades) throws ArithmeticException {
		int noOfPassedStudents = 0;
		for (float f : grades) {
			if (f >= 40) {
				noOfPassedStudents++;
			}
		}
		return Math.round(((float) noOfPassedStudents / (float) grades.length) * 100.0f * 100.0f) / 100.0f;
	}
}
