package Constructor;

public class Constructor1906 
{
	String s, empId ="38970" , empName= "REEMA GURUMUKHI"  , desg = "Tester";
	int a, b;
	char c;
	
	
	public Constructor1906()    //constructor
	{
		s= "Reema";      a=10;       b=20;            c='a';	
		this.empId= empId;       this.empName=empName;      this.desg=desg;
		
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(c);
		System.out.println(+(b-5));
		System.out.println(empName + " ----"+ empId+ "----- "+desg);	
	}
	

	
	
	
	
	
	public static void main(String[] args) 
	{
		Constructor1906 c= new Constructor1906();

	}

}
