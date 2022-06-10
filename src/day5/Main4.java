package day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4 {

	public static void main(String[] args) throws Exception{
		/*
		 * 2. 대소문자 변환 설명
		 * 
		 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
		 * 
		 * 입력 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
		 * 
		 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
		 *
		 * 출력 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
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
		
		// 문자열을 char 배열로 만들어주는 메소드 toCharArray()
		// char가 대문자인지 소문자인지 확인 Character.isUpperCase(char문자), Character.isLowerCase(char문자)
		// true , false로 결과 출력된다.
		
		
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