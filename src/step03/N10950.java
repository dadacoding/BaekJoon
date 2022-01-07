package step03;

import java.util.Scanner;

// 두 정수를 입력받아 두 값을 더한 값을 출력하는 프로그램

public class N10950 {
	public static void main(String[] args) {
		
		//각 배열 원소마다 입력받은 a,b를 더해주어 i번째 배열에 저장
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int arr[] = new int [num];
		
		for(int i = 0; i < num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			arr[i] = a + b;
		}
		scan.close();
		
		//for-each구문 (연속된 데이터들을 순차적으로 순회하는 구문)
		//arr의 할당된 공간들을 순차적으로 순회
		for(int c : arr) {
			System.out.println(c);
		}
	}
}
