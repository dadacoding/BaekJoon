package step05;

import java.util.Scanner;

// 세 개의 자연수를 입력받아 곱한 결과에서
// 0-9까지 숫자가 몇번씩 쓰였는지 출력

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
