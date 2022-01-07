package step05;

import java.util.Scanner;

// 9개의 서로 다른 자연수가 주어질 때,
// 이들 중 최댓값 찾고, 그 최댓값이 몇 번째 수인지 구하기

public class N2562 {
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		int[] arr = { x.nextInt(), x.nextInt(), x.nextInt(),
					  x.nextInt(), x.nextInt(), x.nextInt(),
					  x.nextInt(), x.nextInt(), x.nextInt() };
		
		x.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
        
		for(int value : arr) {
			count++;
            
			if(value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.print(max + "\n" + index);
		
	}
}
