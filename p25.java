import java.util.*;
class p25 extends Thread
{
	public static void main(String arg[])
	{
		Thread t = new Thread();
		t.setName("Main Thread");
		System.out.println(t.getName());
		try
		{
			for(int i = 1;i<=5;i++)
			{
				System.out.println(t.getName()+"="+i);
				sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Main Thread Executed Successfully");
		
	}
}