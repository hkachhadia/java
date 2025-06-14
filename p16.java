class parent
{
	int x = 10;
	void override()
	{
		System.out.println("parent override x : "+x);
	}
}

class child extends parent
{
	void override()
	{
		System.out.println("child override x : "+x);
	}
}
class p16
{
	public static void main(String arg[])
	{
		parent p = new parent();
		child c = new child();
		p.override();
		c.x = 20;
		c.override();
	}
}
