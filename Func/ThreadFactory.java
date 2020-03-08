package Func;

public class ThreadFactory extends Thread {

	String threadName;
	int counter;

	/** コンストラクタ*/
	public ThreadFactory(String name) {
		this.threadName = name;
		counter = 0;

	}

	@Override
	public void run() {

		System.out.println("Thread : " + threadName + " Start");

		while(counter <10000){
//			System.out.println("Thread : " + threadName + " Count : " + counter);
			counter++;
		}

		System.out.println("Thread : " + threadName + " Count : 1000 yeah!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}


}



