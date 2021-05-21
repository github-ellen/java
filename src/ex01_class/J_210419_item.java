package ex01_class;

import java.util.Scanner;

//상품 클래스
class Item{
	//private : 접근제한자 종류 (public과 반대 개념)
	//private : 클래스 내부에서만 접근 가능 //현재 상태에서는 'class Item' 에서만 사용 가능.
											//메인 함수 내에서는 사용 불가
	private String itemCode ;//= "880456789";
	private String itemName ;//= "라이언 필로우" ;
	private int price = 18000;
	
	int sum(int qty){ //판매금액 리턴
		return price * qty;
	}	
	//메소드를 이용하여 접근 가능.
	//세터(Setter) : 무조건 리턴값 없음.
	void setItemcode(String itemCode) {
		//아이템 코드를 받아서 위 itemCode에 넘겨주는 것이 목적
		this.itemCode = itemCode;//두 개의 이름이 같기 때문에 구분지으려고 this 붙임.
								//매개변수로 받은 itemCode를 필드 값으로 초기화
	}
	void setItemname(String itemName) {
		this.itemName = itemName;
	}
	void setPrice(int price) {
		this.price = price;
	}
	//아이템 코드를 읽어와서 반환하고 싶다면
	//getter
	String getItemcode() {
		return itemCode;
	}
	
	String getItemname() {
		return itemName;
	}
	int getPrice() {
		return price;
	}
}


public class J_210419_item {
	public static void main(String[] args) {
		Item prod1 = new Item();
		System.out.printf("판매 금액 : %,d원\n", prod1.sum(3)); //라이언 필로우
		
		Item prod2 = new Item();
		System.out.printf("판매 금액 : %,d원\n", prod2.sum(7)); //라이언 필로우
		
		//필드에 초기화를 하지 않고(하드코딩 하지않고)
		prod1.setItemcode("8801");
		prod1.setItemname("피치 모자");
		prod1.setPrice(5800);
		System.out.printf("\n"+ prod1.getItemname()+") 판매 금액 : %,d원\n", prod1.sum(3));
	
		prod2.setItemcode("8805");
		prod2.setItemname("라이언 모자");
		prod2.setPrice(5200);
		
		System.out.printf(prod2.getItemname() +")판매 금액 : %,d원\n", prod2.sum(5));
	}

}