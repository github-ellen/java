package ex11_guest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class GuestBook_Junit {

	@Test
	void testInsert() {
		GuestDAO gdao = new GuestDAOimpl();

		GuestBookDTO gdto = new GuestBookDTO("홍길동", "hong1111@gmail.com", "hgd11", "안녕하세요. 홍길동입니다.");
		int cnt = gdao.insert(gdto);
		System.out.println(cnt + "건 추가 완료");
	}

	@Test
	void testUpdate() {
		GuestDAO gdao = new GuestDAOimpl();
		GuestBookDTO gdto = new GuestBookDTO(2, "홍길동", "hong1111@gmail.com", "hgd11", "안녕하세요.");
		int cnt = gdao.update(gdto);
		System.out.println(cnt + "건 수정 완료");
	}

	@Test
	void testDelete() {
		GuestDAO gdao = new GuestDAOimpl();
		int cnt = gdao.delete(8);
		System.out.println(cnt +"건 삭제 완료");
	}

	@Test
	void testSelectOne() {
		GuestDAO gdao = new GuestDAOimpl();
		GuestBookDTO gdto = gdao.selectOne(2);
		System.out.println(gdto.getSeq()+" ) 이름 : " + gdto.getName() + "\n"
							+ " 메일 주소 : " + gdto.getMail() + "\n"
							+ " 인사말 : " + gdto.getContent() + "\n"
							+ " 작성 일자 : " + gdto.getRegdate());
	}

	@Test
	void testSelectList() {
		GuestDAO gdao = new GuestDAOimpl();
		List<GuestBookDTO> glist = gdao.selectList();
		for (GuestBookDTO list : glist) {
			System.out.println(list.getSeq()+") " + list.getName()+ " / "+ list.getMail() +" / "+ String.format("%-20s", list.getContent()) +" / "+ list.getRegdate());
		}

	}

}
