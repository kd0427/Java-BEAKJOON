package day3;

public class Main2 {

	
		/**
		 * �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False��
		 * return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ����
		 * �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
		 * 
		 * ���� ��� s�� "pPoooyY"�� true�� return�ϰ� "Pyy"��� false�� return�մϴ�.
		 * 
		 * ���ѻ��� ���ڿ� s�� ���� : 50 ������ �ڿ��� ���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�. ����� �� s answer "pPoooyY"
		 * true "Pyy" false
		 */
	boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;

        s = s.toUpperCase();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P') {
                countP++;
            } else if (s.charAt(i) == 'Y') {
                countY++;
            }
        }       
        
        if (countP == countY) {
            answer = true;
        } else if (countP != countY) {
            answer = false;
        }

        return answer;
    }
		


}
