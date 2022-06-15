package day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		/*
		 *  문자열은 입력받고
		 *  입력받은 문자열에서 a,e,i,o,u  모음만 출력
		 *  
		 *  모음이 하나도 없으면 ??? 출력
		 *  
		 *  첫째줄 n을 입력받고
		 *  n개만큼 문장을 입력받음
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String result = "";
		
		String ggo[]= new  String[] {"a","e","i","o","u"};
		
		ArrayList<String> answer = new ArrayList<String>();
		
		for(int i =0;i<n;i++) {
			result="";
			String a = br.readLine();
			for(int j=0; j<a.length();j++) {
				for(String p : ggo) {
					if(((a.charAt(j)+"").toLowerCase()).equals(p)) {
						result +=(a.charAt(j)+"");
					}
				}
			}
			if(result=="") {
				answer.add("???");
			}else {
				answer.add(result);
			}
		}
		
		for(String a : answer) {
			System.out.println(a);
		}
		
	}

}
