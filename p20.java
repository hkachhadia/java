interface rectangle
{
	public int area_of_rect(int a,int b);
}
interface circle
{
	public double area_of_cir(double r);
}
class area implements rectangle,circle
{
	public int area_of_rect(int a,int b)
	{
		return a*b;
	}
	public double area_of_cir(double r)
	{
		return 3.14*r*r;
	}
}
class p20
{
	public static void main(String arg[])
	{
		area x = new area();
		System.out.println("Area of rectangle: "+x.area_of_rect(4,5));
		System.out.println("Area of circle: "+x.area_of_cir(5));
		
	}
}

