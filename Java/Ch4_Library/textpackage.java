package ch4_library;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.MessageFormat;

public class textpackage {

	public static void main(String[] args) {
		//1. ��¥ ���� ���� Ŭ����
		//java.text������ SimpleDateFormat�� DateFormat Ŭ������ �� �� �����ϰ� ��¥ �� �ð� ������ ó���� �� �ִ� ����� ����
		//��¥ ������ �����ϴ� Ŭ������ DateFormat�� SimpleDateFormat�� ������, �ڹ� 8���� java.time API�� ���Ӱ� �߰��Ǿ���
		Date date = new Date();
		
		//DateFormat�� �߻� Ŭ�����̱� ������ �ν��Ͻ��� ���� �� ����, abstract �޼����� getInstance( ) �޼���� ��ü�� ������ �ʿ��� �޼��带 ȣ���ؾ� �Ѵ�. (API����)
		DateFormat df1 = DateFormat.getInstance();
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("DateFormat �⺻: " + df1.format(date));
		System.out.println("DateFormat LONG: " + df2.format(date));
		System.out.println("DateFormat TimeZone: " + df1.getTimeZone().getID());
		
		//SimpleDateFormat�� ��ü�� ������ �� �Ķ���ͷ� ���ϴ� ������ �����ϰ� format( ) �޼��带 ȣ���ϸ� ���ϴ� ������ ���� �� �ִ�.
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd, hh:mm:a");
		System.out.println("SimpleDateFormat �⺻:" + sdf1.format(date));
		System.out.println("SimpleDateFormat sdf2����:" + sdf2.format(date));
		sdf1.applyPattern("yyyy�� MM/dd");
		System.out.println("SimpleDateFormat ����:" + sdf1.format(date));
		
		//2. ���� ���� ���� Ŭ����
		//���� ���� ������ NumberFormat�� DecimalFormat Ŭ������ ����� �� �ִ�. 
		//��¥�� �Բ� ���� ���� ���α׷��� ������ �� ���� ��ȯ�� �ʿ��� ������ �� �ϳ��̴�. ȭ�� ������ ����Ͽ� �ڸ��� ���� �� ���ڿ� ���õ� ������ ��ɵ��� �����Ѵ�
		double num1 = 35.82983;
		int num2 = 340000000;
		
		NumberFormat nf1 = NumberFormat.getInstance(); 					  //�⺻���¹�ȯ
		NumberFormat nf2 = NumberFormat.getIntegerInstance();			  //�Ҽ������� �������ø��ؼ� ��ȯ
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.KOREA);//�Ҽ������� �������ø��ؼ� ��ȯ�ϰ� ȭ�����
		System.out.println(nf1.format(num1));
		System.out.println(nf2.format(num1));
		System.out.println(nf3.format(num1));
		nf3.setMinimumIntegerDigits(3); 								  //�Ķ������ ���ڸ�ŭ ������ �⺻ �ڸ����� ó���Ѵ�.
		System.out.println(nf3.format(num1));
		
		DecimalFormat dcf1 = new DecimalFormat();
		DecimalFormat dcf2 = new DecimalFormat("00.###");
		System.out.println(dcf1.format(num2));
		System.out.println(dcf2.format(num1));
		dcf2.applyPattern("00.####");
		System.out.println(dcf2.format(num1));
		
		//3. �޼��� ���� ���� Ŭ����
		String msg = "{0, date}�� {0, time}�� {1}���� {2}�� ������� �ߴ�";
		Object[] objs = {new Date(), "����", "ȫ�浿"};
		MessageFormat mf = new MessageFormat(msg);
		System.out.println(mf.format(objs));
		String from = "ȫ�浿";
		String to = "��⵿";
		String location = "HOME";
		final int CHAT_SEND = 1;
		String chatMsg = "{0}|{1}|{2}-{3}|{4}";
		System.out.println(MessageFormat.format(chatMsg, CHAT_SEND, new Date(),from, to, location));
	}
}
