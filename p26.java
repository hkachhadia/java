import java.util.*;
class demo extends Thread
{
	public void run()
	{
		System.out.println("this is RUN");
	}
}
class p26
{
	public static void main(String arg[])
	{
		demo d = new demo();
		d.start();
	}
}