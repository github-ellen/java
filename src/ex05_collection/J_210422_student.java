package ex05_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//클래스 객체 만들어서 적용시키기

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
//		Student s1 = new Student(14, "유재석", "010-1234-2222");
//		Student s2 = new Student(27, "강호동", "010-7890-8888");
//		Student s3 = new Student(33, "김종국", "010-4567-5555");
		
//		//배열 기반으로 만든다면,
		List<Student> stuArr = new ArrayList<>();
//		stuArr.add(s1);
//		stuArr.add(s2);
//		stuArr.add(s3);
//		System.out.println(stuArr);
////		for (int i = 0 ; i <stuArr.size() ; i++) {
////			//System.out.println(i+1 +" : " + stuArr.get(i));
////			Student s= stuArr.get(i); //Student 클래스형을 의미.
////			System.out.println(s.getStuNum() + " "+s.getName()+"의 연락처는 "+ s.getPhoneNum());
////		}
//		
//		//for ~each문
//		for (Student i : stuArr) {
//			System.out.println(i.getStuNum() + " "+i.getName()+"의 연락처는 "+ i.getPhoneNum());
//		}
		
		//이것을 맵으로 저장한다면 쉽게 자료를 꺼내올 수 있음
//		Map<Integer, Student> stuMap = new HashMap<>();
//		stuMap.put(s1.getStuNum(), s1); //유재석의 번호를 넣어야함. 키를 하드코딩으로 5를 넣는다면 오류가 생김.
//		stuMap.put(s2.getStuNum(), s2);
//		stuMap.put(s3.getStuNum(), s3);
//		System.out.println(stuMap);
//		System.out.println(stuMap.get(2));
//		Student s = stuMap.get(2);
//		System.out.println(s.getStuNum() + " " + s.getName()+ " : " + s.getPhoneNum());
//		
		//키값만 가져오고 싶을 때.
		//hashMap은 인덱스가 없기 때문에 set이나 Iterator로 키값을 불러와야함.
		// stuMap.keySet(); keySet은 set형을 넘겨준다. 그렇기 때문에 set에 넣어야함.
//		Set<Integer> stuK = stuMap.keySet(); //import 해야함. // 인덱스가 생김.
//		System.out.println(stuK);
		
//		for (int k : stuK) {
//			System.out.println(k);
//		}
		
//		Iterator<Integer> it = stuK.iterator();
//		while (it.hasNext()) { //키를 순환시키기
//			int key = it.next();
//			System.out.println(key);
//		}
		
//		//키를 이용하여 정보 가져올 때는
//		Iterator<Integer> it = stuK.iterator();
//		while (it.hasNext()) { //키를 순환시키기
//			int key = it.next();
////			System.out.println(key);
//			Student s = stuMap.get(key);
//			System.out.println(s.getStuNum() + " " + s.getName()+ " : " + s.getPhoneNum());
//		}
		
		//연습문제
		//key : "result", value : "Success"
		//"data" : ArrayList<Student>
		Student s1 = new Student(14, "유재석", "010-1234-2222");
		Student s2 = new Student(27, "강호동", "010-7890-8888");
		Student s3 = new Student(33, "김종국", "010-4567-5555");
		Map<String, Object> hmap = new HashMap<>();
		hmap.put("result", "Success");
//		System.out.println(hmap);
		List<Student> aL = new ArrayList<>(); //ArrayList<Student> 값을 넣기 위한 절차.
		aL.add(s1);
		aL.add(s2);
		aL.add(s3);
		System.out.println(aL);
		hmap.put("data", aL);
		System.out.println(hmap);
		
		//System.out.println(hmap.get("result"));
		Object obj = hmap.get("result"); //map 생성 시 Object로 만들었기 때문에 돌려주는 값이 Object
		System.out.println(obj);
		//만약 result가 success라면 학생 정보 출력
		//아니면 에러 출력
		if (obj.equals("Success")) { //키에 접근하기 위한 변수가 필요하기 때문에 'Object obj = hmap.get("result")' 필요
			System.out.println("성공");
			//내가 가지고 오고 싶은 게 List니까 data 키에 접근해야함.
			System.out.println("data 키만 찍은 것 : " + hmap.get("data"));
			//각 student에 있는 게터, 세터 가지고 오려면
			List<Student> stuL = (List<Student>)hmap.get("data");
			System.out.println(stuL);
			for(Student s : stuL) {
				System.out.println(s);
				System.out.println(s.getStuNum()+" "+s.getName() + " "+s.getPhoneNum());
			}
		}
		else {
			System.out.println("에러");
		}
		
		
		
		
		
		
		

	}

}
