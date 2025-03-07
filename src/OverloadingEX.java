class Base{
	int Sum(int a, int b) {
		System.out.print("a+b=");
		return a+b;
	}
	int Sum(int a, int b,int c) {
		System.out.print("a+b+c=");
		return a+b+c;
	}
}
class Derived extends Base{
	int Sum(int a,int b,int c,int d) {
		System.out.print("a+b+c+d=");
		return a+b+c+d;
	}
	int Sum(int a,int b,int c,int d,int e) {
		System.out.print("a+b+c+d+e=");
		return a+b+c+d+e;
	}
}
public class OverloadingEX {
	public static void main(String[] args) {
		Base obj=new Base();
		Derived objD=new Derived();
		System.out.println(objD.Sum(1,2));
		System.out.println(objD.Sum(1,2,3));
		System.out.println(objD.Sum(1, 2, 3, 4));
		System.out.println(objD.Sum(1, 2, 3, 4,5));
		}
	}