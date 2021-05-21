package ex05_collection;

import java.util.Map;
import java.util.TreeMap;

public class J_210422_map {

	public static void main(String[] args) {
		//map : 키와 값으로 구성되어 있음.
		//특징 : 순서가 없음 (=인덱스가 없음)
		//따라서, 키를 이용하여 접근해야함.
		//따라서, 키는 중복될 수 없음. 값은 상관없음.
		
//		HashMap<Integer, String> hm = new HashMap<>(); //Integer는 키, String은 값
//		hm.put(1, "one");
//		hm.put(2, "two");
//		hm.put(3, "three");
//		
//		System.out.println(hm);
//		System.out.println(hm.get(2));
		
		//연습문제
		//학생들의 나이를 저장하세요.
		//key : 이름, value : 나이
//		HashMap<String, Integer> stu = new HashMap<>();
//		stu.put("강호동", 40);
//		stu.put("유재석", 37);
//		stu.put("김선호", 30);
//		stu.put("폴킴", 30);
//		System.out.println(stu);
//		System.out.println(stu.get("폴킴"));
		
		//트리맵으로 만들어야한다면(해시맵에서 트리맵으로, 트리맵에서 해시맵으로 바꿔야하는 일이 생길 수 있으므로)
		Map<String, Integer> stu = new TreeMap<>();
		stu.put("강호동", 40);
		stu.put("유재석", 37);
		stu.put("김선호", 30);
		stu.put("폴킴", 30);
		System.out.println(stu);
		System.out.println(stu.get("폴킴"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
