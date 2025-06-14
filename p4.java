class p4
{
	int x;
	void compare(p4 obj)
	{
		if(this.x == obj.x)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
	public static void main(String arg[])
	{
		p4 obj1 = new p4();
		p4 obj2 = new p4();
		obj1.x = 50;
		obj2.x = 51;
		obj1.compare(obj2);
	}
}