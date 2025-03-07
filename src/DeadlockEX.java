class Shared{
	/*void method1() {
		synchronized (Integer.class) {
			System.out.println("Acquiring Integer Lock.");
			
			synchronized (String.class) {
				System.out.println("Acquiring String Lock.");
			}
		}
	}

	void method2() {
		synchronized (String.class) {
			System.out.println("Acquiring String Lock.");
			
			synchronized (Integer.class) {
				System.out.println("Acquiring Integer Lock.");
			}
		}
	}
	*/
	
	synchronized void test1(Shared s) throws InterruptedException{
		System.out.println("Enter test1: "+Thread.currentThread().getName()+" "+this);
		Thread.sleep(1000);
		s.test2();
		System.out.println("Exit test1: "+Thread.currentThread().getName()+" "+this);
	}
	
	synchronized void test2() throws InterruptedException{
		System.out.println("Enter test2: "+Thread.currentThread().getName()+" "+this);
		Thread.sleep(1000);
		System.out.println("Exit test2: "+Thread.currentThread().getName()+" "+this);
	}
}

class Thread1 extends Thread{
	private Shared s1;
	private Shared s2;
	/**
	 * @param s1
	 * @param s2
	 */
	public Thread1(Shared s1, Shared s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}
	 public void run() {
		 try {
			s1.test1(s2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}

class Thread2 extends Thread{
	private Shared s1;
	private Shared s2;
	/**
	 * @param s1
	 * @param s2
	 */
	public Thread2(Shared s1, Shared s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}
	 public void run() {
		 try {
			s2.test1(s1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
public class DeadlockEX{
	public static void main(String[] args) {
		Shared s1=new Shared();
		Shared s2=new Shared();
		
		Thread1 t1=new Thread1(s1,s2);
		t1.setName("Thread1");
		t1.start();
		
		Thread2 t2=new Thread2(s1,s2);
		t2.setName("Thread2");
		t2.start();
		
		//System.out.println("Finished");
	}
}
