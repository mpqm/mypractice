package ShopProject;

public class User {
	//����� �̸�
	private String name;
	
	//���� ���� - enum
	private PayType payType;
	
	//�̸��� ���� ������ �Ķ���ͷ� ������ ������, �����ڷ� �̸��� ���� ������ �޾� �����Ѵ�.
	public User(String name, PayType payType) {
		this.name = name;
		this.payType = payType;
	}
	
	//������� �̸� ������ �����Ѵ�.
	public String getName() {
		return name;
	}
	
	//������� �̸� ������ �����Ѵ�.
	public void setName(String name) {
		this.name = name;
	}
	
	//������� ���� ������ �����Ѵ�.
	public PayType getPayType() {
		return payType;
	}
	
	//������� ���� ������ �����Ѵ�.
	public void setPayType(PayType payType) {
		this.payType = payType;
	}
}
