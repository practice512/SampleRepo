package Sampl;

public class switchex {
	
	
	
	public static void switchMethod(char grade)
	{
		switch(grade)
		{
		case 'a': System.out.println("in grade a");
		break;
		case 'b' : System.out.println("in grade b");
		break;
		case 'c' : System.out.println("in grade c");
		break;
		default:
			System.out.println("in valid grade ");
		
		}
	}
	
	
	
	public static void main(String[] args)
	{
		char grade= 'b';
		switchex.switchMethod(grade);
	}
	

}
