package Func;

public class MultiThreadController {


	/** コンストラクタ*/
	public MultiThreadController() {
		this.init();
	}

	/** 初期処理*/
	public void init() {

	}


	/** マルチスレッド実行*/
	public void job(int thread) {

		for (int i=0; i < thread; i++) {
			ThreadFactory thFac = new ThreadFactory(String.valueOf(i + 1));
			thFac.start();
		}

	}


}



