class outer 
{
	int x = 456;
	public void show()
	{
		System.out.println(x+" in show method of outer class");
	}
	
	class inner
	{
		public void display()
		{
			System.out.println(x+" in display method of inner class");
		}
	}
}
class p13
{
	public static void main(String arg[])
	{
		outer ob1  = new outer();
		ob1.show();
		outer.inner ob2 = ob1.new inner();
		ob2.display();
	}
}