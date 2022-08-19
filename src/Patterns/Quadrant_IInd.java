package Patterns;

public class Quadrant_IInd {

	public static void main(String[] args) 
	{
		
		//-----------2nd Quadrant triange---------------//
		//--------Upper left Quadrant---------//
			//	       *
			//	      **
			//	     ***
			//	    ****
			//	   *****
			//	  ******
			
		//rows--->6
		//columns---->min  space=5
		
		//row------>6
		//space---->5  (maximun value)
		//star----->1  (maximum value)
		
		int space=5;   
		int star=1;
		for(int i=1; i<=6 ;i++)      //----->row
		{
			for(int j=1; j<=space ; j++)   //----->col
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star;k++)
			{
				System.out.print("*");
			}
			space--;
			star++;
			System.out.println();
		}
		
	}
}
	

		
	