
public class ObjectLevelLocking implements Runnable{
	public void run() {
		lock();
	}
	public void lock() {
		System.out.println("OBJECT Level Locking---->>>>>>: "+Thread.currentThread().getName());
		
		synchronized (this) {
			System.out.println("Starting Thread:"+Thread.currentThread().getName());
			System.out.println("Ending Thread:"+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ObjectLevelLocking obj=new ObjectLevelLocking();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		ObjectLevelLocking obj2=new ObjectLevelLocking();
		Thread t3=new Thread(obj2);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}
}
