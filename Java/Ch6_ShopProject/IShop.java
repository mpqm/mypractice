package ShopProject;

//���θ� �԰��� ������ �������̽�, ��� ���θ��� IShop �������̽��� �����ؾ� �Ѵ�.
public interface IShop {
	public abstract void setTitle(String title);	//���θ� ������ ����
	public abstract void genUser();					//���θ��� �̿��� �� �ִ� ���� ����ڵ��� �����Ѵ�.
	public abstract void genProduct();				//���θ��� ���� ��ǰ�� �����Ѵ�.
	public abstract void start();					//���θ� ���α׷��� �����ϴ� ���� �޼����̴�.
}
