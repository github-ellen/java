package ex08_inher;

class School {
	void schoolName() {
		System.out.println("�߾� ���� ����б�");
	}
	void info(String name) {
	}
}

class Stud extends School {

	void info(String name) {
		System.out.println(name + " �л�");
	}

}

class Teach extends School {

	void info(String name) {
		System.out.println(name + "������");
	}

}

public class J_210504_student {

	public static void main(String[] args) {
		// Stud s1 = new Stud();

		School s1 = new Stud();
		s1.schoolName();
		// s1.info("�̰���"); //s1�̶�� ������ info�� ����ų �� ����.
		// school�� �ȿ��� ������ ���� ������ ������ �ɸ���.
		// �ذ� ��� : �ٿ� ĳ����
		Stud s2 = (Stud) s1; // 1��
		s2.info("�̰���"); // 2��
		// �Ǵ� 1���� 2���� ���ļ�
		// ((Stud)s1).info("�̰���");

		Teach Ssam1 = new Teach();
		Ssam1.info("ȫ");
		Ssam1.schoolName();

		s1 = new Teach(); // s1�� Stu�� ����Ű��, Teach�� ����Ų��.
		((Teach)s1).info("ö��");
		
		
		
		
		
	}

}
