package ch4_library;

import java.util.Scanner;

public class system {

	public static void main(String[] args) {
		//3. System
		//System Ŭ������ static InputStream in, static PrintStream out, static PrintStream err�ʵ带 ����
		System.out.println("test");
		Scanner scanner = new Scanner(System.in);
		//System.exit(0);
		System.out.println("ȯ�溯�� PATH: " + System.getenv("PATH"));
		System.setProperty("user", "ȫ�浿");
		System.out.println("user �Ӽ���: " + System.getProperty("user"));
		System.out.println("�����Ϸ��� x�� ��������!");		
		while(true) {
			if(scanner.next().equals("x")) {
				System.out.println("���α׷� ������");
				System.exit(0);
			}
			else System.out.println("�ٽ� �Է��ϼ���");
		}
	}
}
