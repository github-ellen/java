package ex07_jdbc.sales;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test() {
		SalesDAO sdao = new SalesDAO();
		// sdao.dayItemSalesList(); �� �����ִ� ���� ���ʿ� �Է�

		// ���
		// ���� ���� �ʿ� !!!
		List<Map<String, Object>> list = sdao.dayItemSalesList();
		
//		for (int i = 0 ; i<list.size(); i++) {
//			Map<String, Object> map = list.get(i);
//			System.out.println(map);
//			System.out.println(map.get("itemcode"));
//			System.out.println(map.get("itemname"));
//		}
		for (Map<String, Object> m : list) {
			System.out.println(m.get("itemcode"));
			System.out.println(m.get("itemname"));
			System.out.println(m.get("price"));
			System.out.println(m.get("qty"));
			System.out.println(m.get("amount"));
			System.out.println(m.get("salesdate"));
			System.out.println("----------------------");
		}
	}

	@Test
	void test2() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list = sdao.prodSales();
		for (Map<String, Object> m : list) {
			System.out.println(m.get("salesdate"));
			System.out.println("��ǰ �ڵ� : " + m.get("itemcode"));
			System.out.println("��ǰ�� : " + m.get("itemname"));
			System.out.println("���� : " + m.get("qty"));
			System.out.println("�հ� : " + m.get("amount"));
			System.out.println("----------------------");

		}
	}
	
	@Test
	void test3() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list = sdao.dayItemSalesTotal("2021-04-29");
		//��¥ ������ 20210429�� �ް� �ʹٸ�
		//SalesDAO sdao = new SalesDAO();	
 		//System.out.println(salesdate);
		//List<Map<String, Object>> list = sdao.dayItemSalesTotal(salesdate);
		//System.out.println(list);
		for(Map<String, Object> map : list) {
			System.out.println("ITEMCODE : "+map.get("itemcode")+"\t\t ITEMNAME : "+map.get("itemname")
								+ "\t\t PRICE : "+map.get("price")+"\t\t AMOUNT : " + map.get("amount")
								+ "\t\t NOTE : "+map.get("note"));
		
		
		}
	}
	
	@Test
	void test4() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list = sdao.useView("2021-04-29");
		for(Map<String, Object> map : list) {
			System.out.println("ITEMCODE : "+map.get("itemcode")+"\t\t ITEMNAME : "+map.get("itemname")
								+ "\t\t PRICE : "+map.get("price")+"\t\t AMOUNT : " + map.get("amount")
								+ "\t\t NOTE : "+map.get("note"));
		}
	}
	
	
	
	
	
}
