//Java program to demonstrate use of Class Variable/static variables
public class GFG {
	public static int ctr=0;
	public GFG() {
		ctr++;
	}
	public void finalize() {
		System.out.println("Finalize method just before garbage collection to do clean up activities.");
	}
	//overloaded main method
	public static void main(int x) {
		System.out.println("Overloaded main method x="+x);
	}
	public static void main(String[] args) {
		GFG s1=new GFG();
		GFG s2=new GFG();
		GFG s3=new GFG();
		s3=null;  // set object reference to null s3=null; to check Garbage Collection
		System.out.println("Number of objects created "+GFG.ctr);
		//System.err.println("Testing error message using System.err");

		main(50);
		
		System.gc();  // set object reference to null s3=null; to check Garbage Collection
		System.out.println("END");
		Number[]  ar=new Double[2];
		//ar[3]=0;    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
		//ar[0]=new Integer(5);  //Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
		
		/*
		 *
		final int a=100;
		a=50;  //compile time error
		
		*/
		
		
	}
}


/*
//Java program to demonstrate use of Clas Variable
class GFG {
 public static int ctr = 0;
 public GFG() { ctr++; }
 public static void main(String[] args)
 {
     GFG obj1 = new GFG();
     GFG obj2 = new GFG();
     GFG obj3 = new GFG();
     System.out.println("Number of objects created are "
                        + GFG.ctr);
 }
}
*/