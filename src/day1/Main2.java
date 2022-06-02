package day1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a > 0 && b < 10) {
				System.out.println(a + b);
				break;
			} else {
				System.out.println("a는 0보다 크고 b는 10보다 작은 수만 입력가능 합니다.");
			}
		}
	}

}
