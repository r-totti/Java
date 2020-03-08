package Main;

import java.util.Scanner;

public class practice1Start {

	public static void main(String[] args) {
	    // 配列sの初期化
	    int[] s = new int[5];
	    System.out.println("整数を入力してください");
	    // 入力を10回受け付ける
	    try (Scanner scan1 = new Scanner(System.in);) {
	        for (int i = 0; i < s.length; i++) {
	            s[i] = scan1.nextInt();
	        }

	        System.out.println("結果");

	        for (int i = s.length; i > 0; i--) {
	            System.out.println(s[i - 1]);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
