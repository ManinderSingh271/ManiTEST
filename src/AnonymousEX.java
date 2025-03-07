/*
 * It is an inner class without a name and for which only a single object is created. 
 * An anonymous inner class can be useful when making an instance of an object with certain “extras” such as overriding methods 
 * of a class or interface, without having to actually subclass a class
 */
public class AnonymousEX {
	public static void main(String[] args) {
		Thread t=new Thread() {
			public void run() {
				System.out.println("run method implemented as Anonymous class using \"Thread\" class");
				newMethod();
			}
			public void newMethod() {
				System.out.println("newMethod");
			}
		};
		t.start();

		Runnable r=new Runnable() {
			public void run() {
				System.out.println("run method implemented as Anonymous class using \"Runnbale\" interface");
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		
		Thread t2=new Thread(new Runnable() {
			public void run() {
				System.out.println("run method implemented as Anonymous class using \"as Argument\" ");
			}
		});
		t2.start();
	}
}
