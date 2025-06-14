import java.io.*;
class stream
{
	public static void main(String arg[])
	throws IOException
	{
		char c;
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the line of text: ");
		System.out.println("Enter 'stop' to quit: ");
		/*do
		{
			c =  inp.readLine();
			System.out.println(c);
			
		}while(!c.equals('s'));*/
		c =  (char) inp.read();
		System.out.println(c);
			
	}
}