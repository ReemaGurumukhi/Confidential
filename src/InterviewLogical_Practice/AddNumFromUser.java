package InterviewLogical_Practice;

import java.util.Scanner;

public class AddNumFromUser
{

	public static void main(String[] args) 
	{
		
		int num1 = 10;
		int num2= 30;
		System.out.println(num1);
		System.out.println(num2);
		
		num1=num1+num2;    //--10+30= 40 ----num1=40;
		num2=num1-num2;      //40-30 - 10 ----num2=30;
		num1=num1-num2;     //40-30 =10    ---num1=30;
		
		System.out.println("swap number without using 3rd variable:");
		System.out.println(num1);
		System.out.println(num2);
		
	int num3 = 0;
	 num1=num3;    //--- num3=10
	 num2=num1;    //num1= 30
	 num3= num2;    //num2= 10;
		System.out.println("swapping with 3rd variable: ");
		System.out.println(num1);
		System.out.println(num2);
		
System.out.println("=================================================");			
		
		String sentence = "R E E M A";	
		
		sentence.replace(" ", "");
		System.out.println(sentence.replace(" ", ""));
		
System.out.println("=================================================");		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Num: ");
		
		int a = s.nextInt();
		
		int b = s.nextInt();
		
		int sum= a+b;
		System.out.println("Addition: "+sum);
System.out.println("=================================================");

System.out.println("=================================================");		
Scanner s1 = new Scanner(System.in);
System.out.println("Enter String: ");
String sen = s1.nextLine();
	sen.replace(" ","");
	System.out.println(sen.replace(" ",""));







}
}
