package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// ù �ٿ� �׽�Ʈ���̽� ������ �־�����.
// �� �׽�Ʈ���̽����� ���� ���� �� �ٿ� �ϳ��� ������� ����Ѵ�.

public class N15552 {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < X; i++) {
			//���ڿ� �и��� ���� �� �ݺ����� StringTokenizer�� ����
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();
		
		bw.flush(); //���� ����
		bw.close(); //���� �ݾ��ֱ�
	}
}

//����¹���� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִ�.
//Java������ Scanner�� System.out.println��� BufferedReader�� BufferedWriter�� ����� �� �ִ�.
//�׽�Ʈ ���̽��� ������ StringBuilder �� BufferedWriter�� ������־ �ð��� ���� ����ȴ�.
//BufferedWriter.flush�� �� �������� �ѹ��� �ϸ� �ȴ�.
//BufferedWriter �ܿ���, StringBuilder�� ����� ��� ���Ҵٰ� �� String�� System.out.println�ϴ� ����� �ִ�.
