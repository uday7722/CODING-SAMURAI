package calculator;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student name:");
		String name=sc.nextLine();

		//Input
		double assignmentsGrade = getMarks("Assignments");
		double quizzsGrade = getMarks("Quizzes");
		double midtermGrade = getMarks("Midterm Exam");
		double finalExamGrade = getMarks("Final Exam");

		//percent ranges
		int[] percentageRange = {90, 80, 70, 60};
		//Character for grades
		String[] characterGrades = {"A", "B", "C", "D", "F"};

		//only values between 0 to 100 range are allowed
		if (!invalidMarks(assignmentsGrade) || !invalidMarks(quizzsGrade)
				|| !invalidMarks(midtermGrade) || !invalidMarks(finalExamGrade)) {
			System.out.println("Please enter marks only  between 0 and 100.");
		}
		else {


			double totalPercentage = sumGrade(assignmentsGrade, quizzsGrade, midtermGrade, finalExamGrade);
			//result:
			String grade = grade(totalPercentage, percentageRange, characterGrades);
			System.out.println("Overall percentage of "+ name +" is:"+ totalPercentage);
			System.out.println("Grade of "+ name +" is:"+ grade);

		}

	}
	//Method to check the numbers are in the range between 0 to 100 or not
	static boolean invalidMarks(double grade) {
		return(grade>=0 && grade<=100);
	}
	//For entering the marks for individual task 
	static double getMarks(String task) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks for " + task + ": ");
		return sc.nextDouble();
	}
	//Sum of tasks
	static double sumGrade(double assignments, double quizzes, double midterm, double finalExam) {
		return (assignments + quizzes + midterm + finalExam) / 4;
	}
	//Percentage and Grade ranges declarations
	static String grade(double totalPercentage, int[] percentageRange, String[] characterGrades) {
		for (int i = 0; i < percentageRange.length; i++) {
			if (totalPercentage >= percentageRange[i]) {
				return characterGrades[i];
			}
		}
		return characterGrades[characterGrades.length - 1]; // Default 
	}


}



