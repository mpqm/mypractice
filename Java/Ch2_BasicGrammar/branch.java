package ch2_basicgrammar;

import java.util.Scanner;

public class branch {

	public static void main(String[] args) {
		//1. if-else��
		Scanner scan = new Scanner(System.in);								   							 //Ű����� �Է��� �޴°�ü ����
		System.out.println("�α��ξ��̵� : ");
		String user = scan.next();            								   							 //Ű�����Է��� user ������ ����
		if(user.equals("admin")) {			 								   						     //user���� "admin"�̸�
			System.out.println("��й�ȣ : ");
			String pwd = scan.next();		  								   							 //Ű���� �Է��� pwd ������ ����
			if(pwd.equals("1234")) {										  							 //pwd�� 1234 �϶�
				System.out.println("������ �α���");
				System.out.println("�޴�����(1~2)");
				String sel = scan.next();         							   							 //Ű���� �Է��� sel ������ ����
				if(sel.equals("1")) {System.out.println("������ 1�� ������");}	   							 //sel���� 1�϶�
				else if(sel.equals("2")) {System.out.println("������ 2�� ������");}						     //sel���� 2�϶�
				else {System.out.println("���� �޴��Դϴ�.");}					   							 //sel���� �ٸ���
			}
			else System.out.println("��й�ȣ Ʋ��");							   							 //1234�� �ƴҶ�
		}
		
		else {																   							 //user���� �ٸ����̶��
			System.out.println("��й�ȣ : ");
			String pwd = scan.next();										   							 //Ű���� �Է��� pwd ������ ����
			if(pwd.equals("1234")) {                          				   						     //pwd�� 1234 �϶�
				System.out.println(user + "�α���");
				System.out.println("�޴�����(1~2)");
				String sel = scan.next();									  							 //Ű���� �Է��� sel ������ ����
				if(sel.equals("1")&& !user.equals("admin")) {System.out.println(user + "1�� ������");}     //sel���� 1�϶�
				else if(sel.equals("2")&& !user.equals("admin")) {System.out.println(user + "2�� ������");}//sel���� 2�϶�
				else {System.out.println("���� �޴��Դϴ�.");}												 //sel���� �ٸ���
			}
			else System.out.println("��й�ȣ Ʋ��");														 //1234�� �ƴҶ�
		}
		
		//2. switch��
		System.out.println("��������� �Է��ϼ���");
		String memberLevel = scan.next();
		String msg;
		switch(memberLevel)				   //������(memberLevel)
		{
		case "VIP":
			msg = "VIP �� ���� ����"; break;//break�� �߿� ������������ ������
		case "NEW":
			msg = "�ű� �� ���� ����"; break;
		case "YOUNG":
			msg = "û�ҳ� �� ���� ����"; break;
		default:
			msg ="��޾���";
		}
		System.out.println(msg);
	}
}
