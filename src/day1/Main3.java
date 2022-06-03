package day1;

import javax.swing.JOptionPane;

public class Main3 {

	public static void main(String[] args) {
		int score;
		
		while(true) {
			score = Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요."));
			
			if(score >=0 && score <=100) {
				break;
			}else {
				System.out.println("0~100사이의 수를 입력하세요.");
			}
		}
		
		if(score >=90 && score <=100) {
			System.out.println("A");
		}else if(score >=80 && score <=89) {
			System.out.println("B");
		}else if(score >=70 && score <=79) {
			System.out.println("C");
		}else if(score >=60 && score <=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
	
	}
}
