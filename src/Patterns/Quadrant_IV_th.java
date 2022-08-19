package Patterns;

public class Quadrant_IV_th {

	public static void main(String[] args)
	{
		
		
	//-----------4th quadrant triangle-------//
	//--------lower right quadrant-------//	
		//*****
		//****
		//***
		//**
		//*
		
		//rows--->5
		//columns--->max---star=5
		
		int star=5; 
		for(int i=1; i<=5 ;i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			star--;
			System.out.println();
		}

	}

}
