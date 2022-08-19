package Patterns;

import java.util.Scanner;

public class DescAsc_DecreasingIncreasing {

	public static void main(String[] args) 
	{
		//----------------------------------------
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		//--------------------------------------
		
		
//		int row= 11;
//		int star=6;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter number for star(*)");  //--9
		int row = s.nextInt();
		int star=(row/2)+1;
		
		for(int i=1; i<=row ; i++)
		{
			for(int j=1; j<=star ;j++)
			{
				System.out.print("*");
			}
			if((row%i)==0)
			{
				star--;
			}
			else
			{
				star++;
			}
			System.out.println();
		}

	}

}
