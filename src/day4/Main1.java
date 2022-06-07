package day4;

public class Main1 {

	public static void main(String[] args) {
		/**
		 * 메인 메소드 작성하기(how to code a main method)
		 * 
		 * psvm + enter public static void main(String[] args){} 를 자동으로 작성해준다.
		 * 
		 * Scanner 추가하기 (사용자 키보드로 입력받는 도구)
		 * 
		 * Scanner sc = new Scanner(System.in) int a = sc.nextInt(); 우리가 마트에서 바코드를 찍으면 그
		 * 바코드의 상품코드 ex)12345678 가 포스기에 찍히듯이,
		 * 
		 * 자바에서 스캐너라는것을 통해 사용자가 키보드로 문자나 숫자를 입력하고 엔터를 치면 그 정보를 변수에 저장할 수 있다.
		 * 
		 * Scanner를 사용하기 위해서는
		 * 
		 * import java.util.Scanner;
		 * 
		 * 를 클래스 상단에 추가시켜주고, 스캐너의 이름을 sc로 붙여준다.(일반적으로 sc를 많이씀)
		 * 
		 * 그리고 저장할 변수 a에 = 을붙이고 sc 스캐너이름 뒤에 . 을 붙이면 nextLine, nextInt, next0000등 어떤걸
		 * 입력받을지
		 * 
		 * 골라서 붙여주면 된다.
		 * 
		
		 * 조건 연산자
		 * 
		 * a = (x>y) ? x: y; (x>y) 가 참이면 x를 반환하고, 거짓이면 y를 반환한다.
		 * 
		 * 기초는 이정도로하고 다음글부턴 자료구조로 넘어간다.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 문자열 자르기
		 *
		 * String s = "hello world!"; s.substring(3,5); // 3하고 4까지 출력 lo 만 나옴
		 * 
		 * 그럼 , 나 스페이스로 구분된걸 짤라서 각각 자른걸 배열에 넣는법은 ?
		 * Split 을 사용한다.
		 * 
		 * String s="apple,kiwi,good,no,pu"; String[] ss = s.split(",");
		 */

	}

}
