package ch2_basicgrammar;

public class operator{

	public static void main(String[] args) {
		// 1. ����������� ���
		//��� ������ ������ ���� ������ �ڷ����� ����ϴ� ���� �ſ��߿�
		int num1 = 30;
		int num2 = 14;
		num2 *= 2;
		System.out.printf("num1 * num2 : %d \n", num1 * num2);//840
	    System.out.printf("num1 : %d \n", num1++);      	  //30
	    System.out.printf("num2 : %d \n", num2++);            //28
	    System.out.printf("num1++ : %d \n", num1);            //31
	    System.out.printf("num2++ : %d \n", num2);            //29
	    System.out.printf("--num1 : %d \n", --num1);          //30
	    System.out.printf("--num2 : %d \n", --num2);	      //28

	    //2. �ڵ�����ȯ
	    //��������� �����Ҷ� �⺻������ �ǿ����� �߿��� �ڷ����� ū ���� ���� ����� ��� 
	    int num3 = 313;
	    long num4 = 15L;
	    long result1 = num3 * num4; 
	    long result2 = num3 / num4; 
	    double result3 = num3 / num4; 
	    double result4 = num3 / 15.0;
	    System.out.printf("result1 : %d \n", result1);  //4695
	    System.out.printf("result2 : %d \n", result2);  //20
	    System.out.printf("result3 : %f \n", result3);  //20.000000
	    System.out.printf("result4 : %.3f \n", result4);//20.867, �Ҽ��� 3��°���� �ݿø� ǥ��(%.3f)
	  
	    //3. �����÷ο�
	    //�־��� �ڷ����� ������ ���� �� �߻��ϴ� ���� 
	    int result7 = 1000000 * 1000000;
	    System.out.printf("�����÷ο� %d\n", result7);
	  
	    //4. ����÷ο�
	    //�ش� �ڷ������� ó���� �� �ִ� ���� ���� ������ �� ���� ����� ó���Ҷ� �߻� 
	    int result8 =-1000000 * 1000000; 
	    System.out.printf("����÷ο� %d\n", result8);
	  
		//5. ��������
	    boolean member = true;     
		boolean newmember = false; 
	 	int earn = 5000; 		   
	 	char creditgrade = 1;      
		boolean memcheck1 = (member == true && earn >= 5000 && creditgrade <= 5);              //&&
		boolean memcheck2 = (member == true || earn >= 5000 || creditgrade <= 5);              //||
		String result9 = (memcheck1 && memcheck2 && !newmember) ? "����ī��߱�" : "����ī�� �߱ް���";//���׿�����(if-else���� ��ü), !
		System.out.println(result9);

		//6. ��Ʈ��������
		int pwd = 123456;
		int key = 0x1A253B65;
		System.out.println("��ȣȭ �� ��й�ȣ : " + pwd);   //123456
		int encpwd = pwd ^ key;						    //^
		System.out.println("��ȣȭ �˰��� ^ : " + encpwd);//438622501
		int decpwd = encpwd ^ key;						
		System.out.println("��ȣȭ �� ��й�ȣ : " + decpwd);//123456
		int num5 = 50;
		int num6 = 20;
		System.out.printf("num5, num6 : %s, %s\n", Long.toBinaryString(num5), Long.toBinaryString(num6));//50, 110010, long.toBinaryString()(������ ���̳ʸ��������� ���ڿ���ȯ)
		int result10 = num5 >> 1;														   				 //>>, ������ 2�� ����
		System.out.printf("num5 >> 1 : %d, %s\n", result10, Long.toBinaryString(result10));				 //25, 11001
		int result11 = num5 << 1;														   				 //<<���ϱ� 2�� ����
		System.out.printf("num5 << 1 : %d, %s\n", result11, Long.toBinaryString(result11));				 //100, 1100100
		int result12 = num5 & num6;														   				 //&
		System.out.printf("num5 & num6 : %d, %s\n", result12, Long.toBinaryString(result12));			 //16, 10000
		int result13 = num5 | num6;																		 //|
		System.out.printf("num5 | num6 : %d, %s\n", result13, Long.toBinaryString(result13));			 //54, 110110
		
		//7. ������ �켱����
		//[], () -> !, ~, +/-, ++/--, (cast) -> + -, *, /, %, -> <<, >>, >>> -> <, >, <=, >=, ==, != -> &, ^, | -> &&, || -> [���ǽ�] ? [true]:[false] -> =, +=, -=, *=, /=, %=, <<=, >>=, ^=, &=, !=, -> ++/--(������ ���� ������) 
		 

	}

}
