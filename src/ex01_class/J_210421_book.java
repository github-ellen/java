package ex01_class;

import java.util.Arrays;

//책방 클래스

//1. 책 관리 클래스
//dto
class Book {
	private String bCode;
	private String bName;
	private int bPrice;
	private double bSale;
	
	public Book() {}
	
	public Book(String bCode, String bName, int bPrice, double bSale) {
		this.bCode = bCode;
		this.bName = bName;
		this.bPrice = bPrice;
		this.bSale = bSale;
	}
	void setBcode(String bCode) {
		this.bCode = bCode;
	}
	void setBname(String bName) {
		this.bName = bName;
	}
	void setBprice(int bPrice) {
		this.bPrice = bPrice;
	}
	void setBsale(double bSale) {
		this.bSale = bSale;
	}

	double getBsale() {
		return bSale;
	}

	String getBname() {
		return bName;
	}
	
	int getBprice() {
		return bPrice;
	}
	String getBcode() {
		return bCode;
	}

	@Override
	public String toString() {
		return "Book [bCode=" + bCode + ", bName=" + bName + ","
				+ "bPrice=" + bPrice + ", bSale=" + bSale + "]";
	}
}

//2. 책 관리 클래스
//재고 확인, 반품 등의 역할
class Manager {
	private int[] tot = new int[10]; //하루 동안 어떤 책이 얼마만큼의 수익을 냈는지 확인.
									//10권을 관리하겠다는 의미.
	int[] getTot() {
		return tot;
	}
	//판매금액을 저장할 수 있는 합계 만들기
	//"c8801" = 0번 인덱스, "c8802" = 1번 인덱스, etc.
	
	int sales(Book book, int qty, int index) { //어떤 책이 얼마나 팔렸는지 알아야하기 때문에 매개변수 수정
//		System.out.println(book);
//		System.out.println(qty);
		String bCode = book.getBcode();
		int price = book.getBprice();
		double sale = book.getBsale();
		int toPrice = (int)(price * (1-sale)) * qty;
		tot[index] += toPrice ;

		return toPrice;
	}
}

public class J_210421_book {

	public static void main(String[] args) {
		Book[] bArr = new Book[10]; //책을 저장할 수 있는 배열
		
		bArr[0] = new Book("c8801", "백종원", 28000, 0.3);
		//Book book1 = new Book("c8801", "요리책", 28000, 0.3);
//		bArr[0].setBcode("c8801");
		
		bArr[1] = new Book();
		//Book book2 = new Book();
		bArr[1].setBcode("c8802");
		bArr[1].setBname("이연복");
		bArr[1].setBprice(5000);
		bArr[1].setBsale(0.5);
//		System.out.println(book1);
		
//		System.out.println(book1.sales(3)+ "원");
		
		Manager mg = new Manager();
		System.out.println("        < 판 매 현 황 >    ");
		System.out.println(" 코드      책명       판매 금액");
		System.out.printf("%-8s %-8s %8d원\n", bArr[0].getBcode(), bArr[0].getBname(), mg.sales(bArr[0], 3, 0));	
		System.out.printf("%-8s %-8s %8d원\n",bArr[1].getBcode(), bArr[1].getBname(), mg.sales(bArr[1], 10, 1));
		
		System.out.println("--------------------------------");
//		System.out.println(mg.getTot());
		System.out.println(Arrays.toString(mg.getTot()));
		
		

	}

}
