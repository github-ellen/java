package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ex07_jdbc.DBConn;

public class J_210427_member {

	public static void main(String[] args) {
		boolean loginCheck = false;
		Scanner sc = new Scanner(System.in);
		Connection conn = DBConn.getConn();
		PreparedStatement preS;
		MemberDAO mdao = new MemberDAO(); // MemberDAO Ŭ���� ����Ϸ��� ��ü �����ؾ��ϴϱ�!
		String loginUserid = " ";
		String pw;
		String birth;

		System.out.println("  <<<�޴�>>>");
		while (true) {
			System.out.println("*******************");
			System.out.println(loginUserid + " ȸ���� ȯ���մϴ�.");
			System.out.println("0. ȸ�� ����");
			System.out.println("1. �α���");
			System.out.println("2. ȸ�� ���� ����");
			System.out.println("3. ���� ȸ�� ��ȸ");
			System.out.println("4. ��ü ȸ�� ��ȸ");
			System.out.println("5. ȸ�� Ż��");
			System.out.println("9. ����");
			System.out.println("*******************");
			System.out.println("�޴��� �����ϼ���.");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("ȸ������ �������Դϴ�.\n");
				String userid;
				while (true) {
					while (true) {
						System.out.print("���̵� : ");
						userid = sc.next();
						// ���̵� �ߺ� üũ
						// ���̵� ��ȸ�� �ȴٸ� �ߺ��̶�� �ǹ��̱� ������ selectOne ���
						MemberDTO mdto = mdao.selectOne(userid); // selectOne�� MemberDTO�� ��ȯ���ش�.
						if (mdto != null) { // = �����Ͱ� �ִٸ�.
							System.out.println("�ߺ��� ���̵��Դϴ�.");
							continue;
						}
						break;
							
					} 
					System.out.print("��й�ȣ : ");
					pw = sc.next();
					while (true) {
						System.out.print("���� : ");
						try {
							birth = sc.next();
							Integer.parseInt(birth);
							break;
						} catch (NumberFormatException e) {
							System.out.println("������ Ȯ�����ּ���.");
							sc.nextLine();
						}
					}
					MemberDTO mdto = new MemberDTO(userid, pw, birth);
					int cnt = mdao.insert(mdto);
					if (cnt > 0) {
						System.out.println(userid + "�� ȯ���մϴ�.\n");
					} else {
						System.out.println("ȸ������ ����");
					}
					System.out.println("�߰��Ͻðڽ��ϱ� ? Y/N ");
					String anw = sc.next();
					if (anw.equals("Y") | anw.equals("y")) {
						continue;
					}
					break;
				}
			} else if (num == 1) { // �α���
				// userid�� �������� �ʴ� ���
				// selectOne���� �ذ�
				System.out.print("���̵� : ");
				String userid = sc.next();
				System.out.print("��й�ȣ : ");
				pw = sc.next();
				// selectOne�� mdao�� ����.
				MemberDTO mdto = mdao.selectOne(userid);
				// System.out.println(mdto);
				// mdto���� ���̵�, ���, ����, ���������� �ʵ尡 �������
				// ���̵� ���� ���θ� Ȯ���ϸ� �Ǵϱ� NULL(���̵� �������� ���� ��)���� �ƴ��� ���θ� Ȯ���ϱ�.
				if (mdto == null) { // ���̵� �������� �ʴ´ٸ�(=��ü�� �������� �ʾ���)
					System.out.println("���̵� Ȯ�����ּ���.");
					loginCheck = false; // ��α��� ��� ���.
				} else
				// mdto�� ������ ����ִٸ�
				// pw�� ��ġ���� �ʴ� ���
				// ���̵� ���� üũ �Ŀ� ��й�ȣ üũ
				if (pw.equals(mdto.getPw())) {
					System.out.println("�α��� ����");
					loginCheck = true;
					loginUserid = userid;
				} else {
					System.out.println("��й�ȣ�� Ȯ�����ּ���.");
//					System.out.println("��й�ȣ�� �ٽ� �Է��Ͻðڽ��ϱ� ? Y / N");
//					String reT = sc.next();
//					if (reT.equals("Y") | reT.equals("y"))
//						continue;
//					else
//						break;
				}

			} else if (num == 2) {
				//�α��ε� ���̵� ������ ������ �� �ִ�.
				//���� ���� ��ȸ �� ���� ������ ���� ����
				System.out.print("������ ���̵� : ");
				String userid = sc.next(); // PK�� ������ ��ƴ�.
				System.out.print("���� ��й�ȣ : ");
				pw = sc.next(); // ������ ����
				System.out.print("���� ���� : ");
				birth = sc.next(); // ������ ����
				MemberDTO mdto = new MemberDTO(userid, pw, birth);
				// �켱 ������ �޾Ƴ��� �Ŀ� ������Ʈ �޼ҵ� �ҷ�����.
				// update �޼ҵ带 �ҷ����� update �޼ҵ忡�� ���� �۾� ����.
				// �� ������� cnt�� ��ȯ�ϰڴ�.
				int cnt = mdao.update(mdto);
				if (cnt > 0) {
					System.out.println("���� ���� �Ϸ�\n");
				} else
					System.out.println("���� ���� ����");

			} else if (num == 3) {
				System.out.print("ȸ�� ���̵� : ");
				String userid = sc.next();
				MemberDTO mdto = mdao.selectOne(userid); // userid�� �Է¹ޱ�
				System.out.println(
						"ID : " + mdto.getUserid() + ", ���� : " + mdto.getBirth() + ", ���� ���� : " + mdto.getRegdate());

			} else if (num == 4) {
				if (!loginCheck) {
					System.out.println("�α������ּ���.");
					continue;
				}
				List<MemberDTO> mList = mdao.selectList();
				// mList�� �ּҸ� ������ ����.
				for (int i = 0; i < mList.size(); i++) {
					// System.out.println(mList.get(i));
					// mList �迭���� i��° �ε����� �ִ� �ʵ带 ��������
					System.out.println("ȸ�� " + (i + 1) + " : " + mList.get(i).getUserid());

				}
			} else if (num == 5) {
				//�α��ε� ������ ���� ����
				if (!loginCheck) {
					System.out.println("�α������ּ���.");
					continue;
				}
				System.out.println("ȸ�� Ż�� �������Դϴ�.\n");
				System.out.print("Ż���� ���̵� : ");
				String userid = sc.next();
				//�α��ε� ������ ��ġ�ϴ��� Ȯ���ؾ���.
				if (!loginUserid.equals(userid)) {
					System.out.println("���� ������ �����ϴ�.");
					continue;
				}
				int cnt = mdao.delete(userid);
				if (cnt > 0) {
					System.out.println(userid + "���� ������ �����Ǿ����ϴ�.");
				} else
					System.out.println("���� ����");

			} else if (num == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("�����մϴ�.");

				System.exit(0);
			}
		}

	}

}
