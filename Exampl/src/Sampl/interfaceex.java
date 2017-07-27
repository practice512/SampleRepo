package Sampl;

interface  bankk
{
	int  ROI();
}

class Sbank implements bankk
{
	public int ROI()
	{
		System.out.println("in ROI");
		return 7;
	}
}

class noBank implements bankk
{
	public int ROI()
	{
		System.out.println("in roi of no bank");
		return 9;
	}
}

public class interfaceex {
	
	public static void main(String[] args)
	{
		bankk b;
		b=new Sbank();
		b.ROI();
		b=new noBank();
		b.ROI();
	}
	
	
	

}
