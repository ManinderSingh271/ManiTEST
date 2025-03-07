// HAS TO VERIY YET


class Deadlock{
	void method1() {
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
}
class ThreadA extends Thread{
	private Deadlock d1;
	private Deadlock d2;
	
	
	/**
	 * @param d1
	 * @param d2
	 */
	public ThreadA(Deadlock d1, Deadlock d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Start ThreadA--"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			d1.method1();
			d2.method2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("End ThreadA--"+Thread.currentThread().getName());
	}
}

class ThreadB extends Thread{
	private Deadlock d1;
	private Deadlock d2;
	
	
	/**
	 * @param d1
	 * @param d2
	 */
	public ThreadB(Deadlock d1, Deadlock d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Start ThreadB--"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			d2.method1();
			d1.method2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End ThreadB--"+Thread.currentThread().getName());
	}
}	

public class DeadLockSimpleEX{
	public static void main(String[] args) {
		Deadlock obj1=new Deadlock();
		Deadlock obj2=new Deadlock();
		ThreadA t1=new ThreadA(obj1,obj2);
		t1.setName("Thread1");
		t1.start();
		ThreadB t2=new ThreadB(obj1,obj2);
		t2.setName("Thread1");
		t2.start();

	}
}

