class p10
{
	static void array(int a[],int i)
	{
		if(i<5)
		{
			System.out.println(a[i]);
			array(a,++i);
		}
		
	}
	public static void main(String arg[])
	{
		int a[] = {1,2,3,4,5};
		array(a,0);
	}
}