package day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws Exception {
		/*
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input," ");
		int gamer[] = new int[5];
		int cnt1=0;
		int cnt2=0;
		int cnt3=0;
		
		for(int i=0;i<5;i++){
			gamer[i] = Integer.parseInt(st.nextToken());
			
			if(gamer[i]==1){
				cnt1++;
			}else if(gamer[i]==2){
				cnt2++;
			}else if(gamer[i]==3){
				cnt3++;
			}
		}
		
		if(!(cnt1==0)&&!(cnt2==0)&&!(cnt3==0)){
			System.out.println("0");
		}else if(cnt1==0){
			System.out.println(cnt3);
		}else if(cnt2==0){
			System.out.println(cnt1);
		}else if(cnt3==0){
			System.out.println(cnt2);
		}else if(cnt1==5 || cnt2==5 || cnt3==5){
			System.out.println("0");
		}
		
		
	}

}
