
public class ClassLevelLocking implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock();
	}
	
	public void lock() {
		System.out.println("CLASS Level Locking---->>>>>>: "+Thread.currentThread().getName());
		
		synchronized (ClassLevelLocking.class) {
			System.out.println("Starting thread:"+Thread.currentThread().getName());
			System.out.println("Ending thread:"+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		ClassLevelLocking obj=new ClassLevelLocking();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		ClassLevelLocking obj2=new ClassLevelLocking();
		Thread t3=new Thread(obj2);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}
}
