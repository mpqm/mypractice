package collection_framework;

import java.io.*;

public class javaio3 {

	public static void main(String[] args) {
		//1. ���� ����� ����
		//���ϰ� ���͸�: ������ ��ǻ�Ϳ��� ���� �⺻�� �Ǵ� �߿��� ����� ����̴�. ��ǻ���� Ư���� �޸𸮿� ����� �����ʹ� ��ǻ�� ������ ������ ������Ƿ�, ��� ���α׷��� � ���·ε� ������ ����Ѵ�.
		//���͸��� ������ ü�������� �����Ϸ��� ������, ������� �Ѵ�. ���͸��� �ֻ����� ��Ʈ��� �ϸ�, ���н� �迭�� ��/��, MS ������� ��\���� ���͸� �����ڷ� ����Ѵ�
		//���� �׼���: ���� �߰��� Ư�� ��ġ�� �аų� ���� ���� ���� �׼������ ������ ���� ������ �����ϴ� ����� �ʿ��ϴ�. RandomAccessFile�̳� SeekableByteChannel Interface�� ������ Ŭ������ ����� �� �ִ�.
		//����: ��� ������ �ü���� �̿��Ͽ� ������ ������ �� �ִ�.
		//�ɺ��� ��ũ: �ɺ��� ��ũ�� ������ �������� ��ġ�� �ٸ� �̸����� ������ �� �ֵ��� �� ���̴�. (��: MS �������� �ٷΰ���)
		
		
		//2. ���� �����ϰ� ����
		String path = "c://workspace/tmpfile.txt";
		File file = new File(path);
		try {
			FileWriter fw = new FileWriter(file);
			for(int i = 'A'; i <= 'Z'; i++) {
				fw.write(i);
			}
			fw.close();
			System.out.println("Done...");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//3. ���� ��Ʈ���� ����Ͽ� ���� �а���
		File rfile = new File("C://workspace/tmpfile.txt");
		File wfile = new File("C://workspace/tmpfile_new.txt");
		try{
			BufferedReader reader = new BufferedReader(new FileReader(rfile));		
			BufferedWriter writer = new BufferedWriter(new FileWriter(wfile));
			String s;
			while((s = reader.readLine())!=null){
			writer.write(s+"-��������");
			}
			reader.close();
			writer.close();
			rfile.delete();
			}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done...");

	}

}
