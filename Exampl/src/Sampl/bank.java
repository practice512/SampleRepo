package Sampl;

abstract class coreBank
{
	abstract int getROI();
	
	public void sample()
	{
		System.out.println("in sample ");
	}
}

class SBI extends coreBank
{
	int getROI()
	{
		System.out.println("roi is ");
		return 7;
	}
}

public class bank
 {
	public static void main(String[] args)
	{
	coreBank b;
	b=new SBI();
	b.getROI();
	b.sample();
	
}
 }