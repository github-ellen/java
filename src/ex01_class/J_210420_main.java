package ex01_class;

public class J_210420_main {

	public static void main(String[] args) {
		// (String[] args) 에는 뭐가 들어올까 ?
//		System.out.println(args.length);
//		for (String i : args) {
//			System.out.println(i);
//		}
//		
//		//연습문제
		//ID와 PW를 아규먼트로 받아서
		//만약 ID가 JAVA이고 PW가 1111이면 관리자 모드
		//아니면 일반 사용자 모드 출력
		
		if (args.length > 1 && args[0].equals("java") && args[1].equals("1111")) {
//			String id = args[0];
//			String pw = args[1];
//			if (id.equals("java")) {
//				if (pw.equals("1111")){
					System.out.println("관리자 모드");
		}
		else
			System.out.println("일반 사용자 모드");
		
		}

	

}