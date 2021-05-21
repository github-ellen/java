package ex09_abstract;

//�θ� Ŭ����
//�߻� �޼ҵ带 �� ���� �����ϰ� �ִٸ� �߻� Ŭ������ ��������.
// -> �ڽ� Ŭ������ �������̵��� �ݵ�� �����ؾ��Ѵٴ� �ǹ�
// �ڽ� Ŭ������ �ݵ�� �����θ� �ۼ�
abstract class Education {
	static String name = "���� ����û";
//	void schoolName() {} // ��ü�� ���� ��
	//���� �Ʒ��� ���� ǥ���Ѵ�.
	//������
	abstract void schoolName(); //abstract class
	
}

class Elementary extends Education {
	@Override
	void schoolName() {
		System.out.println("������ �ʵ��б�");
	}
	
	
	
}

class Middle extends Education {
	void schoolName() {
		System.out.println("���� ���� ���б�");
	}
}

class High extends Education {
	void schoolName() {
		System.out.println("�߾� ���� ����б�");
	}
}

class EduInfo {
	void schoolNamePrint(Education edu) {
//		//�ٿ�ĳ����
//		if (edu instanceof High) //� ���� �����ִ��� ���� Ȯ�� : instanceof
//			((High)edu).schoolName();
//		else if (edu instanceof Middle)
//			((Middle)edu).schoolName();
//		else if (edu instanceof Elementary)
//			((Elementary)edu).schoolName();
//		���⼭ �ٷ� edu.schoolName�� �ϰ� �ʹٸ� Ŭ���� ���� ������� �����.
		
		//�������� �̿��Ͽ� ���
		//���� ����� �ڽ� Ŭ������ �޼ҵ带 ����
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
		// info.schoolNamePrint(middle); //���� --> EduInfo Ŭ������ if�� �����ϱ�
		info.schoolNamePrint(middle);
		info.schoolNamePrint(ele);
		
		//new Education(); �߻� Ŭ����(��ü�� ����)�̱� ������ ��ü ���� �Ұ�

	}

}
