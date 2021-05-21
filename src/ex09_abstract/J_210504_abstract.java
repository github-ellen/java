package ex09_abstract;

//부모 클래스
//추상 메소드를 한 개라도 포함하고 있다면 추상 클래스로 만들어야함.
// -> 자식 클래스가 오버라이딩을 반드시 구현해야한다는 의미
// 자식 클래스가 반드시 구현부를 작성
abstract class Education {
	static String name = "서울 교육청";
//	void schoolName() {} // 실체가 없는 것
	//따라서 아래와 같이 표현한다.
	//구현부
	abstract void schoolName(); //abstract class
	
}

class Elementary extends Education {
	@Override
	void schoolName() {
		System.out.println("독립문 초등학교");
	}
	
	
	
}

class Middle extends Education {
	void schoolName() {
		System.out.println("동명 여자 중학교");
	}
}

class High extends Education {
	void schoolName() {
		System.out.println("중앙 여자 고등학교");
	}
}

class EduInfo {
	void schoolNamePrint(Education edu) {
//		//다운캐스팅
//		if (edu instanceof High) //어떤 형에 속해있는지 여부 확인 : instanceof
//			((High)edu).schoolName();
//		else if (edu instanceof Middle)
//			((Middle)edu).schoolName();
//		else if (edu instanceof Elementary)
//			((Elementary)edu).schoolName();
//		여기서 바로 edu.schoolName을 하고 싶다면 클래스 내에 스쿨네임 만들기.
		
		//다형성을 이용하여 출력
		//실제 출력은 자식 클래스의 메소드를 실행
		edu.schoolName();

	}
}

public class J_210504_abstract {

	public static void main(String[] args) {
		High high = new High();
		Middle middle = new Middle();
		Elementary ele = new Elementary();
		EduInfo info = new EduInfo();
		info.schoolNamePrint(high);
		// info.schoolNamePrint(middle); //오류 --> EduInfo 클래스에 if절 삽입하기
		info.schoolNamePrint(middle);
		info.schoolNamePrint(ele);
		
		//new Education(); 추상 클래스(형체가 없음)이기 때문에 객체 생성 불가

	}

}
