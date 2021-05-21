package ex05_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Ŭ���� ��ü ���� �����Ű��

class Student {
	private int stuNum ;
	private String name ;
	private String phoneNum ;
	
	Student(){}
	Student(int stuNum, String name, String phoneNum){
		this.stuNum = stuNum;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", name=" + name + ", phoneNum=" + phoneNum + "]";
	}
	
	
}
public class J_210422_student {
	public static void main(String[] args) {
//		Student s1 = new Student(14, "���缮", "010-1234-2222");
//		Student s2 = new Student(27, "��ȣ��", "010-7890-8888");
//		Student s3 = new Student(33, "������", "010-4567-5555");
		
//		//�迭 ������� ����ٸ�,
		List<Student> stuArr = new ArrayList<>();
//		stuArr.add(s1);
//		stuArr.add(s2);
//		stuArr.add(s3);
//		System.out.println(stuArr);
////		for (int i = 0 ; i <stuArr.size() ; i++) {
////			//System.out.println(i+1 +" : " + stuArr.get(i));
////			Student s= stuArr.get(i); //Student Ŭ�������� �ǹ�.
////			System.out.println(s.getStuNum() + " "+s.getName()+"�� ����ó�� "+ s.getPhoneNum());
////		}
//		
//		//for ~each��
//		for (Student i : stuArr) {
//			System.out.println(i.getStuNum() + " "+i.getName()+"�� ����ó�� "+ i.getPhoneNum());
//		}
		
		//�̰��� ������ �����Ѵٸ� ���� �ڷḦ ������ �� ����
//		Map<Integer, Student> stuMap = new HashMap<>();
//		stuMap.put(s1.getStuNum(), s1); //���缮�� ��ȣ�� �־����. Ű�� �ϵ��ڵ����� 5�� �ִ´ٸ� ������ ����.
//		stuMap.put(s2.getStuNum(), s2);
//		stuMap.put(s3.getStuNum(), s3);
//		System.out.println(stuMap);
//		System.out.println(stuMap.get(2));
//		Student s = stuMap.get(2);
//		System.out.println(s.getStuNum() + " " + s.getName()+ " : " + s.getPhoneNum());
//		
		//Ű���� �������� ���� ��.
		//hashMap�� �ε����� ���� ������ set�̳� Iterator�� Ű���� �ҷ��;���.
		// stuMap.keySet(); keySet�� set���� �Ѱ��ش�. �׷��� ������ set�� �־����.
//		Set<Integer> stuK = stuMap.keySet(); //import �ؾ���. // �ε����� ����.
//		System.out.println(stuK);
		
//		for (int k : stuK) {
//			System.out.println(k);
//		}
		
//		Iterator<Integer> it = stuK.iterator();
//		while (it.hasNext()) { //Ű�� ��ȯ��Ű��
//			int key = it.next();
//			System.out.println(key);
//		}
		
//		//Ű�� �̿��Ͽ� ���� ������ ����
//		Iterator<Integer> it = stuK.iterator();
//		while (it.hasNext()) { //Ű�� ��ȯ��Ű��
//			int key = it.next();
////			System.out.println(key);
//			Student s = stuMap.get(key);
//			System.out.println(s.getStuNum() + " " + s.getName()+ " : " + s.getPhoneNum());
//		}
		
		//��������
		//key : "result", value : "Success"
		//"data" : ArrayList<Student>
		Student s1 = new Student(14, "���缮", "010-1234-2222");
		Student s2 = new Student(27, "��ȣ��", "010-7890-8888");
		Student s3 = new Student(33, "������", "010-4567-5555");
		Map<String, Object> hmap = new HashMap<>();
		hmap.put("result", "Success");
//		System.out.println(hmap);
		List<Student> aL = new ArrayList<>(); //ArrayList<Student> ���� �ֱ� ���� ����.
		aL.add(s1);
		aL.add(s2);
		aL.add(s3);
		System.out.println(aL);
		hmap.put("data", aL);
		System.out.println(hmap);
		
		//System.out.println(hmap.get("result"));
		Object obj = hmap.get("result"); //map ���� �� Object�� ������� ������ �����ִ� ���� Object
		System.out.println(obj);
		//���� result�� success��� �л� ���� ���
		//�ƴϸ� ���� ���
		if (obj.equals("Success")) { //Ű�� �����ϱ� ���� ������ �ʿ��ϱ� ������ 'Object obj = hmap.get("result")' �ʿ�
			System.out.println("����");
			//���� ������ ���� ���� �� List�ϱ� data Ű�� �����ؾ���.
			System.out.println("data Ű�� ���� �� : " + hmap.get("data"));
			//�� student�� �ִ� ����, ���� ������ ������
			List<Student> stuL = (List<Student>)hmap.get("data");
			System.out.println(stuL);
			for(Student s : stuL) {
				System.out.println(s);
				System.out.println(s.getStuNum()+" "+s.getName() + " "+s.getPhoneNum());
			}
		}
		else {
			System.out.println("����");
		}
		
		
		
		
		
		
		

	}

}
