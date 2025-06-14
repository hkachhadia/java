interface X
{
	void show_A();
	void show_B();
}
abstract class demo implements X
{
	public void show_A()
	{
		System.out.println("This is A");
	}
}
class demo1 extends demo
{
	public void show_B()
	{
		System.out.println("This is B");
	}
}


class p21
{
	
	public static void main(String arg[])
	{
		demo1 d1 = new demo1();
		d1.show_A();
		d1.show_B();
	}
}