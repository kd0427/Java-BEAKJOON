package day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) throws Exception{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int nan[] = new int[n];
		
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			for(int i =0;i<n;i++){
				nan[i] = Integer.parseInt(st.nextToken());
			}
			
			int first = nan[0];
			int cnt = 1;
			
			Arrays.sort(nan);
			
			for(int i : nan){
				if(first<i){
					cnt++;
				}
				first = i;
			}
			
			if(cnt>=3){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

	}

}
