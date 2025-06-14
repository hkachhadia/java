/*final*/ class car
{
	/*final*/ String engine = "V12";
	/*final*/ void type()
	{
		System.out.println("supercar engine :"+engine);
	}
}
class copyCar extends car
{
	String engine = "V6";
	void type()
	{
		System.out.println("supercar engine :"+engine);
	}
}
class p18
{
	public static void main(String arg[])
	{
		copyCar obj1 = new copyCar();
		obj1.type();
	}
}