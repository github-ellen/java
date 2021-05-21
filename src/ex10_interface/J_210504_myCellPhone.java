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

//전화, 사진
class OldPhone implements Call, TakePhoto {

	@Override
	public void takePhoto() {
		System.out.println("옛날 폰 _ 사진 촬영을 시작합니다.");
	}

	@Override
	public void call() {
		System.out.println("옛날 폰 _ 전화를 발신합니다.");
	}

}

//전화, 사진, 메모
class NewPhone implements Call, TakePhoto, Memo {

	@Override
	public void memo() {
		System.out.println("새 폰 _ 메모를 시작합니다.");

	}

	@Override
	public void takePhoto() {
		System.out.println("새 폰 _ 사진 촬영을 시작합니다.");

	}

	@Override
	public void call() {
		System.out.println("새 폰 _ 전화를 발신합니다.");
	}
}

//폰테스트 클래스
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
//			System.out.println("1. 전화");
//			System.out.println("2. 카메라");
//			System.out.println("3. 메모장");
//			int menu = sc.nextInt();
//			if (menu == 1) {
//				System.out.println("상대방 전화번호");
//				sc.nextInt();
//				newp.call();
//				TimerTask tt = new TimerTask() {
//					public void run() {
//						System.out.println("통화를 종료합니다.");
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
