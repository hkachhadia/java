import java.util.*;
class Counter
{
	int cnt = 0;
	public synchronized void inc()
	{
		cnt++;
		System.out.println(Thread.currentThread().getName()+" "+cnt);
	}
}
class demo implements Runnable
{
	Counter d;
	public demo(Counter x)
	{
		this.d = x;
	}
	public void run()
	{
		for(int i = 1;i<=5;i++)
		{
			d.inc();
		}
		
	}
}
class p28
{
	public static void main(String arg[])
	{
		Counter c = new Counter();
		Thread t1 = new Thread(new demo(c),"Thread 1");
		Thread t2 = new Thread(new demo(c),"Thread 2");
		t1.start();
		t2.start();
	}
	
}