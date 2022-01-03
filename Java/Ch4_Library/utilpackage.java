package ch4_library;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TimeZone;

public class utilpackage {

	public static void main(String[] args) {

		//1. Date, Calendar
		//Date Ŭ������ ������ ���� �ν��Ͻ��� ������ �� �޼��带 ȣ���Ͽ� ���ϴ� ����� ����ϰų� Date Ŭ������ �����ϴ� �ٸ� Ŭ������ �Ķ���ͷ� �����Ͽ� ���ϴ� ������ �����ϴ� ���·� ����Ѵ�
		Date date1 = new Date();
		Date date2 = new Date(123141245);
		System.out.println("date1: " + date1);
		System.out.println("date2: " + date2);
		System.out.println("date1, date2 �� : " + date1.compareTo(date2));
		System.out.println(date1.after(date2));
		System.out.println(date1.before(date2));
		System.out.println(date1.getTime());
		
		//Calendar Ŭ������ �߻� Ŭ������, ��ü�� ������ �� ����. ��� getInstance( )�޼��带 ����Ͽ� �ý����� ��¥�� �ð� ������ �����´�
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("GNT + 2"));
		boolean a = cal1.equals(cal2);
		System.out.println(a);
		System.out.println("�ð�: "+ cal1.get(Calendar.HOUR_OF_DAY)+ ":" + cal1.get(Calendar.MINUTE));
		System.out.println("�ð�: "+ cal2.get(Calendar.HOUR_OF_DAY)+ ":" + cal2.get(Calendar.MINUTE));
		cal2.set(12,12,12, 12, 12);
		System.out.println("�ð�: "+ cal2.get(Calendar.HOUR_OF_DAY)+ ":" + cal2.get(Calendar.MINUTE));
		
		//2. Scanner
		//Scanner Ŭ������ �Է� ��Ʈ������, �����͸� �Է¹޴� Ŭ�����̴�. 
		//��� ������� �ڹ� I/O���� �����ϴ� Ŭ�������� ����ؾ� �ϸ�, Scanner Ŭ������ ��������� ������ �Է��� ó���ϴ� �� ����Ѵ�. 
		//��ü�� ������ �� �Է� ��Ʈ���� �����ϸ� Ű���� ���� ����, ��Ʈ��ũ ��� ������ �Է��� �޾ƿ� �� �ִ�
		Scanner scan = new Scanner(System.in);
		String msg = scan.next();
		System.out.println("�Է�: " + msg);
		int num = scan.nextInt();
		System.out.println("�Է�: " + num);
		
		//3. Random
		//Random Ŭ������ ������ �����ϴ� Ŭ�����̴�. 
		//�Ϸ��� ��Ģ�� ���� ������ �����ϴ� �����, ��ü�� ������ �� ���� �ð� ������ �õ�(Seed)�� �Ͽ� �� ������ ���� ������ �����ϴ�. ���� ���� ������ �����ϸ� 0���� �����ϹǷ� 1���� �����ؾ� �� ���� ������ ������ 1�� ���ϵ��� �Ѵ�.
		Random r1 = new Random();
		Random r2 = new Random(123);
		Random r3 = new Random(123);
		Random r4 = new Random(System.currentTimeMillis());
		System.out.println("## �⺻ ���� ��� ##");
		System.out.println("r1: "+ r1.nextInt(10));
		System.out.println("r2: "+ r2.nextInt(10));
		System.out.println("r3: "+ r3.nextInt(10));
		System.out.println("r4: "+ r4.nextInt(10));
		System.out.println("1~20: " + (r1.nextInt(20)+1));
		
		//4. StringTokenizer
		//StringTokenizer Ŭ������ �����ڷ� ����� ���ڿ��� �ս��� �и�(�Ľ�)�ϴ� Ŭ�����̴�. 
		//�Ϲ������� �����ڿ��� ����, �޸�, �� ���� ���� ����Ѵ�. Ư�� �޸��� ���е� �����ʹ� csv �����̶�� �Ͽ� �������� ȣȯ�ȴ�.
		//�⺻������ ������ ���� �ν��Ͻ��� ������ �� �Ľ��� ���ڿ��� �����ڸ� ������ �� nextToken( ) �޼��带 ����Ͽ� ���ʴ�� �����͸� �����´�
		String data ="ȫ�浿, 010-123-1234, ����� ���α�, �л�";
		StringTokenizer st = new StringTokenizer(data, ",");
		System.out.println("���� ���� ���");
		System.out.println("�̸�:" + st.nextToken());
		System.out.println("��ȭ��ȣ1:" + st.nextToken());
		System.out.println(st.hasMoreTokens());
		System.out.println("�ּ�:" + st.nextToken());
		System.out.println("����:" + st.nextToken());
	}

}


