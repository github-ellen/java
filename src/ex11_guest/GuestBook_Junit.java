package ex11_guest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class GuestBook_Junit {

	@Test
	void testInsert() {
		GuestDAO gdao = new GuestDAOimpl();

		GuestBookDTO gdto = new GuestBookDTO("ȫ�浿", "hong1111@gmail.com", "hgd11", "�ȳ��ϼ���. ȫ�浿�Դϴ�.");
		int cnt = gdao.insert(gdto);
		System.out.println(cnt + "�� �߰� �Ϸ�");
	}

	@Test
	void testUpdate() {
		GuestDAO gdao = new GuestDAOimpl();
		GuestBookDTO gdto = new GuestBookDTO(2, "ȫ�浿", "hong1111@gmail.com", "hgd11", "�ȳ��ϼ���.");
		int cnt = gdao.update(gdto);
		System.out.println(cnt + "�� ���� �Ϸ�");
	}

	@Test
	void testDelete() {
		GuestDAO gdao = new GuestDAOimpl();
		int cnt = gdao.delete(8);
		System.out.println(cnt +"�� ���� �Ϸ�");
	}

	@Test
	void testSelectOne() {
		GuestDAO gdao = new GuestDAOimpl();
		GuestBookDTO gdto = gdao.selectOne(2);
		System.out.println(gdto.getSeq()+" ) �̸� : " + gdto.getName() + "\n"
							+ " ���� �ּ� : " + gdto.getMail() + "\n"
							+ " �λ縻 : " + gdto.getContent() + "\n"
							+ " �ۼ� ���� : " + gdto.getRegdate());
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
