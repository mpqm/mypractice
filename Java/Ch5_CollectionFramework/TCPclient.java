package collection_framework;

import java.io.*;
import java.net.*;

public class TCPclient {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 5000);
			System.out.println("Ŭ���̾�Ʈ ����");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			pw.println("�ȳ��ϼ���? Ŭ���̾�Ʈ �Դϴ�.");
			pw.close();
			s.close();
			System.out.println("Ŭ���̾�Ʈ ����");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
