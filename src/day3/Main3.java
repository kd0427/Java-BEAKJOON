package day3;

public class Main3 {
	/**
	 * 
	 * String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�,
	 * solution�� �ϼ��ϼ���. seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
	 * 
	 * ���� ���� seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�. seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
	 * "Kim"�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�. ����� �� seoul return ["Jane", "Kim"] "�輭���� 1��
	 * �ִ�"
	 * 
	 */

	public String solution(String[] seoul) {

		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "�輭���� " + i + "�� �ִ�";
				break;
			}
		}
		return answer;
	}
}
