import java.io.*;
class p32
{
	public static void main(String arg[])
	throws IOException
	{
		char c;
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the character: ");
		c =  (char) inp.read();
		System.out.println(c);
	}
}