package day3;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		/**
		 * ���� ��� ���׿� �����ִ� ���� �� n �� ���� �ڽ��� ������ ��� ���� �Ѱ�⾿ ġ��� �Ѵ� �� �� ������ ���������� ġ������� �����
		 * ���� ���ض�
		 * 
		 * �Է� ���׿� �����ϴ� ���� ��
		 * 
		 * ��� ���׿��� ġ��� ���� ����� ��
		 */

		int n = 0, m = 0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		// n*(n+1)/2 �հ���
		m = (n - 1) * (n) / 2;

		System.out.println(m);
	}
}
