package ex05_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class J_210422_list {

	public static void main(String[] args) {
		//list �����ӿ�ũ
		//List<E> / ArrayList,
		//Ư¡ : ���� ������ �ִ�(=�ε����� �ִ�), ������ �ߺ� ����
		//1) ArrayList : �迭 ����
		//Ư¡ : �˻��� ������. �߰�, ������ ��ƴ�.
		
//		ArrayList arrlist = new ArrayList();
//		arrlist.add(10);
////		System.out.println(arrlist);
//		arrlist.add("�ڹ�");
//		System.out.println("object ���� �� : "+ arrlist);		
////		arrlist.add("#$");
////		System.out.println(arrlist);
//		
//		ArrayList<Integer> arrlist1 = new ArrayList<>(); //������ �ްڴ�!!!
//		arrlist1.add(10);
//		System.out.println("int���� �� : " + arrlist1);
////		arrlist.add("�ڹ�"); ������!
//		
//		ArrayList<Boolean> arrlist2 = new ArrayList<>();
//		arrlist2.add(true);
////		arrlist2.add(apple); //������!
//		System.out.println("boolean ���� �� : " + arrlist2);
		
		//�ݺ����� Ȱ���Ѵٸ� ?
//		ArrayList<Integer> arrlist = new ArrayList<>(); 
//		arrlist.add(10);
//		arrlist.add(20);
//		arrlist.add(30);
//		for (int i =0 ; i < arrlist.size() ; i++) {
//			System.out.println(arrlist.get(i)+100);
//		}
//		System.out.println("--------------------");
//		//for ~each ���� ?
//		for (int a : arrlist) {
//			System.out.println(a+100);
//		}
//		
		//for������ �ʱ�ȭ�ϱ�
//		arrlist.add(10);
//		arrlist.add(20);
//		arrlist.add(30);
//		System.out.println(arrlist.size());
//		for ( int i =0 ; i < 3 ; i++) { // i < arrlist.size() �Ұ� / ����� �������� ���� �����̱� ������
//			arrlist.add(10*(i+1)) ;
//			System.out.println(arrlist.get(i));
//		}
//		
//		arrlist.remove(1);
//		System.out.println(arrlist);
//		
//		arrlist.add(1, 20); //1�� �ε����� 20�� �ְڴ�.
//		System.out.println(arrlist);
		
		//��������
		//����ڿ��� �Է¹��� ������ �迭 �����
		//�� ���� �Է¹����� ����!!!!!!!!!!!
		Scanner sc = new Scanner(System.in); //Scanner() : ��𼭺��� ������ �޾ƿ� ���ΰ�.
											//System.in : Ű����κ��� ������ �޾ƿ� ���̴�.
//		ArrayList<String> arrS = new ArrayList<>();
//		while (true) {
//			System.out.print("�ܾ� �Է� : ");
//			String s = sc.next();
//			arrS.add(s);
//			if (arrS.contains("����")) {
//				arrS.remove("����");
//				break;
//			}
//		}
//		System.out.println(arrS);
		
//		while (true) {
//			System.out.print("�ܾ� �Է� : ");
//			String s = sc.next();
//			if (s.equals("����")) {
//				break;
//			}
//			arrS.add(s);
//		}
//		System.out.println("�Է��Ͻ� ������� " + arrS + "�Դϴ�.");
////		arrS.set(1, "����Ƽ"); //1�� �ε����� ������ "����Ƽ"�� �ٲ��.
////		System.out.println("�����Ͻ� ������� " + arrS + "�Դϴ�.");
////		arrS.add("����");
//		System.out.println("�����Ͻ� ������� " + arrS + "�Դϴ�.");
//		for (int i = 0 ; i < arrS.size(); i++) {
//			System.out.println((i+1) +":"+ arrS.get(i));
//		}
		
		//�ߺ� �ܾ� ����
		//��� 1��
//		arrS.add("ȫ"); arrS.add("��"); arrS.add("��"); arrS.add("��");
//		for(int i = 0 ; i < arrS.size() ; i ++) {
//			if (arrS.get(i).equals("��"))
//				arrS.remove(i);
//		}
//		System.out.println(arrS);
		
//		//��� 2��(��õ) : �ε����� ��� ��
//		arrS.add("ȫ"); arrS.add("��"); arrS.add("��"); arrS.add("��");
//		System.out.println(arrS);
//		System.out.print("������ �̸��� ? ");
//		String name = sc.next();
//		//�ݺ��� ���� = ��ü ����
//		Iterator<String> it = arrS.iterator() ;
//		while (it.hasNext()) { //���� �����Ͱ� �ִٸ�
//			String n = it.next();
//			if (name.equals(n)){
//				it.remove(); //���� ����Ű�� ���� �����͸� �����ϼ���.
//			}
//		}
//		System.out.println(arrS);
		
//		//��������
//		//����� ���ÿ� �ʱ�ȭ�ϴ� ���
//		List<String> list = Arrays.asList("RED", "YELLOW", "BLUE");
//		Iterator<String> it = list.iterator() ;
//		System.out.println(it);
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		//��������
//		//�л����� Ű�� �Է¹޾� Ű�� ��հ��� ���϶�
//		ArrayList<Double> studentList = new ArrayList<>();
//		List<String> stuName = Arrays.asList("ȫ�浿","���缮","��ȣ��");
//		double sum = 0 ;
//		for (int i = 0 ; i <stuName.size() ; i++) {
//			System.out.print(stuName.get(i)+" �л��� Ű : ");
//			double studentH = sc.nextDouble();
//			studentList.add(studentH);
//		}
//		for (int i = 0 ; i < studentList.size(); i++) {
//			sum += studentList.get(i);
//		}
//		System.out.println("------------------");
//		System.out.println("�л��� Ű�� ���� : " + sum);
//		double avg = sum / studentList.size();
//		System.out.println("�л��� Ű�� ����� : " + (int)avg);
		
		//2) LinkedList : ����Ʈ ��� : �� ��Ұ� �ڽ��� ���� ����� �ּҿ� ���� ����� �ּҸ� ������ �ִ�.
		//Ư¡ : ���߰�, ������ ����. �˻� �� ���� ����.
//		LinkedList<String> llist = new LinkedList<>();
		List<String> llist = new LinkedList<>(); //�� ǥ���� �� �Ϲ���
		llist.add("java");
		llist.add("c++");
		System.out.println(llist);
		for (int i =0 ; i < llist.size() ; i++) {
			System.out.println(llist.get(i));
		}
		
		
		
		
		
		
		
		
		
	}

}
