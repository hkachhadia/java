import java.io.*;
class p34 extends Exception
{
	public static void main(String arg[])
	{
	try
	{
		try (FileInputStream fis = new FileInputStream("p34input.txt")) {
			try (FileOutputStream fos = new FileOutputStream("p34output.txt")) {
				byte b[] = new byte[1024];  
				int n; 
				while((n = fis.read(b))!=-1)
				{
					fos.write(b,0,n);
				}
			}
		}
		
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	}
}