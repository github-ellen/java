package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J_210427_insert {

	public static void main(String[] args) {
		//오라클에 데이터 추가 : insert문
		
		//첫번째 작업
		//DBConn.getConn()을 하면 Connection을 반환해줌
		Connection conn = DBConn.getConn();
		Statement stmt = null;
		PreparedStatement prest ;
		//여섯번째 작업(sql 명령어 하드코딩 방지)
		//입력받는 것으로 처리.
		String itemcode ;
		String itemname ;
		int price ;
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 코드?");
		itemcode = sc.next();
		sc.nextLine();
		System.out.print("상품명?");
		itemname = sc.nextLine();
		System.out.print("상품 가격?");
		price = sc.nextInt();

		//다섯번째 작업(sql문 작성)
		//String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE)VALUES('8805', '우산', '5000')";
		//일곱번째 작업(여섯번째 작업 적용)
		//String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE)VALUES('"+itemcode+"', '"+itemname+"', "+price+")";
		//PreparedStatement prest = conn.prepareStatement(sql);을 실행하면,
		String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE)VALUES(?,?,?)";
		System.out.println(sql);
		//세번째 작업(try~catch)
		try {
			//두번째 작업의 createStatement 사용 안 하려면,
			//conn.prepareStatement(sql); 가 반환해주는 형 확인하기
			prest = conn.prepareStatement(sql);
			//물음표가 3개니까.
			prest.setString(1, itemcode);
			prest.setString(2, itemname);
			prest.setInt(3, price);
			//두번째 작업
			//stmt = conn.createStatement();
			//네번째 작업
			//stmt.executeUpdate(sql)를 하면 int 값을 반환해줌
			//int cnt = stmt.executeUpdate(sql); //적용된 건수 반환
			int cnt = prest.executeUpdate();
			System.out.println(cnt + "건"); //다섯번째 작업을 1번하면 1건.
		} catch (SQLException e) {
			System.out.println("SQL 예외");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
		
	}

}
