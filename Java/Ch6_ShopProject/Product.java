package ShopProject;
	
//���θ� ��ǰ ���Ǹ� ���� �߻� Ŭ����
//�پ��� ��ǰ ������ �����Ϸ��� �⺻ ���� ������ ��¸� �߻� Ŭ�������� �����ϰ�, �߰� ������ ���� Ŭ�������� �����ϵ��� �����Ѵ�.
public abstract class Product{
	
	//��ǰ �̸��� ���� ����
	String pname;
	int price;
	
	//��ǰ �̸��� ������ ����ϴ� �⺻ ���� ��� �޼���, �������� ����ϱ����ؼ� printExtra()�޼��带 ȣ���Ѵ�.
	public void printDetail() {
		System.out.print("��ǰ��: "+ pname + " , ");
		System.out.print("����: "+ pname + " , ");
		printExtra();
	}
	
	//�߻�޼���� ���� ������ ����Ŭ�������� �ؾ��Ѵ�.
	//printDetail()���� �ڵ����� ȣ���ϹǷ�, printExtra()�� ������ ���뵵 �ڵ����� �Բ� ��µȴ�.
	public abstract void printExtra();
}
