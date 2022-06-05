package day2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		/**
		 * <369 게임> 3,6,9 가 포함된 숫자가 되면 박수를 치는 게임이다. 해당 숫자에 3,6,9가 들어간 개수만큼 박수를 쳐야한다. ex)
		 * 33, 36 이면 박수 2번
		 * 
		 * 숫자 n이 주어졌을 때, n 이전까지 박수를 친 횟수를 구해라.
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
