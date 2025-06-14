import java.util.*;
class ExceptionX extends Exception
{
	ExceptionX(String s)
	{
		super(s);
	}
}
class ExceptionY extends Exception
{
	ExceptionY(String s)
	{
		super(s);
	}
}
class p24
{
	public static void main(String arg[])
	{
		Random r = new Random();
		int n = r.nextInt(10);
		System.out.println("Number :"+n);
		try
		{
			if(n%2 == 0)
			{
				throw new ExceptionX("Problem");
			}
			else
			{
				throw new ExceptionY("Big Problem");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Successfully completed");
	}
}