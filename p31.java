class A
{
	synchronized void foo(B b)
	{
		Thread t = Thread.currentThread();
		System.out.println("Inside" + t.getName());
		try
		{
			System.out.println("Before call b.test");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//solution of deadlock condition
		/*try
		{
			wait(1);x
			notify();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		b.last();
	}
	synchronized void last()
	{
		System.out.println("Inside a.test");
		System.out.println("complete a.test");
	}
}
class B
{
	synchronized void bar(A a)
	{
		Thread t = Thread.currentThread();
		System.out.println("Inside"+t.getName());
		try
		{
			System.out.println("Before call a.test");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		a.last();
	}
	synchronized void last()
	{
		System.out.println("Inside b.test");
		System.out.println("complete b.test");
	}
	
}
class Deadlock implements Runnable 
{
	A a = new A();
	B b = new B();
	Deadlock() 
	{
		Thread.currentThread().setName("MainThread");
		Thread t = new Thread(this, "RacingThread");
		t.start();
		a.foo(b); // get lock on a in this thread.
		System.out.println("Back in main thread");
	}
	public void run() 
	{
		b.bar(a); // get lock on b in other thread.
		System.out.println("Back in other thread");
	}
	public static void main(String args[]) 
	{
	new Deadlock();
	}
}