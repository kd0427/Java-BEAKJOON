package day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws Exception {
		/*
		 * 1. ���� ã�� ����
		 * 
		 * �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
		 * 
		 * ��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
		 * 
		 * �Է� ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
		 * 
		 * ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
		 * 
		 * ��� ù �ٿ� �ش� ������ ������ ����Ѵ�.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String search = br.readLine();
		int cnt = 0;
		
		input = input.toLowerCase();
		search = search.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			if (search.equals((input.charAt(i)) + "")) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
