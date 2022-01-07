package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 첫 줄에 테스트케이스 개수가 주어진다.
// 각 테스트케이스마다 더한 값을 한 줄에 하나씩 순서대로 출력한다.

public class N15552 {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < X; i++) {
			//문자열 분리를 위해 매 반복마다 StringTokenizer을 생성
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();
		
		bw.flush(); //버퍼 비우고
		bw.close(); //버퍼 닫아주기
	}
}

//입출력방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다.
//Java에서는 Scanner와 System.out.println대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
//테스트 케이스가 많으면 StringBuilder 나 BufferedWriter만 사용해주어도 시간이 많이 단축된다.
//BufferedWriter.flush는 맨 마지막에 한번만 하면 된다.
//BufferedWriter 외에도, StringBuilder로 출력을 모아 놓았다가 그 String을 System.out.println하는 방법도 있다.
