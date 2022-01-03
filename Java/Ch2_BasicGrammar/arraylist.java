package ch2_basicgrammar;

class Member{
	int id;
	String name;
	String birth;
	String tel;
	String dept;	
	public Member(int id, String name, String birth, String tel, String dept) {
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.tel = tel;
		this.dept = dept;
	}
}

public class arraylist {

	public static void main(String[] args) {
		//1. �迭�� ����
		//�ε���(������ȣ)�� �����ͷ� ������ ������ �ڷᱸ��, �����ʹ� �ε����� ����Ͽ� ���� �ְų� �����´�(����), �迭 �� �����ʹ� 0���� �����ϴ� �ε����� �����Ѵ�.
		//���� �ڷ������θ� �����Ѵ�, �迭�� ������ �� ũ�⸦ �����ؾ� �ϸ�, ���߿� �� ũ�⸦ ������ �� ����, Ư���� ������ �ʱ�ȭ���� ���� �迭 �� �����͸� �����ϸ� Null Pointer Exception�� �߻��Ѵ�.
		//�ڹٴ� ��ü���� ����̰� ��ü Ÿ���� ���� ������ �����ϱ� ������ �迭������ ���� �ڷ��� ���� ��ü Ÿ���� ����� �� �ִ�
		Member[] mlist = new Member[2]; 											   //member�� ���ҷ� �ϴ� 100��¥�� �迭�� mlist�̸����� ����
		mlist[0] = new Member(101, "ȫ�浿", "1990.08.06", "010-4024-5075", "�ѱ��ֽ�ȸ��");//memberŬ������ �ν��Ͻ��� �����Ͽ� �迭 ���ҿ� �Ҵ�
		mlist[1] = new Member(102, "������", "1990.08.06", "010-4024-5075", "�ѱ��ֽ�ȸ��");
		for(int i = 0; i < mlist.length; i++) {										   //������ ���, mlist.lenght->�迭�� ũ�⸦ ����
			System.out.println(mlist[i].id);
			System.out.println(mlist[i].name);
			System.out.println(mlist[i].birth);
			System.out.println(mlist[i].tel);
			System.out.println(mlist[i].dept);
		}
		
		//1���� �迭
		String[] products = {"���� ������", "�Ｚ ������", "��Ű�� ��̾�", "�Ҵ� �����丮��"};
		for(int i = 0; i < products.length; i++) {System.out.println(products[i]);}
		for(String s : products) {System.out.println(s);}
		
		//2�����迭
		String[][] members = {{"101","ȫ�浿"},
							  {"102","����"},
							  {"103","�̽ſ�"}};
		for(int i = 0; i < members.length; i++) {System.out.println(members[i][0] + ":" + members[i][1]);}
	}
}
