package day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
		
		char ggo[]= new  char[] {'a','e','i','o','u'};
		
		for(int i =0;i<n;i++) {
			
			String a = br.readLine();
			for(int j=0; j<a.length();j++) {
				if(a.charAt(j)==ggo[j]) {
					result+= ggo[j]+"";
				}
			}
			if(result=="") {
				System.out.println("???");
			}else {
				System.out.println(result);
			}
		}
		

		
	}

}
