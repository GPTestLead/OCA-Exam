package classes;





public class variables {
 
	int x = 10;
	static int y = 20;
	
	public static void main(String[] args) {
		
		variables vs = null;
		System.out.println(vs.y);
		//System.out.println(vs.x);
		
		int z =10;
		System.out.println("done with lunch");
		//System.out.println(z);
		
		int y;
		if(args.length>0)
		{
			y=10;
		}
		else
		{
			y=20;
		}
		System.out.println(y);
	}

}
