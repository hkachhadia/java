class p8
{
	int x;
	 p8 copy(p8 obj)
	{
		this.x = obj.x;
		return this;
	}
	public static void main(String arg[])
	{
		p8 obj1 = new p8();
		p8 obj2 = new p8();
		obj1.x = 10;
		obj2 = obj2.copy(obj1);
		System.out.println("object 1: "+obj1.x);
		System.out.println("object 2: "+obj2.x);
	}
}
