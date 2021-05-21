package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J_210423_throws {
	
	static void arrayIndex (int index) {
		int[] arr = {10,20,30};
		try {
			System.out.println(arr[index]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0~2�� �Է����ּ���.");
		}
		catch (Exception e) {
			System.out.println("���� �߻�");
		}
	}
	
	//���� ������
	static void arrIndex_throws(int index) throws ArrayIndexOutOfBoundsException  { //��üũ ����
		int[] arr = {10,20,30};
		System.out.println(arr[index]);
	}
	
	//üũ ���ܱ� ������ ������(ȣ���� ��)�� ó���������.
	static void fileRead(String fileName) throws FileNotFoundException { 
		File file = new File(fileName);
		System.out.println(file); //� ������ �о���̰ڴ�.
		Scanner sc = new Scanner(file , "utf-8"); //sc�� ������ �о���ϲ���.
												//�ҷ����� ������ ���ڵ� ���� �ۼ�. ���� ���� ��Ŭ���� ������ MS949�� ������ �о������ ����.
												//�׷��� ������ ���ڵ� ������ �ۼ��ؾ���.
		System.out.println("���� �б� ����");
		//���Ͽ� �ִ� ������ �ϳ��� �о���̱�.
		//inputstream ���� �����ϱ�
		while(sc.hasNextLine()) { //�� �پ� �������ϱ� nextLine.
			String s = sc.nextLine();
			System.out.println(s);
			}
		
		
	}
	
	public static void main(String[] args) {
		//throws : ���ܴ�����
		//throws �ϴ� ���� : �ڵ��� ������� �������� �������� ������.  
//		J_210423_throws.arrayIndex(4);
//		
//		try { //���ܸ� ������ ������ ���⼭ ���� ó�����־����.
//			J_210423_throws.arrIndex_throws(4);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("throws�� ó�� : �߸��� �ε���");
//		}
//		catch (Exception e) {
//			System.out.println("���� �߻�");
//		}
		
		try {
			J_210423_throws.fileRead("sample.txt");
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			e.printStackTrace();
		}
		
		
		
		

	}

}
