package day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		/*
		 * 3. ���� �� �ܾ� ����
		 * 
		 * �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * ������� �� �ܾ�� �������� ���е˴ϴ�.
		 * �Է� ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
		 * ��� ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ��
		 * �ܾ ������ �մϴ�.
		 * 
		 * ���� �Է� 1
		 * it is time to study 
		 * ���� ��� 1
		 * study
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" "); 
		int num=0;
		String result = "";
		for(int i=0; i<str.length;i++) {
			
			if(num<str[i].length()) {
				num = str[i].length();
				result = str[i];
			}
		}
		System.out.println(result);
	}

}
