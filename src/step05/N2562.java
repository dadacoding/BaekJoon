package step05;

import java.util.Scanner;

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
