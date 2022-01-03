//13
package ch3_object_oriented;

public class method {
	
	static int num1 = 10; //Ŭ��������(static ����)
	int num2 = 10;  	  //�ν��Ͻ� ����
	
	//�޼��� �����ε� ���x, �̸����� �Ķ���� ����, �����ٸ�
	public int sum(int num1, int num2) { //�̸��� ���� �޼���1 
		return num1 + num2;
	}
	public int sum(int num1, int num2, int num3) {//�̸��� ���� �޼���2
		return num1 + num2 + num3;
	}
	
	//�޼��� �������̵�: ����Ŭ������ �޼���� �޼��� ������Ұ� ��� ����, �̸�,�Ķ����,����Ÿ���� ��ΰ��ƾ���
	@Override
	public String toString() {
		return "�޼��� �������̵�";
	}
	
	
	public static void main(String[] args) {
		method ex1 = new method();
		method ex2 = new method();
		
		ex1.num1 = 20;
		ex2.num1 = 30;
		System.out.println("ex1.num1=" + ex1.num1);
		System.out.println("ex2.num2=" + ex2.num1); //���� ��갪�� 30���� Ŭ��������(static����)�� Ư¡
		ex1.num2 = 30;
		ex2.num2 = 50;
		System.out.println("ex1.num1=" + ex1.num2); //�ν��Ͻ������� ��������Ǳ⶧���� 30
		System.out.println("ex2.num2=" + ex2.num2); //�ν��Ͻ������� ��������Ǳ⶧���� 50
		
		System.out.println(ex1.sum(3,5)); //�޼��� �����ε�
		System.out.println(ex1.sum(3,5,8)); //�޼��� �����ε�
		System.out.println(ex1.toString()); //�޼��� �������̵�, �����ǵ� �ڵ�
		System.out.println(ex2.toString()); //�޼��� �������̵�
	}
}
