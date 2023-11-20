package calculator;

import java.util.Scanner;

public class CalculatorMain
{
	public static void main(String[] args)

	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Calculator:-");
		System.out.println("Menu:\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Divison\nChoose From the above Options:");
		int choice=sc.nextInt();
		System.out.println("Your choice is: "+choice);
		//First number input
		System.out.println("Enter the first number");
		double num1=sc.nextDouble();
		//Second number input
		System.out.println("Enter the second number");
		double num2=sc.nextDouble();
		sc.close();

		//Switch Case
		switch(choice)
		{

		case 1:
			doAddition(num1,num2); //Calling Addition Method
			break;

		case 2:
			doSubtraction(num1,num2); //Calling Subtraction Method
			break;

		case 3:
			doMultiplication(num1,num2); //Calling Multiplication Method 
			break;

		case 4:
			doDivision(num1,num2); //Calling Division Method
			break;
			//If the user choice is more then 4 default case executes
		default:
			System.out.println("Invalid Choice");
			return;	

		}
	}
	//For Addition
	static void doAddition(double num1,double num2)
	{

		double result =num1+num2;
		System.out.println("Result: "+result);

	}
	//For Subtraction
	static void doSubtraction(double num1,double num2) 
	{
		double result=(num1-num2);
		System.out.println("Result: "+result);

	}
	//For Multiplication
	static void doMultiplication(double num1,double num2)
	{

		double result=(num1*num2);
		System.out.println("Result: "+result);				

	}
	//For Division
	static void doDivision(double num1,double num2)  

	{	
		double result=(num1/num2);
		//If the num2 is 0 , we can't divide by zero so we use if else condition  
		if(num2==0) 
		{
			System.out.println("Can't divide by 0");
		}
		else
		{
			System.out.println("Result: "+result);
		}

	}

}
