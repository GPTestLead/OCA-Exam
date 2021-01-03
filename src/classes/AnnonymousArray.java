package classes;

public class AnnonymousArray {

	public static void main(String[] args) {
		
		sum(new int[] {10,20,30,40});  // annonymous array
		
		Object[] a = new Object[10];
		a[0]= new Object();
		a[1]= new String("Garvita");
		
		int[] a1 = {10,20,30,40};
		int[] b1 = {40,50};
		a1=b1;
		b1=a1;
		System.out.println(a1.length);
		System.out.println(b1.length);
		System.out.println(a1[0]);
		
		int[][]x = new int [3][2];
		x[0] = new int[4];
		
		//example
		int[] n1 = new int[3];
		int[] n2 = {10,20,30,40,50};
		n1=n2;
		for(int x1:n1)
		{
			System.out.println(x1+":");
		}
		
		int[][]n = new int [1][3];
		for(int i = 0; i< n.length;i++)
		{
			//
			
		}
		
				
	}

	public  static void sum(int[]x)
	{
		int total = 0;
		for (int x1:x)
		{
			total = total+x1;
		}
		System.out.println(total);
	}
}
