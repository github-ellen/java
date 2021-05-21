package ex11_guest;

import java.util.List;
import java.util.Scanner;

public class J_210506_guestBook {

	public static void main(String[] args) {
		/*
		 * 1. ���� �ۼ� 2. ���� ���� 3. ���� ���� 4. ���� ��ȸ 9. ����
		 */

		// �̷��� �����͸� ���� �� �ִ� DTO(=Value Object) �����ϱ�

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. ���� �ۼ�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ��ȸ");
			System.out.println("5. ��ü ��ȸ");
			int num = sc.nextInt();
			if (num == 1) {
				GuestDAO gdao = new GuestDAOimpl();
				GuestBookDTO gdto = new GuestBookDTO("ȫ�浿", "hong1111@gmail.com", "hgd11", "�ȳ��ϼ���. ȫ�浿�Դϴ�.");
				int cnt = gdao.insert(gdto);
				System.out.println(cnt + "�� �߰� �Ϸ�");
			} else if (num == 2) {
				GuestDAO gdao = new GuestDAOimpl();
				GuestBookDTO gdto = new GuestBookDTO(2, "ȫ�浿", "hong1111@gmail.com", "hgd11", "�ȳ��ϼ���.");
				int cnt = gdao.update(gdto);
				System.out.println(cnt + "�� ���� �Ϸ�");
			} else if (num == 3) {
				GuestDAO gdao = new GuestDAOimpl();
				int cnt = gdao.delete(6);
				System.out.println(cnt + "�� ���� �Ϸ�");
			} else if (num == 4) {
				GuestDAO gdao = new GuestDAOimpl();
				GuestBookDTO one = gdao.selectOne(2);
				System.out.println("�̸� : " + one.getName() + "\n" + "���� �ּ� : " + one.getMail() + "\n" + "�λ縻 : "
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
