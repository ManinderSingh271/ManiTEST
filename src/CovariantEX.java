class A{
	A print() {
		System.out.println("Print A");
		return new A();
	}
}

class B extends A{
	A print() {
		System.out.println("Print B");
		return new B();
	}
}

class C extends B{
	A print() {
		System.out.println("Print C");
		return new C();
	}
}
public class CovariantEX {
	public static void main(String[] args) {
		A objA=new A();
		objA.print();
		
		B objB=new B();
		objB.print();
		
		C objC=new C();
		objC.print();
	}
}
