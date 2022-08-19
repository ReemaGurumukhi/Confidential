package Patterns;

public class ButterFly {

	public static void main(String[] args) 
	{
		//*         *
		//**       **
		//***     ***
		//****   ****
		//***** *****
		//****   ****
		//***     ***
		//**       **
		//*         * ( Remember : Star Space Space Star)

		
		int row= 9;
		int star = 1; // Star on the first Row Left
		int space = 5; // Space on the first Row Left
		
		int star2 = 1; // Star on the first Row Right
		int space2 = 4; // Space on the first Row Right
		
		for(int i=1; i<=row ;i++)
		{
			for(int j=1; j<=star;j++)
			{
				System.out.print("*");   //---left side ---for star
			}
			for(int k=1; k<=space;k++)
			{
				System.out.print(" ");    //--left side---for space
			}
			for(int l=1; l<=space2; l++)
			{
				System.out.print(" ");
			}
			for(int m=1; m<=star2; m++)    // Inner For loop for Star(Right)
			{
				System.out.print("*");
			}
			
			
			if(i<5)
			{	
				star++;
				 space--;
				star2++;		
				space2--;
			}
			else
			{
				star--;
			    space++;
				star2--;
				space2++;
			}
			System.out.println();	
		}
	}

}
