package step05;

import java.util.HashSet;
import java.util.Scanner;

// �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
// �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ�

public class N3052 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			h.add(scan.nextInt() % 42);
		}
		
		scan.close();
		System.out.println(h.size());
		
	}
}
