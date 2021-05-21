package ex01_class;

import java.util.Arrays;

//å�� Ŭ����

//1. å ���� Ŭ����
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

//2. å ���� Ŭ����
//��� Ȯ��, ��ǰ ���� ����
class Manager {
	private int[] tot = new int[10]; //�Ϸ� ���� � å�� �󸶸�ŭ�� ������ �´��� Ȯ��.
									//10���� �����ϰڴٴ� �ǹ�.
	int[] getTot() {
		return tot;
	}
	//�Ǹűݾ��� ������ �� �ִ� �հ� �����
	//"c8801" = 0�� �ε���, "c8802" = 1�� �ε���, etc.
	
	int sales(Book book, int qty, int index) { //� å�� �󸶳� �ȷȴ��� �˾ƾ��ϱ� ������ �Ű����� ����
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
		Book[] bArr = new Book[10]; //å�� ������ �� �ִ� �迭
		
		bArr[0] = new Book("c8801", "������", 28000, 0.3);
		//Book book1 = new Book("c8801", "�丮å", 28000, 0.3);
//		bArr[0].setBcode("c8801");
		
		bArr[1] = new Book();
		//Book book2 = new Book();
		bArr[1].setBcode("c8802");
		bArr[1].setBname("�̿���");
		bArr[1].setBprice(5000);
		bArr[1].setBsale(0.5);
//		System.out.println(book1);
		
//		System.out.println(book1.sales(3)+ "��");
		
		Manager mg = new Manager();
		System.out.println("        < �� �� �� Ȳ >    ");
		System.out.println(" �ڵ�      å��       �Ǹ� �ݾ�");
		System.out.printf("%-8s %-8s %8d��\n", bArr[0].getBcode(), bArr[0].getBname(), mg.sales(bArr[0], 3, 0));	
		System.out.printf("%-8s %-8s %8d��\n",bArr[1].getBcode(), bArr[1].getBname(), mg.sales(bArr[1], 10, 1));
		
		System.out.println("--------------------------------");
//		System.out.println(mg.getTot());
		System.out.println(Arrays.toString(mg.getTot()));
		
		

	}

}
