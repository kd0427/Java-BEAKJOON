package day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws Exception{
		
		/*
		 * ���ڿ��� �Է¹ް�
		 * ���ڿ� �ȿ� ����1 , �빮�� I , �ҹ���l(��) , ��ȣ | �� ���
		 * �ִ��� ���� ���� ��� �Ͻÿ�.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int cnt1=0;
		int cnt2=0;
		int cnt3=0;
		int cnt4=0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='1'){
					cnt1++;
			}else if(s.charAt(i)=='I'){
					cnt2++;
			}else if(s.charAt(i)=='l'){
					cnt3++;
			}else if(s.charAt(i)=='|'){
					cnt4++;
			}
		}
		
		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
		System.out.println(cnt4);
		

	}

}
