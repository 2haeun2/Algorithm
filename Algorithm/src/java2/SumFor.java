package java2;

import java.util.Scanner;

//1���� n������ ���� ���� ���ϴ� �˰��� for��
public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� �� :");
		int n = sc.nextInt();
		
		int sum =0;    //��
		
		for (int i=1; i<=n; i++)
			
		sum += i;  //sum�� i�� ���մϴ�.
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
	}
}
