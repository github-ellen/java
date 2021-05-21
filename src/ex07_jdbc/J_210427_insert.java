package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J_210427_insert {

	public static void main(String[] args) {
		//����Ŭ�� ������ �߰� : insert��
		
		//ù��° �۾�
		//DBConn.getConn()�� �ϸ� Connection�� ��ȯ����
		Connection conn = DBConn.getConn();
		Statement stmt = null;
		PreparedStatement prest ;
		//������° �۾�(sql ��ɾ� �ϵ��ڵ� ����)
		//�Է¹޴� ������ ó��.
		String itemcode ;
		String itemname ;
		int price ;
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ �ڵ�?");
		itemcode = sc.next();
		sc.nextLine();
		System.out.print("��ǰ��?");
		itemname = sc.nextLine();
		System.out.print("��ǰ ����?");
		price = sc.nextInt();

		//�ټ���° �۾�(sql�� �ۼ�)
		//String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE)VALUES('8805', '���', '5000')";
		//�ϰ���° �۾�(������° �۾� ����)
		//String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE)VALUES('"+itemcode+"', '"+itemname+"', "+price+")";
		//PreparedStatement prest = conn.prepareStatement(sql);�� �����ϸ�,
		String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE)VALUES(?,?,?)";
		System.out.println(sql);
		//����° �۾�(try~catch)
		try {
			//�ι�° �۾��� createStatement ��� �� �Ϸ���,
			//conn.prepareStatement(sql); �� ��ȯ���ִ� �� Ȯ���ϱ�
			prest = conn.prepareStatement(sql);
			//����ǥ�� 3���ϱ�.
			prest.setString(1, itemcode);
			prest.setString(2, itemname);
			prest.setInt(3, price);
			//�ι�° �۾�
			//stmt = conn.createStatement();
			//�׹�° �۾�
			//stmt.executeUpdate(sql)�� �ϸ� int ���� ��ȯ����
			//int cnt = stmt.executeUpdate(sql); //����� �Ǽ� ��ȯ
			int cnt = prest.executeUpdate();
			System.out.println(cnt + "��"); //�ټ���° �۾��� 1���ϸ� 1��.
		} catch (SQLException e) {
			System.out.println("SQL ����");
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
		
		
	}

}
