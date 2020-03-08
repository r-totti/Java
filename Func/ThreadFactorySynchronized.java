package Func;

public class ThreadFactorySynchronized {

	String threadName;
	int counter = 0;

	/** コンストラクタ*/
	public ThreadFactorySynchronized() {	}


	synchronized public void run(String threadName) {

		System.out.println("Thread : " + threadName + " Start");

		while(counter <10000){
//			System.out.println("Thread : " + threadName + " Count : " + counter);
			counter++;
		}

		System.out.println("Thread : " + threadName + " Count : 1000 yeah!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}


}
