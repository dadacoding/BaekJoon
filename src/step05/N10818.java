package step05;

import java.util.Arrays;
import java.util.Scanner;

// N개의 정수가 주어진다. 이 때의 최솟값, 최대값 구하기
public class N10818 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int[] arr = new int[x];
		
		for(int i = 0; i < x; i++) {
			arr[i] = scan.nextInt();
		}
		
		scan.close();
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[x-1]);
	}
}
