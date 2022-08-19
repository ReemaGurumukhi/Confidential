package Patterns;

public class B {

	public static void main(String[] args)
	{
		int star = 1;
		 int space = 5; 
		 int star2 = 1; 
		 int space2 = 4; 

		 for(int i=1; i<=9; i++)
		 {
		 for(int j=1; j<=star; j++) 
		 {
		 System.out.print("*");
		 }
		 for(int k=1;k<=space; k++) 
		 {
		 System.out.print(" ");
		 }
		 for(int m=1; m<=space2; m++)
		 {
		 System.out.print(" ");
		 }
		 for(int l=1; l<=star2;l++)
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
