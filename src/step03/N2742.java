package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력

public class N2742 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = num ; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
