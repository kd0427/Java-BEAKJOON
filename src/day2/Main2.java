package day2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		/**
		 * <369 ����> 3,6,9 �� ���Ե� ���ڰ� �Ǹ� �ڼ��� ġ�� �����̴�. �ش� ���ڿ� 3,6,9�� �� ������ŭ �ڼ��� �ľ��Ѵ�. ex)
		 * 33, 36 �̸� �ڼ� 2��
		 * 
		 * ���� n�� �־����� ��, n �������� �ڼ��� ģ Ƚ���� ���ض�.
		 */
		
		int n;
		int cnt=0;
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i =1; i<n; i++) {
			int j =i;
			while(j>0) {
				if(j%10==3 || j%10==6 || j%10==9) {
					cnt++;
				}
				j=j/10;
			}
				
		}
		System.out.println(cnt);
		
		

	}

}
