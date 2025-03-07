class Calculator extends Thread{
	long sumHundred;
	long sumThousand;
	
	public void run() {
		synchronized(this) {
			calculateSumUptoHundred();
			notify();
		}
		calculateSumUptoThousand();
	}
	private void calculateSumUptoHundred() {
		for(int i=0;i<100;i++) {
			sumHundred +=i;
		}
		System.out.println("calculateSumUpto Hundred done."+sumHundred);
	}
	private void calculateSumUptoThousand() {
		for(int i=0;i<1000;i++) {
			sumThousand +=i;
		}
		System.out.println("calculateSumUpto Thousand done."+sumThousand);
	}
}
public class WaitAndNotifyEx {
	public static void main(String[] args) throws InterruptedException{
		Calculator thread=new Calculator();
		synchronized(thread) {
			thread.start();
			thread.wait();
		}
		System.out.println(thread.sumHundred);
	}
}
