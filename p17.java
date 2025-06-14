class parent
{
	parent()
	{
		int x = 100;
		System.out.println(x);
	}
	String who = "parent";
}
class child extends parent
{
	child()
	{
		super();
		
	}
	void display_who()
	{
		String who = "child";
		System.out.println(who);
		System.out.println(super.who);
	}
	
}
class p17
{
	public static void main(String arg[])
	{
		child c = new child();
		c.display_who();
		
	}
}