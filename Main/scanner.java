package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class scanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ary = new ArrayList<>();

		int num = Integer.parseInt(sc.nextLine());

		for (int i =0; i < num; i++) {
			String word = sc.nextLine();
			ary.add(word);
		}

		System.out.println(ary);

	}

}
