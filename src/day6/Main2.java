package day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int z=1;
		for(int i =1; i<=a;i++){
			
			for(int j=1; j<=b;j++){
				if(i%2!=0){
					System.out.print("#");
				}else{
					System.out.println(z);
					if(z%2!=0 && j==b){
						System.out.print("#");
					}else if(z%2==0 && j==1){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
			}
			
			if(i%2==0) {
				z++;
			}
			
			System.out.println();

		}
	}

}
