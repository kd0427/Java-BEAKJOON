package day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4 {

	public static void main(String[] args) throws Exception{
		/*
		 * 2. ��ҹ��� ��ȯ ����
		 * 
		 * �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 * �Է� ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
		 * 
		 * ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
		 *
		 * ��� ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String result = "";
//		for(int i=0; i < str.length(); i++) {
//			
//			int num = str.charAt(i);
//			
//			if(num>=65 && num<=90) {
//				result += Character.toLowerCase(str.charAt(i))+"";
//				
//			}else if(num>=97 && num<=122) {
//				result += Character.toUpperCase(str.charAt(i))+"";
//			}
//		}
		
		// ���ڿ��� char �迭�� ������ִ� �޼ҵ� toCharArray()
		// char�� �빮������ �ҹ������� Ȯ�� Character.isUpperCase(char����), Character.isLowerCase(char����)
		// true , false�� ��� ��µȴ�.
		
		
		for(char x : str.toCharArray()) {
			
			if(Character.isLowerCase(x)) {
				result += Character.toUpperCase(x)+"";
			}else if(Character.isUpperCase(x)) {
				result += Character.toLowerCase(x)+"";
			}
		}
		
		
		
		System.out.println(result);
		

	}

}