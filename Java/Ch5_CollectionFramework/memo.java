package collection_framework;

import java.io.*;
import java.util.*;
public class memo {

	public static void main(String[] args) {
		System.out.println("���ܸ޸���");
		System.out.print("������ ���ϸ�:");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.next();
		System.out.println("������ ������ ���ο� x�Է�");
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new FileWriter("c://workspace/"+filename));
			String s;
			while(!(s = reader.readLine()).equals("x")) {writer.write(s+"\r\n");}
			reader.close();
			writer.close();
			scanner.close();
		}catch(Exception e) {e.printStackTrace();}
		System.out.println(filename + "���� �Ϸ� ���α׷� ����");

	}

}
