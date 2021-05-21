package ex07_jdbc.member;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class JunitTest {
	MemberDAO mdao = new MemberDAO();

	@Test
	void testSelectList() {
		List<MemberDTO> mList = mdao.selectList();
		System.out.println(mList);
		assertNotEquals(0, mList.size()); //�����Ͱ� ������ ����
	}

	@Test
	void testSelectOne() {
		String userid = "SHI";
		MemberDTO mdto = mdao.selectOne(userid);
		System.out.println(mdto);
		assertNotNull(mdto); //mdto�� null�� �ƴ϶�� ����
	}

	@Test
	void testInsert() {
		String userid = "park";
		String pw = "1234";
		String birth = "1011";
		MemberDTO mdto = new MemberDTO(userid, pw, birth);
		int cnt = mdao.insert(mdto);
		assertNotEquals(0, cnt); //�� �޼ҵ忡 ���Ͽ� ����, ���� ����
								//cnt�� 0�� �ƴϸ� ����
		//assertEquals(1, cnt); cnt�� 1�̸� ����
	}

	@Test
	void testUpdate() {
		String userid = "java";
		String pw = "2002";
		String birth = "1111";
		MemberDTO mdto = new MemberDTO(userid, pw, birth);
		int cnt = mdao.update(mdto);
		assertEquals(1, cnt);
	}

	@Test
	void testDelete() {
		String userid = "park";
		int cnt = mdao.delete(userid);
		assertEquals(1, cnt);
	}

}
