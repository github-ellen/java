package ex05_collection;

import java.util.Map;
import java.util.TreeMap;

public class J_210422_map {

	public static void main(String[] args) {
		//map : Ű�� ������ �����Ǿ� ����.
		//Ư¡ : ������ ���� (=�ε����� ����)
		//����, Ű�� �̿��Ͽ� �����ؾ���.
		//����, Ű�� �ߺ��� �� ����. ���� �������.
		
//		HashMap<Integer, String> hm = new HashMap<>(); //Integer�� Ű, String�� ��
//		hm.put(1, "one");
//		hm.put(2, "two");
//		hm.put(3, "three");
//		
//		System.out.println(hm);
//		System.out.println(hm.get(2));
		
		//��������
		//�л����� ���̸� �����ϼ���.
		//key : �̸�, value : ����
//		HashMap<String, Integer> stu = new HashMap<>();
//		stu.put("��ȣ��", 40);
//		stu.put("���缮", 37);
//		stu.put("�輱ȣ", 30);
//		stu.put("��Ŵ", 30);
//		System.out.println(stu);
//		System.out.println(stu.get("��Ŵ"));
		
		//Ʈ�������� �������Ѵٸ�(�ؽøʿ��� Ʈ��������, Ʈ���ʿ��� �ؽø����� �ٲ���ϴ� ���� ���� �� �����Ƿ�)
		Map<String, Integer> stu = new TreeMap<>();
		stu.put("��ȣ��", 40);
		stu.put("���缮", 37);
		stu.put("�輱ȣ", 30);
		stu.put("��Ŵ", 30);
		System.out.println(stu);
		System.out.println(stu.get("��Ŵ"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
