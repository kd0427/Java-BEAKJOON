package day2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		/**
		 *  진우 100 선우100
		 *  첫째날 반을 진우가 줌
		 *  둘째날 반을 선우가줌
		 *  반으로 못나누면  통재로줌
		 *  n번째날 식량 출력
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
		System.out.println(n+"번째 날의 진우의 식량은 "+j+" , 선우의 식량은 "+s+"입니다.");
	}

}
