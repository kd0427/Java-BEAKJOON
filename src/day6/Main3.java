package day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a[] = new int[n+2];
		
		a[0]=0;
		a[1]=1;
		
		for(int i=0; i<n-2;i++) {
			a[i+2] = a[i]+a[i+1];
		}
		
		int result = 4*a[n] +2*a[n-1];
	}

}
