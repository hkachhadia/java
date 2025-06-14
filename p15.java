// import p11.parent;

class parent
{
	protected int x;
	void parent_Method()
	{
		System.out.println("parent method");
	}
}

class child extends parent
{
	void child_method()
	{
		System.out.println("child method x : "+x);
	}
}
class p15
{
	public static void main(String arg[])
	{
		parent p = new parent();
		child c = new child();
		p.parent_Method();
		c.x = 20;
		c.child_method();
	}
}