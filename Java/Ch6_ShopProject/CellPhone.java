package ShopProject;

//Product �߻� Ŭ������ ��ӹ޾� ������ CellPhoneŬ����
public class CellPhone extends Product {
	
	String carrier;//��Ż�
	
	//��ǰ�̸��� ����, ��Ż� ������ �޾Ƽ� ó���ϴ� ������
	public CellPhone(String pname, int price, String carrier) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
	}
	
	//�������̽��� ���ǵ� �߻� �޼��带 �������̵��Ѵ�. �߰� ������ ��Ż� ������ ���
	@Override
	public void printExtra() {
		System.out.println("��Ż�: " + carrier);
	}
}
