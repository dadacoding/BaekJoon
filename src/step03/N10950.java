package step03;

import java.util.Scanner;

public class N10950 {
	public static void main(String[] args) {
		
		//�� �迭 ���Ҹ��� �Է¹��� a,b�� �����־� i��° �迭�� ����
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int arr[] = new int [num];
		
		for(int i = 0; i < num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			arr[i] = a + b;
		}
		scan.close();
		
		//for-each���� (���ӵ� �����͵��� ���������� ��ȸ�ϴ� ����)
		//arr�� �Ҵ�� �������� ���������� ��ȸ
		for(int c : arr) {
			System.out.println(c);
		}
	}
}
