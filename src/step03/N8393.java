package step03;

import java.util.Scanner;

// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램 작성

public class N8393 {
	public static void main(String[] args) {
		
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
