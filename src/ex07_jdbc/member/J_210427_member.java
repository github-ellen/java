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
		MemberDAO mdao = new MemberDAO(); // MemberDAO 클래스 사용하려면 객체 생성해야하니까!
		String loginUserid = " ";
		String pw;
		String birth;

		System.out.println("  <<<메뉴>>>");
		while (true) {
			System.out.println("*******************");
			System.out.println(loginUserid + " 회원님 환영합니다.");
			System.out.println("0. 회원 가입");
			System.out.println("1. 로그인");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 개인 회원 조회");
			System.out.println("4. 전체 회원 조회");
			System.out.println("5. 회원 탈퇴");
			System.out.println("9. 종료");
			System.out.println("*******************");
			System.out.println("메뉴를 선택하세요.");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("회원가입 페이지입니다.\n");
				String userid;
				while (true) {
					while (true) {
						System.out.print("아이디 : ");
						userid = sc.next();
						// 아이디 중복 체크
						// 아이디 조회가 된다면 중복이라는 의미이기 때문에 selectOne 사용
						MemberDTO mdto = mdao.selectOne(userid); // selectOne은 MemberDTO를 반환해준다.
						if (mdto != null) { // = 데이터가 있다면.
							System.out.println("중복된 아이디입니다.");
							continue;
						}
						break;
							
					} 
					System.out.print("비밀번호 : ");
					pw = sc.next();
					while (true) {
						System.out.print("생일 : ");
						try {
							birth = sc.next();
							Integer.parseInt(birth);
							break;
						} catch (NumberFormatException e) {
							System.out.println("생일을 확인해주세요.");
							sc.nextLine();
						}
					}
					MemberDTO mdto = new MemberDTO(userid, pw, birth);
					int cnt = mdao.insert(mdto);
					if (cnt > 0) {
						System.out.println(userid + "님 환영합니다.\n");
					} else {
						System.out.println("회원가입 실패");
					}
					System.out.println("추가하시겠습니까 ? Y/N ");
					String anw = sc.next();
					if (anw.equals("Y") | anw.equals("y")) {
						continue;
					}
					break;
				}
			} else if (num == 1) { // 로그인
				// userid가 존재하지 않는 경우
				// selectOne으로 해결
				System.out.print("아이디 : ");
				String userid = sc.next();
				System.out.print("비밀번호 : ");
				pw = sc.next();
				// selectOne은 mdao에 있음.
				MemberDTO mdto = mdao.selectOne(userid);
				// System.out.println(mdto);
				// mdto에는 아이디, 비번, 생일, 가입일자의 필드가 들어있음
				// 아이디 존재 여부만 확인하면 되니까 NULL(아이디가 존재하지 않을 때)인지 아닌지 여부만 확인하기.
				if (mdto == null) { // 아이디가 존재하지 않는다면(=객체가 생성되지 않았음)
					System.out.println("아이디를 확인해주세요.");
					loginCheck = false; // 재로그인 경우 대비.
				} else
				// mdto에 정보가 들어있다면
				// pw가 일치하지 않는 경우
				// 아이디 먼저 체크 후에 비밀번호 체크
				if (pw.equals(mdto.getPw())) {
					System.out.println("로그인 성공");
					loginCheck = true;
					loginUserid = userid;
				} else {
					System.out.println("비밀번호를 확인해주세요.");
//					System.out.println("비밀번호를 다시 입력하시겠습니까 ? Y / N");
//					String reT = sc.next();
//					if (reT.equals("Y") | reT.equals("y"))
//						continue;
//					else
//						break;
				}

			} else if (num == 2) {
				//로그인된 아이디 정보만 수정할 수 있다.
				//기존 정보 조회 후 수정 정보와 같이 전달
				System.out.print("수정할 아이디 : ");
				String userid = sc.next(); // PK라 수정이 어렵다.
				System.out.print("변경 비밀번호 : ");
				pw = sc.next(); // 수정할 내용
				System.out.print("변경 생일 : ");
				birth = sc.next(); // 수정할 내용
				MemberDTO mdto = new MemberDTO(userid, pw, birth);
				// 우선 정보를 받아놓은 후에 업데이트 메소드 불러오기.
				// update 메소드를 불러오면 update 메소드에서 갱신 작업 시작.
				// 그 결과값을 cnt로 반환하겠다.
				int cnt = mdao.update(mdto);
				if (cnt > 0) {
					System.out.println("정보 수정 완료\n");
				} else
					System.out.println("정보 수정 실패");

			} else if (num == 3) {
				System.out.print("회원 아이디 : ");
				String userid = sc.next();
				MemberDTO mdto = mdao.selectOne(userid); // userid는 입력받기
				System.out.println(
						"ID : " + mdto.getUserid() + ", 생일 : " + mdto.getBirth() + ", 가입 일자 : " + mdto.getRegdate());

			} else if (num == 4) {
				if (!loginCheck) {
					System.out.println("로그인해주세요.");
					continue;
				}
				List<MemberDTO> mList = mdao.selectList();
				// mList는 주소를 가지고 있음.
				for (int i = 0; i < mList.size(); i++) {
					// System.out.println(mList.get(i));
					// mList 배열에서 i번째 인덱스에 있는 필드를 빼오려면
					System.out.println("회원 " + (i + 1) + " : " + mList.get(i).getUserid());

				}
			} else if (num == 5) {
				//로그인된 정보만 삭제 가능
				if (!loginCheck) {
					System.out.println("로그인해주세요.");
					continue;
				}
				System.out.println("회원 탈퇴 페이지입니다.\n");
				System.out.print("탈퇴할 아이디 : ");
				String userid = sc.next();
				//로그인된 정보와 일치하는지 확인해야함.
				if (!loginUserid.equals(userid)) {
					System.out.println("삭제 권한이 없습니다.");
					continue;
				}
				int cnt = mdao.delete(userid);
				if (cnt > 0) {
					System.out.println(userid + "님의 정보가 삭제되었습니다.");
				} else
					System.out.println("삭제 실패");

			} else if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("감사합니다.");

				System.exit(0);
			}
		}

	}

}
