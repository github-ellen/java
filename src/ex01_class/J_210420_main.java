package ex01_class;

public class J_210420_main {

	public static void main(String[] args) {
		// (String[] args) ���� ���� ���ñ� ?
//		System.out.println(args.length);
//		for (String i : args) {
//			System.out.println(i);
//		}
//		
//		//��������
		//ID�� PW�� �ƱԸ�Ʈ�� �޾Ƽ�
		//���� ID�� JAVA�̰� PW�� 1111�̸� ������ ���
		//�ƴϸ� �Ϲ� ����� ��� ���
		
		if (args.length > 1 && args[0].equals("java") && args[1].equals("1111")) {
//			String id = args[0];
//			String pw = args[1];
//			if (id.equals("java")) {
//				if (pw.equals("1111")){
					System.out.println("������ ���");
		}
		else
			System.out.println("�Ϲ� ����� ���");
		
		}

	

}