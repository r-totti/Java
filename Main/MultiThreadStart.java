package Main;

import java.io.IOException;

import Func.MultiThreadControllerSynchronized;

public class MultiThreadStart {

	public static void main(String[] args) {
//		int threadCount = Integer.parseInt(args[0]);

		java.io.BufferedReader in =
		 new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		String line = "0";
		try {
			line = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}


//		MultiThreadController control = new MultiThreadController();
		MultiThreadControllerSynchronized control = new MultiThreadControllerSynchronized();
		control.job(Integer.parseInt(line));

	}

}
