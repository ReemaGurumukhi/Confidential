package InterviewLogical_Practice;

import InterviewLogical_Practice.A.B;      
interface A 
{
	void m1();
	void m2();
	
		public interface B
		{
			void m1();
			void m2();
			void m3();
			void m4();
		}
}

///For nested interface we have to import Package.interface name1.interface name2
public class nestedInter implements A ,B
{

	@Override
	public void m1() {
		System.out.println("M1");
		
	}

	@Override
	public void m2() {
		System.out.println("M2");
		
	}

	@Override
	public void m3() {
		System.out.println("M3");
		
	}

	@Override
	public void m4() {
		System.out.println("M4");
		
	}

}

//////////////////////////////////////////////////
