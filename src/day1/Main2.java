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
				System.out.println("a�� 0���� ũ�� b�� 10���� ���� ���� �Է°��� �մϴ�.");
			}
		}
	}

}
