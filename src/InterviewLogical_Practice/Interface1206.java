package InterviewLogical_Practice;

public class Interface1206 implements testA ,testB
{

	public static void main(String[] args) 
	{
		Interface1206 it = new Interface1206();
		it.m1();
		it.m2();
		it.m2B();
		it.m3();

	}

	@Override
	public void m2B()
	{
		System.out.println("I am M2B method of Interface TEst B");
	}

	@Override
	public void m1()
	{
		System.out.println("I am M1 Method from interface which is Overridded.");
	}

	@Override
	public void m2() 
	{
		System.out.println("I am M1 Method from interface which is Overridded.");
	}

}


///////////////////////////////////////////////////////////////////////////////////////////
interface testA
{
    static int a=10;
    final String s="Hello!!";
    
    void m1();
    void m2();
    
    default void m3()
    {
        System.out.println("I am static method from Interface TEST-A.");
        System.out.println("VAlue of A:" +(a+10));
        System.out.println("String name :"+s);
        testB. mStatic();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
interface testB
{
    void m1();
    void m2B();
    static void mStatic()
    {
        System.out.println("I am static method from Interface B");
    }
}