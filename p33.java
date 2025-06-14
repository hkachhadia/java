import java.io.*;
class p33
{
	public static void main(String arg[])
	throws IOException
	{
		String c;
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the line of text: ");
		c =  inp.readLine();
		System.out.println(c);
	}  
}