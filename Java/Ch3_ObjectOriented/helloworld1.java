//14
package ch3_object_oriented;

public class helloworld1 {
	private String msg;
	static int count = 0;
	static String prefix = "";
	
	//�����ε��� �����ڸ޼���(�Ķ����0��)
	public helloworld1() {										   
		msg = "Hello World !!";
	}
	
	//�����ε��� �����ڸ޼���(�Ķ����1��)
	public helloworld1(String msg) {								    
		this.msg = msg;
	}
	
	//�����ε��� �����ڸ޼���(�Ķ����2��)
	public helloworld1(String msg, int option) {						
		if(option == 1) this.msg = msg;
		else if(option ==2) this.msg = msg + ", �ȳ��ϼ���?";
	}
	
	//�޼���ȣ��-print�޼���
	public void print() {
		count++;
		System.out.println("[" + count + "]" + prefix + msg);
	}
	
	//getter
	public String getMsg() {												
		return msg;
	}
	
	//setter
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public static void main(String[] args) {
		//1. Ŭ����Ȯ�� - �ν��Ͻ��� ������ �� ��°� ����
		helloworld1 hello1 = new helloworld1();					
		hello1.print();
		
		helloworld1 hello2 = new helloworld1("My Hello world");
		hello2.print();
		
		helloworld1 hello3 = new helloworld1("Hello", 2);		
		hello3.print();
		
		//2. Ŭ����Ȯ�� - ��°��� ��������
		//msg�� �ܺ��������� ����� ���ɼ����ֱ� ������ msg�� private�� �ɰ� ������ �޼���� �ش� ������ ���� public getter/setter �޼��屸��
		//getter/setter�޼��� �ۼ���Ģ: ���� �ڷ��� getXxx( )(Xxx�� ���� �̸����� ù ���ڸ� �빮��), setXxx(�Ķ����)(�Ķ���ʹ� ������ �ڷ����� ��ġ�ؾ� �Ѵ�)
		hello2.setMsg("�ݰ����ϴ�.");
		System.out.println(hello2.getMsg());
		helloworld1.prefix = "Greetings: ";
		hello2.print();
		hello3.print();
		helloworld1.prefix = "�λ縻: ";
		hello2.print();
		hello3.print();
	}

}
