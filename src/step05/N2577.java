package step05;

import java.util.Scanner;

// �� ���� �ڿ����� �Է¹޾� ���� �������
// 0-9���� ���ڰ� ����� �������� ���

public class N2577 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int[] arr = new int[10];
		int multi = a * b * c;
		
		while (multi > 0) {
			arr[multi % 10]++;
			multi /= 10;    // multi = multi / 10
		}
		
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
}
