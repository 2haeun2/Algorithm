package java2;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//�Է°��� String�� ���� sNum�� ������ �� char[]�� ������ ��ȯ�ϱ�
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		for (int i =0; i < cNum.length; i++) {
			sum += cNum[i] - '0';//cNum[i]�� ���������� ��ȯ�ϸ鼭 sum�� ���Ͽ� �����ϱ�
		}
		System.out.println(sum);
		
		
	
	}
}

