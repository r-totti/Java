package Func;

public class MultiThreadControllerSynchronized {


	/** コンストラクタ*/
	public MultiThreadControllerSynchronized() {
		this.init();
	}

	/** 初期処理*/
	public void init() {

	}


	/** マルチスレッド実行*/
	public void job(int thread) {

		ThreadFactorySynchronized thFac = new ThreadFactorySynchronized();

		for (int i=0; i < thread; i++) {
			thFac.run(String.valueOf(i + 1));
		}

	}


}



