package ShopProject;

//Product �߻� Ŭ������ ��ӹ޾� ������ SmartTVŬ����
public class SmartTV extends Product {
	
	String resolution;//�ػ�
	
	//��ǰ�̸�, ����, �ػ󵵸� �޾Ƽ� ó���ϴ� ������
	public SmartTV(String pname, int price, String resolution) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
	}
	
	//�������̽��� ���ǵ� �߻� �޼��带 �������̵��Ѵ�. �߰� ������ �ػ� ������ ���
	@Override
	public void printExtra() {
		System.out.println("�ػ�: "+ resolution);
	}
}
