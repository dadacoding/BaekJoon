package step03;

import java.util.Scanner;

// N�� �Է� ���� ��, ������ N���� ����ϴ� ���α׷�

public class N2739 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}
