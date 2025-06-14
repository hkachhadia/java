class p6
{
	int x;
	void update(p6 obj)
	{
		obj.x = 100; //overlap
	}
	
	public static void main(String arg[])
	{
		p6 obj1 = new p6();
		obj1.x = 5;
		System.out.println("Before call by reference :"+obj1.x); //5
		obj1.update(obj1);
		System.out.println("After call by reference :"+obj1.x);
	}
}