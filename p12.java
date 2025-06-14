class abc
{
	static int x=5;
	static void sum(int a,int b)
	{
		int c = a+b;
		System.out.println("a+b="+c);
	}
	static void display()
	{
		System.out.println("x : "+x);
	}
}
class p12
{
	public static void main(String arg[])
	{
		abc.sum(2,3);
		abc.display();
		abc.x=456;
		abc.display();
	}
}