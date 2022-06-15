package day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		/*
		 *  ���ڿ��� �Է¹ް�
		 *  �Է¹��� ���ڿ����� a,e,i,o,u  ������ ���
		 *  
		 *  ������ �ϳ��� ������ ??? ���
		 *  
		 *  ù°�� n�� �Է¹ް�
		 *  n����ŭ ������ �Է¹���
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
