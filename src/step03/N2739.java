package step03;

import java.util.Scanner;

// N을 입력 받은 뒤, 구구단 N단을 출력하는 프로그램

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
