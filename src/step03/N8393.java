package step03;

import java.util.Scanner;

public class N8393 {
	public static void main(String[] args) {
		
		//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
