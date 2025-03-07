
class OuterClass{
	private String out="OuterclassMemberData";
	void outerMethod() {
		System.out.println("--Outer Class method--");
	}
	class InnerClass{
		void innerMethod() {
			System.out.println("----Inner Class method----");
			outerMethod();
			System.out.println("Inner Class can access private member data/method --"+out);
		}
	}
}

class Demo{
	void demoMethod() {
		System.out.println("----Demo method----");
	}
	void anonymousExample() {
		System.out.println("----Demo anonymousExample----");
	}
}

public class InnerClasses {
	
	static Demo d1=new Demo() {
		void anonymousExample() {
			System.out.println("----anonymousExample----");
		}
	};
	
	public static void main(String[] args) {
		OuterClass.InnerClass obj=new OuterClass().new InnerClass();
		obj.innerMethod();
		
		
		Demo d=new Demo();
		d.demoMethod();
		
		d1.anonymousExample();
		
	}
}
