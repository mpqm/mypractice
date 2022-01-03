package ch4_library;

import java.util.Scanner;

public class langpackage {

	public static void main(String[] args) {
		//1. String class
		//String Ŭ������ ���ڿ� ó���� ���� Ŭ������, �ڹٿ��� ���ڿ��� �⺻ �ڷ����� �ƴ϶� Ŭ������ ����ϴ� ��ü Ÿ��
		//String Ŭ������ �ս��� ���ڿ��� ������ �� �ִ�, ���ڿ��� ����ϰų� �����ϴ� �� ���
		//���������� ����� ���� ���ڿ������� �ϳ��� �ν��Ͻ��� ����
		//�ݺ����� ����Ͽ� ���ڿ��� ���� ������ ��� ���ϴ� ������ ���α׷� ���ɿ� ������ ��ĥ �� �ֱ� ������ �̶��� java.lang.StringBuffer Ŭ���� ����� ����
		//���ڿ��� ���� ���� ��==�� �� �ƴ� equals( ) �޼��带 ���
		//������ �����ϴ� ���³� new �����ڷ� �ν��Ͻ��� �����Ͽ� ����� �� �ִ�
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = String.valueOf(30);
		//String str4 = new String(30);���� ó���ϸ�, ���������� �����ʾ� ����
		String a1 = "20";
		
		System.out.println("num1+30 = " + a1 + 30); 				//2030
		if(str1 == str2) System.out.println("str1�� str2�� �����ϴ�.");
		else System.out.println("str1�� str2�� ���� �ʽ��ϴ�.");
		if(str1 == str3) System.out.println("str1�� str3�� �����ϴ�.");//str4�� �ٸ���ü�� ����
		else System.out.println("str1�� str3�� ���� �ʽ��ϴ�.");
		if(str1.equals(str3))System.out.println("str1�� str3�� �����ϴ�.");
		else System.out.println("str1�� str3�� ���� �ʽ��ϴ�.");
		System.out.println("str1�� ����: " + str1.length());
		System.out.println("str1�� 4��° ���� : " + str1.charAt(4));
		System.out.println("str1�� 2~4 ��ġ�� �ִ� ���ڿ� : " + str1.substring(1,4));
		System.out.println("str1�� 1�� k�� ġȯ : " + str1.replace('l', 'k'));

		
		//1-1. String Buffer class
		//StringBuffer Ŭ������ ���ɿ� ������ ���� �ʰ� ���ڿ� ó���� �ϴ� Ŭ�����̴�. �� ���ڿ� ������ ���ڿ� ���ϱ� ��� StringBuffer�� ����ϴ� ���� ����.
		//StringBuffer�� �� �߰��� ���� append( ) �޼��带 ���
		
		//�������
		String str = "���ڿ�";
		for(int i = 0; i < 50; i++) str = str + i;
		System.out.println(str);
		
		//�������
		StringBuffer sb = new StringBuffer();
		sb.append("���ڿ�");
		for(int i = 0; i < 50; i++) sb.append(i);
		System.out.println(sb.toString());
		
		
		//2. Wrapper
		//�ڹ��� �⺻ �ڷ����� ��ü Ÿ������ ó���� �� �ֵ��� ���� Ŭ����
		//�⺻ �ڷ����� �����ϴ� Ŭ�������� ��� �غ�Ǿ� �ְ� �� Wrapper Ŭ������ ���εǴ� ������ Ÿ�԰� ���õ� ������ ��ɵ��� ����
		
		//2-1. Wrapper Ŭ������ ����
		//Wrapper Ŭ������ String�� ���� ������ �����ϴ� ���·� ����ϰų� new�� �̿��Ͽ� ���ο� ��ü�� �����ϴ� ���·� ����Ѵ�
		Integer num1 = new Integer(30);
		Integer num2 = num1.intValue();
		
		//�ڹٿ����� Wrapper Ŭ������ ���� �ڽ̰� ��ڽ��� �����Ѵ�
		Integer num3 = 50;
		int num4 = num3;
		String num5 = "40";
		String str5 = "50";
		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);
		System.out.println("num5: " + num5);
		int result = num3 + Integer.parseInt(num5);
		System.out.println("num3 + num5 = " + result);
		String result1 = num3 + str5.valueOf(str5);
		System.out.println("result1: " + result1);
		System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("SIZE: " + Integer.SIZE);
	}
}
