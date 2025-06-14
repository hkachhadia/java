class p14
{
	public static void main(String arg[])
	{
		if(arg.length>1)
		{
			int n = Integer.parseInt(arg[0]);
			if(arg[1].equalsIgnoreCase("meter"))
			{
				System.out.println(n*100 + "centimeter");
			}
			else
			{
				System.out.println(n/100 + "meter");
			}
		}
		else
		{
			System.out.println("java classname no centimeter/meter:");
		}
	}
}