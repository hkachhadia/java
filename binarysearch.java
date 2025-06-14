import java.util.Scanner;
class binarysearch
{
	static int binarysearch1(int a[],int target,int n)
	{
		int st = 0, end = n-1;
		while(st<=end)
		{
			int mid = st + (end - st)/2;
			if(a[mid] == target){
				return mid;
			}
			else if(a[mid] < target){
				st = mid +1;
			}
			else if (a[mid] > target){
				end = mid -1;
			}
		}
		return -1;
	}
	public static void main(String arg[])
	{
		int a[] = new int[100];
		int target;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the length of the array: ");
			int n = sc.nextInt();
			System.out.println("Enter the elements of the array: ");
			for(int i = 0 ; i < n ; i++ )
			{
				System.out.print(i+" = ");
				a[i] = sc.nextInt();
			}
			System.out.println("Enter the target: ");
			target = sc.nextInt();
			int x = binarysearch1(a,target,n);
			System.out.println("your target is present at: "+x);
		}
		
		
	}
}