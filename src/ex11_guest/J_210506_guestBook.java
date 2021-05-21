package ex11_guest;

import java.util.List;
import java.util.Scanner;

public class J_210506_guestBook {

	public static void main(String[] args) {
		/*
		 * 1. 방명록 작성 2. 방명록 수정 3. 방명록 삭제 4. 방명록 조회 9. 종료
		 */

		// 이러한 데이터를 담을 수 있는 DTO(=Value Object) 생성하기

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 방명록 작성");
			System.out.println("2. 방명록 수정");
			System.out.println("3. 방명록 삭제");
			System.out.println("4. 개인 조회");
			System.out.println("5. 전체 조회");
			int num = sc.nextInt();
			if (num == 1) {
				GuestDAO gdao = new GuestDAOimpl();
				GuestBookDTO gdto = new GuestBookDTO("홍길동", "hong1111@gmail.com", "hgd11", "안녕하세요. 홍길동입니다.");
				int cnt = gdao.insert(gdto);
				System.out.println(cnt + "건 추가 완료");
			} else if (num == 2) {
				GuestDAO gdao = new GuestDAOimpl();
				GuestBookDTO gdto = new GuestBookDTO(2, "홍길동", "hong1111@gmail.com", "hgd11", "안녕하세요.");
				int cnt = gdao.update(gdto);
				System.out.println(cnt + "건 수정 완료");
			} else if (num == 3) {
				GuestDAO gdao = new GuestDAOimpl();
				int cnt = gdao.delete(6);
				System.out.println(cnt + "건 삭제 완료");
			} else if (num == 4) {
				GuestDAO gdao = new GuestDAOimpl();
				GuestBookDTO one = gdao.selectOne(2);
				System.out.println("이름 : " + one.getName() + "\n" + "메일 주소 : " + one.getMail() + "\n" + "인사말 : "
						+ one.getContent());
			} else if (num == 5) {
				GuestDAO gdao = new GuestDAOimpl();
				List<GuestBookDTO> glist = gdao.selectList();
				for (GuestBookDTO list : glist) {
					System.out.println(list.getSeq() + ") " + list.getName() + " / " + list.getMail() + " / "
							+ String.format("%-20s", list.getContent()) + " / " + list.getRegdate());
				}

			}

		}
	}
}
