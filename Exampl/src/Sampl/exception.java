package Sampl;

public class exception {
	
	
	public static void main(String[] args)
	{
		int num[] ={1,2,3};
		try
		{
		System.out.println(num[5]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
		System.out.println("hi");
		}
		
	}

}
