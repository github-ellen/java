package ex10_interface;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

interface Call {
	void call();
}

interface TakePhoto {
	void takePhoto();
}

interface Memo {
	void memo();
}

//��ȭ, ����
class OldPhone implements Call, TakePhoto {

	@Override
	public void takePhoto() {
		System.out.println("���� �� _ ���� �Կ��� �����մϴ�.");
	}

	@Override
	public void call() {
		System.out.println("���� �� _ ��ȭ�� �߽��մϴ�.");
	}

}

//��ȭ, ����, �޸�
class NewPhone implements Call, TakePhoto, Memo {

	@Override
	public void memo() {
		System.out.println("�� �� _ �޸� �����մϴ�.");

	}

	@Override
	public void takePhoto() {
		System.out.println("�� �� _ ���� �Կ��� �����մϴ�.");

	}

	@Override
	public void call() {
		System.out.println("�� �� _ ��ȭ�� �߽��մϴ�.");
	}
}

//���׽�Ʈ Ŭ����
class UsePhone {
	void call(Call p) {
		p.call();
	}
	void photo(TakePhoto p) {
		p.takePhoto();
	}
	void memo(Memo p) {
		p.memo();
	}

}

public class J_210504_myCellPhone {
	public static void main(String[] args) {
		OldPhone oldp = new OldPhone();
		oldp.call();
		NewPhone newp = new NewPhone();
		UsePhone usep = new UsePhone();
		usep.call(oldp);
		usep.call(newp);
		usep.memo(newp);

		Scanner sc = new Scanner(System.in);
//		Timer timer = new Timer();

//		while (true) {
//			System.out.println("MENU");
//			System.out.println("1. ��ȭ");
//			System.out.println("2. ī�޶�");
//			System.out.println("3. �޸���");
//			int menu = sc.nextInt();
//			if (menu == 1) {
//				System.out.println("���� ��ȭ��ȣ");
//				sc.nextInt();
//				newp.call();
//				TimerTask tt = new TimerTask() {
//					public void run() {
//						System.out.println("��ȭ�� �����մϴ�.");
//					}
//				};
//				timer.schedule(tt, 2000);
//				break;
//			}
//			else if (menu == 2) {
//				newp.takePhoto();
//			}
//		}

	}

}
