package java2;

import java.util.Scanner;

//1부터 n까지의 정수 합을 구하는 알고리즘 for문
public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 :");
		int n = sc.nextInt();
		
		int sum =0;    //합
		
		for (int i=1; i<=n; i++)
			
		sum += i;  //sum에 i를 더합니다.
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}
}
