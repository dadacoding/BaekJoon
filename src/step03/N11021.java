package step03;

import java.util.Scanner;

// 두 정수를 입력받은 다음, 더한 값을 출력하는 프로그램

public class N11021 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i = 1; i <= a; i++) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			System.out.println("Case #" + i + ":" + (b + c));
		}
		scan.close();
	}
}
