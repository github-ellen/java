package ex08_inher;

class School {
	void schoolName() {
		System.out.println("중앙 여자 고등학교");
	}
	void info(String name) {
	}
}

class Stud extends School {

	void info(String name) {
		System.out.println(name + " 학생");
	}

}

class Teach extends School {

	void info(String name) {
		System.out.println(name + "선생님");
	}

}

public class J_210504_student {

	public static void main(String[] args) {
		// Stud s1 = new Stud();

		School s1 = new Stud();
		s1.schoolName();
		// s1.info("이경은"); //s1이라는 변수는 info를 가리킬 수 없다.
		// school형 안에는 인포가 없기 때문에 에러가 걸린다.
		// 해결 방법 : 다운 캐스팅
		Stud s2 = (Stud) s1; // 1번
		s2.info("이경은"); // 2번
		// 또는 1번과 2번을 합쳐서
		// ((Stud)s1).info("이경은");

		Teach Ssam1 = new Teach();
		Ssam1.info("홍");
		Ssam1.schoolName();

		s1 = new Teach(); // s1은 Stu도 가리키고, Teach도 가리킨다.
		((Teach)s1).info("철기");
		
		
		
		
		
	}

}
