package ShopProject;

import java.util.ArrayList;
import java.util.Scanner;

//IShop �������̽��� ������ MyShop Ŭ����
public class MyShop implements IShop {
	
	//��� ȸ�� ���� �迭
	User[] users = new User[2];
	
	//��� ��ǰ ���� �迭
	Product[] products = new Product[4];
	
	//��ǰ�� �߰��� �� �ִ� ��ٱ���
	ArrayList<Product> cart = new ArrayList<Product>();
	
	//Ű���� �Է����� ���ڿ��� �Է¹޴� Scanner ��ü ����
	Scanner scan = new Scanner(System.in);
	
	//������ ������� index ����
	int selUser;
	
	//���θ� �̸� ����
	String title;
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * ���α׷� ���� ���۸޼���
	 */
	
	//���θ� ���α׷��� �����ϴ� ���� ���� �޼����̴�.
	public void start() {
		System.out.println(title + " : ����ȭ�� - ���� ����");
		System.out.println("=============================");
		int i = 0;
		
		//����� ����� ���� ���
		for(User u : users) {
			System.out.printf("[%d]%s(%s)\n", i++, u.getName(), u.getPayType());
		}
		
		System.out.println("[x]�� ��");
		System.out.println("���� : ");
		String sel = scan.next();
		System.out.println("## "+ sel + "���� ##");
		
		//������ �޴��� ���� ó��
		switch(sel) {
			case "x": System.exit(0); break;
			default:
				selUser = Integer.parseInt(sel);
				productList();
		}
	}
	
	//��ǰ ����� ����ϴ� �޼���
	public void productList() {
		System.out.println(title + " : ��ǰ��� - ��ǰ����");
		System.out.println("=============================");
		int i = 0;
		
		//����� ��ǰ ���� ���
		for(Product p : products) {
			System.out.print("["+i+"]");
			p.printDetail();
			i++;
		}
		System.out.println("[h]����ȭ��");
		System.out.println("[c]üũ�ƿ�");
		System.out.println("���� : ");
		String sel = scan.next();
		System.out.println("## "+ sel + "���� ##");
		
		//������ �޴��� ���� ó��
		switch(sel) {
			case "h": start(); break;
			case "c": checkOut(); break;
			default:
				int psel = Integer.parseInt(sel);
				cart.add(products[psel]);
				productList();
				selUser = Integer.parseInt(sel);
				productList();
		}
	}
	
	//��ǰ�� �����ϴ� �޼���
	public void checkOut() {
		System.out.println(title + " : üũ�ƿ�");
		System.out.println("=============================");
		int total = 0;
		int i = 0;
		
		//��ٱ��Ͽ� ��ϵ� ��ǰ ���� ���
		for(Product p : cart) {
			System.out.printf("[%d]%s(%s)\n", i++, p.pname, p.price);
			total = total + p.price;
		}
		System.out.println("=============================");
		
		//������ ������� ���� ��� ���
		System.out.println("���� ���: "+ users[selUser].getPayType());
		
		//�հ� ���
		System.out.println("�հ�: " + total + " �� �Դϴ�.");
		System.out.println("[p]����, [q]���� �Ϸ�");
		System.out.print("���� : ");
		String sel = scan.next();
		
		//������ �޴��� ���� ó��
		switch(sel) {
			case "q":
				System.out.println("## ������ �Ϸ� �Ǿ����ϴ�. �����մϴ�. ##");
				System.exit(0); break;
			default:
				checkOut();
		}
	}
	/**
	 * ���α׷����� ����ϴ� ���� ����� ��� �޼���
	 */
	//����� ������ �����ϴ� �޼���, ���θ��� �̿��� �� �ִ� ���� ����ڵ��� �����Ѵ�.
	public void genUser() {
		User user = new User("ȫ�浿", PayType.CARD);
		users[0] = user;
		user = new User("��ΰ�", PayType.CASH);
		users[1] = user;
	}
	/**
	 * ���α׷����� ����ϴ� ���� ��ǰ ��� �޼���
	 */
	
	//��ǰ ������ �����ϴ� �޼���, ���θ��� ���� ��ǰ�� �����Ѵ�.
	public void genProduct() {
		CellPhone cp = new CellPhone("������ ��Ʈ 5", 1000000, "SKT");
		products[0] = cp;
		cp = new CellPhone("���� ������7", 980000, "KT");
		products[1] = cp;
		SmartTV st = new SmartTV("�Ｚ 3D Smart TV", 5000000, "4K");
		products[2] = st;
		st = new SmartTV("LG  Smart TV", 2500000, "FULL HD");
		products[3] = st;
	}

}
