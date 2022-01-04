package step03;

import java.util.Scanner;

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
