package p11; 
public class parent
{
	static int p = 10;
	static public int q = 20;
	static private int r = 30;
	static protected int s = 40;
	
	public static void main(String arg[])
	{
		System.out.println("default = "+p);
		System.out.println("public = "+q);
		System.out.println("private = "+r);
		System.out.println("protected = "+s);
	}
}

//compile -> javac -d . filename.java
//run -> java packagename/classname