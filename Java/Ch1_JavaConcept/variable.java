package ch1_javaconcept;

public class variable {
	//1. ������ ����� ����
    //���α׷��� ���� ������ �پ��� ������ ������ �� �ִ� �޸𸮸� �����ϴ� ��ü
    //�ڹ� �����Ϸ��� ���������(������ �������� �Ǽ����� �ڷ��� ��Ȯ�ϰ� ����) �ڷ����� ������ ������ ó���� �� ����
    //�پ��� ������ ������
    //Product product;        Ŭ������ ������ �����ϴ� ���
	//int a; 			      ����������
	//int a = 1;			  ������ �����ϰ� ���ÿ� �ʱ갪 ����
	//int a, b, c;            ���� �ڷ��� ������ �� ���� ����
	//int a, b, c = 1;		  c������ 1�� �ʱ�ȭ�ϰ� a,b�� �ʱ갪 ���� �ȵ�
	//int a = 1, b = 2, c =3; ���� �ڷ��� ������ �ѹ��� �����ϸ鼭 ���� �ٸ� ������ �ʱ갪 ����

	//2. �����̸���Ģ : ��������x, ������x, ù���ڿ� ����x, �̸����̿���ĭx, �ڹ�Ű����x, �ݵ�� ����, �����, �޷���ȣ�ν���, ��ĭ����(_), ��ҹ����� ����

	//3. printf()�� ���� ���ڿ� �ڷ���
	//������(%c), 8����(%o), ������(%d, %i), ���ڿ�(%s), ������(%e), ��ȣ���� ������(%u), �Ǽ���(%f), 16����(%x), %�������(%%, \%) 

	//4. �⺻�ڷ���
	//������ : byte(1byte, -2^7 ~ 2^7-1), char(2byte, 0 ~ 2^16-1), short(2byte, -2^15 ~ 2^15-1), int(4byte, -2^31 ~ 2^31-1), long(8byte, -2^63 ~ 2^63-1)
	//�Ǽ��� : float(4byte, 1.4E^-46 ~ 3.102823E^38), double (8byte, 4.9E^324 ~ 3.402823E^308)
	//���� : boolean (1byte, true or false)
	
	//5. �ڹ� ���� ����
	//�ν��Ͻ� ����: �ڹ� ��ü�� �������� ���� �����ϴ� �� ����ϴ� ����
	//Ŭ���� ����: static ������ Modifier�� ���� ��� ������ "Ŭ�����̸�.�����̸�"�� ���·� ����
	//���� ����: �޼��� �ȿ� �����ϴ� ������, �ش� �޼��� �ȿ����� ������ �� �ִ� ����
	//�Ķ����: �޼����� ���ڷ� �����ϴ� ������ ���ϸ�, �⺻�����δ� ���� ������ ���ؼ� ���
	
	public static void main(String[] args) {
		
		byte byte1 = 'A';
		System.out.printf("byte1 ���� : %d\n", byte1);          //65
		System.out.printf("byte1 ���� : %c\n", byte1);		   //A
		
		char char1 = 66;  
		//System.out.printf("char1 ���� : %d\n", char1);        //����! �����ڷ����� ���������� ����������
		System.out.printf("char1 ���� : %c\n", char1);          //B
		
		short short1 = '}'; 
		System.out.printf("short1 ���� : %d\n", short1);        //125
		System.out.printf("short1 ���� : %c\n", short1);		   //}
		
		int int1 = byte1 + char1;
		System.out.printf("int1 ���� : %d\n", int1);            //65+66=131
		System.out.printf("int1 ���� : %c\n", int1);            //?
		System.out.printf("int1 8���� : %o\n", int1);           //203
		System.out.printf("int1 16���� : %x\n", int1);		   //83
		
		long long1 = 6876543210L;                              //longǥ�� L
		System.out.printf("long1 ���� : %d\n", long1);          //6876543210
		
		float float1 = 32.87f;   							   //floatǥ�� f,F
		System.out.printf("float1 ���� : %f\n", float1);   	   //32.87
		
		double double1 = 3.14E5; 						       //E5, ������ǥ���� *^10*N(5)
		System.out.printf("double1 ���� : %f\n", double1); 	   //314000.000000
		System.out.printf("double1 ������ǥ���� : %e\n", double1);//3.14e+05
		
		boolean boolean1 = true;
		System.out.printf("boolean1 ���� : %s\n", boolean1);	   //true
	}
	
}

