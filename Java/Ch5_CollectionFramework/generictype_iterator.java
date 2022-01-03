package collection_framework;
import java.util.*;


public class generictype_iterator {
	
	public static void printString(ArrayList al) {
		for(int i=0; i<al.size(); i++) {
			String tmp = (String) al.get(i);
			System.out.println(tmp);
		}
	}
	public static void main(String[] args) {
		//1. Object Ŭ������ �Ϲ� Ŭ����
		//���ο� �迭�� ����: �⺻ ������ Ÿ�� Ȥ�� Ŭ���� Ÿ���� ����ϴ� ���� �Ϲ���, ����, �迭�� Ŭ���� Ÿ���� ������ �����ϰ� ���� ���� ���, Object Ŭ���� Ÿ������ ����
		//�ڹٿ����� ��� Ŭ������ Object Ÿ���� ����ϰ� ���� ��, ��� Ŭ������ Object Ÿ���� �ڽ� Ŭ���� (Descendant)�� �� �� ����
		//Object �������� �ڽ� Ŭ������ ��� ���� �� �� ���� (������), ����, ���� ���� ���� �����̳ʰ� Object Ÿ������ ����Ǹ� �����̵� �Է� ���� �� ����
		
		//2.Object Ŭ���� ����� �Ѱ�
		//Object ������ Ÿ���� ����ϸ� ����(Generic) ������ �������� ���� ����, �׷���, Type Checking�̳�, Casting ������ ����
		ArrayList al1 = new ArrayList();
		al1.add("hi");
		System.out.println(((String)al1.get(0)).charAt(0));
		ArrayList al2 = new ArrayList();
		al2.add("hie");//���࿡ hi���ƴ� �������� �Էµȴٸ�?
		printString(al2);
		
		//3. GenericŸ��
		//Generic Ÿ���� Ȱ��: Ŭ���� ���� ��ÿ��� ����ϴ� Ŭ������ Ư������ ������, ����(��ü) ���� �ÿ��� �ݵ�� ����ϵ��� �Ͽ� Casting ������ �ذ�
		//Collection: Collection �������� �⺻ ������ �����ϰ� �ִ� �������̽�, iterator��� �ϴ� �Ͻ��� ������Ʈ�� �̿��Ͽ� ���� ���� �����͸� ����, iterator�� �Ź� ��ü�� Collection �����Ϳ��� �����ͼ� �����ؾ��� (�Ͻ��� ������Ʈ)
		
		//4. Iterator �޼ҵ�
		//Boolean hasNext(): �̹� �ݺ� �ܰ迡�� �����ִ�(�� ������) ��Ұ� ���� �� true�� ����
		//E next(): �̹� �ݺ� �ܰ��� ���� ��Ҹ� ����
		//void remove(): Iterator�� ã�� ������ ��Ҹ� Collection���� ����
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		Iterator<String> iter1 = al.iterator();
		while(iter1.hasNext()) {
			String tmp = iter1.next();
			System.out.println(tmp);
		}
		Iterator<String> iter2 = al.iterator();
		while(iter2.hasNext()) {
			String tmp = iter2.next();
			System.out.println(tmp);
		}
		iter2.remove();
		System.out.println("size: "+ al.size());
	}
	

}
