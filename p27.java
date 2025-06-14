import java.util.*;
class Counter
{
	int cnt = 0;
	public void inc()
	{
		cnt++;
		System.out.println(Thread.currentThread().getName()+"->"+cnt);
	}
}
class demo implements Runnable
{
	Counter d;
	public demo(Counter x) // constructor
	{
		this.d = x; //(Counter) d = c (Counter)
	}
	public void run()
	{
		for(int i = 1;i<=5;i++) //runs 5 times
		{
			d.inc();
		}
		
	}
}
class p27
{
	public static void main(String arg[])
	{
		Counter c = new Counter(); // shared object of counter
		demo d = new demo(c); // demo(c) -> parameterized constructor is called with obj of counter as parameter
		Thread t1 = new Thread(d,"Thread 1"); // first thread using obj of demo
		Thread t2 = new Thread(d,"Thread 2"); // second thread using obj of demo
		//Thread t3 = new Thread(new demo(c),"Thread 3");
		t1.start();
		t2.start();
		//t3.start();
	}
}