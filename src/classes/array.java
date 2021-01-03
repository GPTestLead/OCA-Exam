package classes;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x;
		int []y;
		int z[];
		int a [];
		int [] []a1, b[];
		//int []a,[]b1;
		//int[5] x1;   time of declration u can not assign value
		
		int[] x1 = new int[4] ;
		System.out.println(x1.getClass().getName());
		
		int[][] x2 = new int [5][3];
		System.out.println(x2.getClass().getName());
		
		boolean []b1 = new boolean[3];
		System.out.println(b1.getClass().getName());
		
		byte [] b2 = new byte[3];
		System.out.println(b2.getClass().getName());
		
		//int []x=new int[];
		//System.out.println();
		int [] x5= new int[0];
		//int [] x6 = new int[-5];
		int [] x7 = new int ['a'];
		int [] x8 = new int [(int) 5.5];
		double [] x9 = new double [(int) 3.5];
		//double [] x10 = new double [2147483647];
		//int r1 = null;
		String string = null;
		//int [][][] x11= new int [3][][2];
		//System.out.println(x6);
		int[] w = new int[3];
		System.out.println(w[0]);
		System.out.println(w[1]);
		System.out.println(w[2]);
		System.out.println(w);
		//System.out.println(w[3]);
		System.out.println(w.toString());
		int[][] w1 = new int[3][2];
		System.out.println(w1);
		System.out.println(w1[0][0]);
		System.out.println(w1[0][1]);
		//System.out.println(w1[0][2]);
		System.out.println(w1[0][1]);
		System.out.println(w1[1][1]);
		System.out.println(w1[2][1]);
		int[] y1 = {10,20,30};
		System.out.println(y1);
//		System.out.println(y1[0]);
//		System.out.println(y1[1]);
//		System.out.println(y1[2]);
//		int[] y2;
//		y2= {10,20,30};
		int[][] y3 = {{10,20,30},{40,50}};
		System.out.println(y3[0][1]);  //20
		System.out.println(y3[0][0]);  //10
		System.out.println(y3[0][2]);   //30
		System.out.println(y3[1][0]);    //40
		System.out.println(y3[1][1]);   //50
		//System.out.println(y3[1][2]);   //50
		
		int[] y4 = new int[3];
		System.out.println(y4.length);
		//System.out.println(y4.length());
		String string2 = "Garvita";
		System.out.println(string2.length());
		
		String[] s1 = {"a","aa","aaa"};
		System.out.println(s1.length); // for array
		//System.out.println(s1[0].length);  

		System.out.println(s1[0].length());
		
		int[][] r1 = new int [3][2];
		System.out.println(r1.length);  //3
		System.out.println(r1[0].length);  //2
}
}
