package EPAM.Calculator;

import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		double a ,b ;
		int ch;
		Scanner scan = new Scanner(System.in);
		Methods obj = new Methods();
		//String c="true";
		while(true)
		{
			try {
			System.out.println("Enter the operation do you want to perform......");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nAny other key for exit\nEnter your choice (only numbers)........");
			String s=scan.next();
			ch=Integer.parseInt(s);
			if (ch!=1 &&ch!=2 &&ch!=3&&ch!=4) {
				System.out.println("You exited");
				break;}
			System.out.println("Enter the first number:");
			a=scan.nextDouble();
			System.out.println("Enter second number");
			b=scan.nextDouble();
			if(ch==1)
			{
				System.out.println("Additon of "+a+" and  "+b+" is :"+obj.add(a, b));
			}
			else if(ch==2)
			{
				System.out.println("Subtraction of "+a+" and  "+b+" is :"+obj.sub(a, b));
			}
			else if(ch==3)
			{
				System.out.println("Multiplication of "+a+" and  "+b+" is :"+obj.multiply(a, b));
			}
			else if(ch==4)
			{
				System.out.println("Division of "+a+" and  "+b+" is :"+obj.div(a, b));
			}
			else {
				System.out.println("Finish");
			 }
			}
			
			catch(Exception e) {
				System.out.println("please enter valid data......\n");
			}
		}
		
	}
}