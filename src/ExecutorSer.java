import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorSer {
	public static void main(String[] args) throws Exception{
		//	ExecutorService executor=Executors.newSingleThreadExecutor();
		//	ExecutorService executor=Executors.newFixedThreadPool(3); //limit the number of threads that are used to execute tasks
		//ExecutorService executor=Executors.newCachedThreadPool();   //dynamically adjust the number of threads to handle the workload. 
		//used for short-lived asynchronous tasks
		ExecutorService executor=Executors.newFixedThreadPool(2);
		//executor.submit(()->
		//	System.out.println("Task 1"));
		for(int i=0;i<5;i++) {
			executor.submit(()->
			System.out.println("Task 1-->"+Thread.currentThread().getName()));
		}
		for(int i=0;i<5;i++) {
			executor.submit(()->
			System.out.println("Task 2-->"+Thread.currentThread().getName()));
		}
		//executor.shutdown();

		/* To run after a certain delay, or to run repeatedly at a fixed interval. This is useful for tasks that need to be run periodically or on a schedule.
		ScheduledExecutorService executor1 = Executors.newScheduledThreadPool(2);
		// Schedule a task to run after 3 seconds
		((ScheduledExecutorService) executor1).schedule(() -> System.out.println("Task executed after 3 seconds"), 3, TimeUnit.SECONDS);
		// Schedule a task to run repeatedly every 1 second
		((ScheduledExecutorService) executor1).scheduleAtFixedRate(() -> System.out.println("Task executed every 1 second"), 0, 1, TimeUnit.SECONDS);

		 */

		//		Future<Integer> future=executor.submit(new Callable<Integer>() {
		//			public Integer call() throws Exception{
		//				Thread.sleep(5000);
		//				return 42;
		//			}
		//		});
		//		System.out.println("Other tasks running...");
		//        int result = future.get();
		//        System.out.println("Computation result: " + result);
		//		System.out.println(future.get());
		//        executor.shutdown();
		Future future=executor.submit(new Runnable() {
			public void run(){
				System.out.println("The ExecutorService.");
			}
		});
		System.out.println("Other tasks running...");
		System.out.println("future.get()  "+future.get());  //null means success
		executor.shutdown();
	}
}
