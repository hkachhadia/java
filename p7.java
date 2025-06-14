class p7
{  
	static void update(int a)
	{
		a = 100;
	}
	
	public static void main(String arg[])
	{
		int x = 5;
		System.out.println("Before call by value : "+x); //5
		update(x);
		System.out.println("After call by value : "+x); 
	}
}