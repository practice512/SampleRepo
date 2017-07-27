package Sampl;


class calci
{
	int a,b;
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		int c=a+b;
		System.out.println("the result in parent class"+c);
		
	}
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("the sub in parent class"+c);
		
	}


}

public class My_Calculation extends calci
{
	public void multi()
	{
		System.out.println("in multi");
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("the result in child class"+c);
		
	}
	
	public void addition(int a,int b)
	{
		super.add(a, b);
	}
	public static void main(String[] args)
	{
	/*My_Calculation m=new My_Calculation();
	m.add(3, 2);
	m.sub(4, 4);
	m.multi();
	m.addition(4, 4);*/
		
		calci c=new My_Calculation();
		c.add(3, 3);
		c.sub(3, 3);
		
		
		
				
				
		
	}
}


