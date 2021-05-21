package ex07_jdbc.sales;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test() {
		SalesDAO sdao = new SalesDAO();
		// sdao.dayItemSalesList(); 가 돌려주는 형을 왼쪽에 입력

		// 출력
		// 여기 복습 필요 !!!
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
			System.out.println("상품 코드 : " + m.get("itemcode"));
			System.out.println("상품명 : " + m.get("itemname"));
			System.out.println("수량 : " + m.get("qty"));
			System.out.println("합계 : " + m.get("amount"));
			System.out.println("----------------------");

		}
	}
	
	@Test
	void test3() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list = sdao.dayItemSalesTotal("2021-04-29");
		//날짜 형식을 20210429로 받고 싶다면
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
