package ex01_class;

import java.util.Scanner;

//��ǰ Ŭ����
class Item{
	//private : ���������� ���� (public�� �ݴ� ����)
	//private : Ŭ���� ���ο����� ���� ���� //���� ���¿����� 'class Item' ������ ��� ����.
											//���� �Լ� �������� ��� �Ұ�
	private String itemCode ;//= "880456789";
	private String itemName ;//= "���̾� �ʷο�" ;
	private int price = 18000;
	
	int sum(int qty){ //�Ǹűݾ� ����
		return price * qty;
	}	
	//�޼ҵ带 �̿��Ͽ� ���� ����.
	//����(Setter) : ������ ���ϰ� ����.
	void setItemcode(String itemCode) {
		//������ �ڵ带 �޾Ƽ� �� itemCode�� �Ѱ��ִ� ���� ����
		this.itemCode = itemCode;//�� ���� �̸��� ���� ������ ������������ this ����.
								//�Ű������� ���� itemCode�� �ʵ� ������ �ʱ�ȭ
	}
	void setItemname(String itemName) {
		this.itemName = itemName;
	}
	void setPrice(int price) {
		this.price = price;
	}
	//������ �ڵ带 �о�ͼ� ��ȯ�ϰ� �ʹٸ�
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
		System.out.printf("�Ǹ� �ݾ� : %,d��\n", prod1.sum(3)); //���̾� �ʷο�
		
		Item prod2 = new Item();
		System.out.printf("�Ǹ� �ݾ� : %,d��\n", prod2.sum(7)); //���̾� �ʷο�
		
		//�ʵ忡 �ʱ�ȭ�� ���� �ʰ�(�ϵ��ڵ� �����ʰ�)
		prod1.setItemcode("8801");
		prod1.setItemname("��ġ ����");
		prod1.setPrice(5800);
		System.out.printf("\n"+ prod1.getItemname()+") �Ǹ� �ݾ� : %,d��\n", prod1.sum(3));
	
		prod2.setItemcode("8805");
		prod2.setItemname("���̾� ����");
		prod2.setPrice(5200);
		
		System.out.printf(prod2.getItemname() +")�Ǹ� �ݾ� : %,d��\n", prod2.sum(5));
	}

}