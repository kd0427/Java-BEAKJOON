package day2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		/**
		 *  ���� 100 ����100
		 *  ù°�� ���� ���찡 ��
		 *  ��°�� ���� ���찡��
		 *  ������ ��������  �������
		 *  n��°�� �ķ� ���
		 *  
		 */
		int j = 100;
		int s = 100;
		int n;
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				if(!(s%2==0)) {
					s = (s-1)/2;
					j = j + s + 1;
				}else {
					s = s/2;
					j = j + s;
				}
				
			}else {
				if(!(j%2==0)) {
					j = (j-1)/2;
					s = s+j+1;
				}else {
					j = j/2;
					s = s+j;
				}
			
			}
		}
		System.out.println(n+"��° ���� ������ �ķ��� "+j+" , ������ �ķ��� "+s+"�Դϴ�.");
	}

}
