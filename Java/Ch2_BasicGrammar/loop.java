package ch2_basicgrammar;

public class loop {

	public static void main(String[] args) {
		//1. for
		//���۰� ���� ������ ������ ���� �� ���
		//�������: �ʱⰪ -> ���ǰ� -> ��ɹ�(for���) -> �����Ĺݿ� -> ���ǰ� -> ...
		for(int i =2 ; i< 10; i++) {
			System.out.println(i+"��");
			for(int j = 1; j<10; j++) {System.out.printf("%d * %d = %d\n", i, j, i *j);}
			System.out.println("\n");
		}
		
		//2. while
		//���۰� ���� ������ ��Ȯ���� �ʰ� �������� ���� Ư�� ������ �����ϴ� ���� ��� �ݺ��� �� ���
		int num = 20;
		boolean flag = true;
		while(flag) {
			System.out.println(num--);
			if(num == 3) {
				flag = false;
				System.out.println("num==3 -> ����");
			}
		}
	}

}
