package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J_210423_Exception {

	public static void main(String[] args) {
		//���� ó�� (try ~ catch)
//		int a = 10, b= 0;
//		System.out.println(a/b); //���α׷��� ��������. �̷��� ��츦 ó���ϴ� ���� ���� ó��
		
		Scanner sc = new Scanner(System.in);
		int a=10, b = 0;
//		System.out.print("���� ���� ? : ");
//		try {
//			b = sc.nextInt(); //���ܰ� �߻��� �� �ִ� �����̱� ������ try�� �����ֱ�
//								//���⼭ ���ܰ� �߻����� ��쿡 catch ����.
//			System.out.println(a/b); //b�� 0���� �ʱ�ȭ�� �����̱� ������.
//		} catch (InputMismatchException e) { //���ڷ� �߸� �Է����� ��
//			System.out.println("���ڸ� �Է����ּ���.");
//		} catch (ArithmeticException e) { //'0'�� �Է����� ��
//			System.out.println("0���� ���� �� �����ϴ�.");
//		} catch(Exception e) { //�Ű������� 'Exception e'Ÿ���� �ްڴ�.
//						     	//���ڸ� �־��� ���� ���, 0�� ���� ���� ��� ������
//								//����, '0'�� ������ ��� ���ܸ� ó��.
//								//'Exception e'�� ���� �������� !
//								//catch���� ù �ٿ� �ۼ��ϸ� ���� ����.
//			System.out.println("���ڸ� �Է����ּ���.");
//		}
//		System.out.println("���α׷� ���� ����");
		
		//�ݺ����� �߰��Ѵٸ�,
		while (true) {
			System.out.print("���� ���� ? : ");
			try {
				b = sc.nextInt(); //���ܰ� �߻��� �� �ִ� �����̱� ������ try�� �����ֱ�
									//���⼭ ���ܰ� �߻����� ��쿡 catch ����.
				System.out.println(a/b); //b�� 0���� �ʱ�ȭ�� �����̱� ������.
				break;
			} catch (InputMismatchException e) { //���ڷ� �߸� �Է����� ��
				System.out.println("���ڸ� �Է����ּ���.");
				sc.nextLine(); //b = sc.nextInt();���� �߻��� ����. ���� a�ϰ� ���͸� ������ ��
								//b�� �Էµ��� ���� �����̱� ������
				 	            //System.out.print("���� ���� ? : "); ���� �ݺ�
				e.printStackTrace(); //���ܰ� �߻��� ������ �����Ͽ� ����Ʈ����.
			} catch (ArithmeticException e) { //'0'�� �Է����� ��
				System.out.println("0���� ���� �� �����ϴ�.");
				//���⿡ sc.nextLine();�� ���� ���� ������
				//b�� 0�� �� �����̰� System.out.println(a/b);���� ������ ���� ������.
				e.printStackTrace();
			} catch(Exception e) { //�Ű������� 'Exception e'Ÿ���� �ްڴ�.
							     	//���ڸ� �־��� ���� ���, 0�� ���� ���� ��� ������
									//����, '0'�� ������ ��� ���ܸ� ó��.
									//'Exception e'�� ���� �������� !
									//catch���� ù �ٿ� �ۼ��ϸ� ���� ����.
				System.out.println("���ڸ� �Է����ּ���.");
			}
		}
		System.out.println("���α׷� ���� ����");
		
		//��������
//		int[] arr = {10,20,30};
//		//����ڰ� 1�� �Է��ϸ� 10��, 2�� �Է��ϸ� 20��,... ����ϱ�
//		int user ;
//		try {
//			System.out.print("��ȣ �Է� : "); //���� �����ϱ�!
//												//�Է¹ް� �� ���� user�� ���� �� ���� ���� ����� �Ǵ� ��.
//			user = sc.nextInt();
//			System.out.println(arr[user-1]);
//		}
//		catch (InputMismatchException e) {
//			System.out.println("������ �Է��ϼ���.");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("1,2,3 �߿� ������.");
//		}
//		catch (Exception e) {
//			e.printStackTrace(); //�̰� ���� ���� � ���ܰ� �ߴ��� Ȯ���ϱ�.
//								//�̰��� �������� �� �ߴ� 'InputMismatchException'�� ���� ó��
//		}
		
		//������ ���� : 1)üũ ����(�ݵ�� �����ؾ��Ѵ�) 2)��üũ ����(�ݵ�� �� �ص� ��)
		//üũ ���� : RuntimeException�� ������� ���� ���� - ��Ʈ��ũ�� DB, ���� �� �ܺο� ����Ǵ� �͵�
		//��üũ ���� : RuntimeException�� ����� ����
		//������ ��ĳ�ʷ� �о��
		//������ �о���� �����̱� ������ ���� �����
//		File file = new File("sample.txt");
//
//
//		System.out.println(file); //� ������ �о���̰ڴ�.
//		try {
//			Scanner sc = new Scanner(file); //sc�� ������ �о���ϲ���.		
//			System.out.println("���� �б� ����");
//			//���Ͽ� �ִ� ������ �ϳ��� �о���̱�.
//			//inputstream ���� �����ϱ�
//			while(sc.hasNextLine()) { //�� �پ� �������ϱ� nextLine.
//				String s = sc.nextLine();
//				System.out.println(s);
//			}
//		} catch (FileNotFoundException e) { //üũ ����
//			System.out.println("������ ã�� �� �����ϴ�.");
//			e.printStackTrace();
//		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
