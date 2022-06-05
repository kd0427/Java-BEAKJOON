package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		/**
		 * ���� ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		 * 
		 * ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������
		 * ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.
		 * 
		 * �Է� ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
		 * 
		 * ��� ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.
		 * 
		 */

		int year;

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			year = Integer.parseInt(br.readLine());

			if (year >= 1 && year <= 4000) {
				break;
			} else {
				System.out.println("1�̻�  4000������ �ڿ����� �Է��ϼ���.");
			}
		}

		if (year % 4 == 0 && !(year % 100 == 0)) {
			System.out.println("1");
		} else if (year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
