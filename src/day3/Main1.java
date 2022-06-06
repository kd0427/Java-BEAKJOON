package day3;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		/**
		 * 문제 요약 리그에 속해있는 팀의 수 n 각 팀은 자신을 제외한 모든 팀과 한경기씩 치뤄야 한다 이 때 스포츠 리그전에서 치루어지는 경기의
		 * 수를 구해라
		 * 
		 * 입력 리그에 참여하는 팀의 수
		 * 
		 * 출력 리그에서 치루어 지는 경기의 수
		 */

		int n = 0, m = 0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		// n*(n+1)/2 합공식
		m = (n - 1) * (n) / 2;

		System.out.println(m);
	}
}
