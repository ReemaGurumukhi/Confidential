package Patterns;

public class Quadrant_IIIrd {

	public static void main(String[] args) 
	{
		
		//----------3rd quadrant------//
		//--------lower left quadrant----//
		
		//    ******
		//     *****
		//      ****
		//       ***
		//        **
		//         *
		
		//rows----->6
		//star----->6
		//space---->1
		
		int star=6;
		int space=0;
		
		for(int i=1; i<=6;i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			star--;
			space++;
			System.out.println();
		}
		
		
//Note---always check first line 		
		

	}

}
