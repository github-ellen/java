package basic01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J_210415_array {

	public static void main(String[] args) {
		// �迭
//		int[] arr ; //�迭�� ���� ������ �� �ִ� �迭�� ������ ��.
//					//������ Stack�� �����.
//		//new int[5]; //�������� ������ �Ҵ��̱� ������ ����� ���ԵǾ����.
//		arr = new int[5]; //new int[5];�� ���� �� �� �ּҸ� ������ ���� �����.
//							//��ü�� �����ؼ� �ּҸ� arr�� �����ϰڴ�.
//		arr[0] = 10;
//		System.out.println(arr[0]);
		
//		int[] arr = new int[5];
//		for (int i = 0 ; i <5 ; i++) {
//			System.out.println(arr[i]); //heap�� ��������� ������ �ڵ� �ʱ�ȭ
//		}
		
//		int[] arr = new int[5];
//		//1~5 �� �����Ϸ��� ?
//		for (int i = 0 ; i <5 ; i++) {
//			System.out.println(arr[i]+(i+1));
//		}
		
		//�Ǵ�
//		int[] arr = new int[5];
//		//1~5 �� �����Ϸ��� ?
//		for (int i = 0 ; i <5 ; i++) {
//			arr[i] = i+1 ;
//			/*���� ���� ���ذ� �� ���ٸ� �ϳ��ϳ� Ǯ� �����ϱ�
//			* arr[0] = 1;
//			* arr[1] = 2;
//			* arr[2] = 3;
//			* arr[3] = 4;
//			* arr[4] = 5; */
//			System.out.println(arr[i]);
//		}
		
//		//10�� ����� ������ �Ϸ��� ?
////		arr[0] = 10;
////		arr[1] = 20;
////		arr[2] = 30;
//		for (int i = 0 ; i <5 ; i++) {
//			arr[i] = (i+1)*10;
//			System.out.println(arr[i]);
//		}
		
		//�ϵ��ڵ� �� �Ϸ��� ?
//		int[] arr = new int[5];
//		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
		//����� �ʱ�ȭ
		//int[] arr = new int[3]; //3���� ������ �������� ���鲨��.
		//int[] arr = new int[] {10, 20, 30}; //����� ���ÿ� �ʱ�ȭ�� ��.
											//�ݵ�� ������ �����ؾ��� !
		//�Ǵ�
//		int[] arr = {10,20,30};
////		for (int i = 0 ; i < arr.length ; i++) {
////			//length = �ʵ� : �迭�� �Ӽ�(����)�� �ǹ�
////			System.out.println(arr[i]);
////		}
//		//for (int i = 0 ; i < arr.length ; i++) ������ �ʹ� ���!!! �����׾�!!!
//		//for ~ each �� ���
//		for(int a : arr) { //arr�̶�� �迭 �ȿ� ���� ���� �����ϰڴٴ� �ǹ�.
//							//���� int �̱� ������ int a�� �Ǵ� ��. 
//			System.out.println(a);
//		}
//		
//		//�Ź� �迭�� ���� � ���� ����ִ��� Ȯ���ϴ� �� �ʹ� ������ ����
//		//Arrays(Ŭ����) ���
//		//�żҵ� �̸��� ������ �Ű������� ���� �ٸ� ���� '�����ε�(toString)'�̶� �Ѵ�.
//		Arrays.toString(arr); //arr�̶�� �Ű������� �ѱ�� String �� ��ȯ.
//		System.out.println(Arrays.toString(arr)); //���ڿ��� ����ϴ� Ŭ����.
//													//�� Ȯ�ο����θ� ���.
//		System.out.println(arr);  //println �޼ҵ�� toString() ����
//		System.out.println(arr.toString());
		
		//��������
		//���� ��� ���ϱ�
//		int[] score = {88, 89, 77};
//		int sum = 0;
//		//for (int i = 0 ; i <3 ; i++)
//		for (int a : score ) {
//			sum += a;
//		}
//		double avg = (double)sum/3 ;
//		System.out.println("��� : " + avg);
//		System.out.println("��� : " + (int)avg); //���������� ��ȯ
//		System.out.println("��� : " + Math.round(avg*100)/100.0); //��°¥�� �ݿø��Ͽ� ���.
//		System.out.printf("��� : %.2f", avg);
		
		//�л��� ������ �Է¹޾� ��� ���ϱ�
//		int[] stu = new int[3];
//		int sum =0;
//		Scanner sc = new Scanner(System.in);
////				stu[0] = 80
////				stu[1] = 88
////				stu[2] = 72		
//		for (int i = 0 ; i <stu.length ; i++) {
//			System.out.print("3�� �л��� ���� : "); //3���� ��������� ��������!
//			stu[i] = sc.nextInt();
//			sum += stu[i]; 
//		}
//		double avg = (double)sum/3 ;
//		System.out.printf("��� : %.2f", avg);
		
		//���ڿ�
//		String[] arr = new String[3]; //3���� ���ڿ��� ������ ������ ������.
//		for (String a : arr) {
//			System.out.println(a);
//		}
		
//		String[] arr = new String[] {"java", "python", "c"};
//		System.out.println(arr);
//		for (String a : arr) {
//			System.out.println(a);
//		}
		
//		//��������
//		//�����ϴ� �÷� 3���� �Է¹޾� �迭�� ����, ���
//		String[] color = new String[3];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0 ; i < color.length ; i++) {
//			System.out.println("�÷��� �Է��ϼ��� : ");
//			//color[0] = ù��° �Է� ��
//			//color[1] = �ι�° �Է� ��
//			//color[2] = ����° �Է� ��
//			color[i] = sc.next(); //���� �켱 ������ �Ŀ�
//		}
//		for (String a : color) { //�ݺ������� ����ϱ�
//			System.out.print(a + " ");
//		}
		
		//��������
		//�Ǻ���ġ ���� 20�� ���ϱ�
//		//1. ���� ���� �����.
//		int[] fibo = new int[20];
//		fibo[0] = 0;
//		fibo[1] = 1;
//		//2. �ݺ���
//		for (int i = 2 ; i<20 ; i++) { //�Է��ϴ� ��¹��� �ݺ��ϴ� ��¹��� �ٸ���!
//			fibo[i] = fibo[i-2]+fibo[i-1];
//		}
//		for (int i = 0; i <21 ; i++) {
//			System.out.println(fibo[i]);
//		}
		
//		//��������
//		//���� ä�� ���α׷�
//		//���� �迭�� ���� �迭 ��
//		int[] right = {1,3,5,1,2,5}; //���� �迭
//		int[] ans = {1,3,2,5,2,2}; //���� �迭
//		int count = 0;
//		//right[0] == ans [0]
//		//right[1] == ans [1]
//		for (int i = 0 ; i < right.length ; i++) {
//			if (right[i] == ans[i]) {
//				System.out.println((i+1)+"�� : ����");
//				count += 1;
//			}
//			else
//				System.out.println((i+1)+"�� : ����");
//		}
//		int score = count * (100 / right.length);
//		System.out.println(count + "�� ������ϴ�.");
//		System.out.println("������ " + score+"��");
		
		//��������
		//�ִ밪/�ּڰ� ���
//		int[] arr = {4,6,7,2,5};

//		//arr[1] arr[2]
//		//arr[1] arr[4]
//		//arr[2] arr[4]
//		//arr[3] arr[4]
//		Arrays.sort(arr);
//		for (int i = 0 ; i <5 ; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("\n"+"�ִ� : " + arr[4]);
//		System.out.println("�ּڰ� : " + arr[0]);
		
//		int max = arr[0];
//		for (int i = 1; i<arr.length; i++) {
////			//arr[0] arr[1]
////			//      ~
////			//arr[0] arr[4]
//			if (arr[i] > max )
//				max = arr[i];
//		}
//		System.out.println(max);

		//�����ؼ� ù��° �ε���, ������ �ε��� ���
		//2,6,7,4,5 -> 2,4,7,6,5 -> ...
		//�ε��� ������ ���� ���� ū�� ������ ��
		
		//�迭�� ����
		//�迭 ������ ���� : ���� ����, ���� ����
//		//���� ���� : �ּҸ� ����
//		int[] src = {1,2,3,4};
//		int[] dest = src;
//		
//		System.out.println(src);
//		System.out.println(Arrays.toString(src));
//		System.out.println(dest);
//		System.out.println(Arrays.toString(dest));
//		System.out.println("----------------------");
//		
//		src[1] = 20;
//		System.out.println("src : " + Arrays.toString(src));
//		System.out.println("dest : " + Arrays.toString(dest));
//		System.out.println("----------------------");
//		
//		dest[3] = 40;
//		System.out.println("src : " + Arrays.toString(src));
//		System.out.println("dest : " + Arrays.toString(dest));
		
		//���� ���� : ���� ����
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[5];
//		System.out.println("src : " + Arrays.toString(src));
//		System.out.println("dest : " + Arrays.toString(dest));
//		for (int i = 0 ; i < src.length ; i++) {
//			dest[i] = src[i];		
//		}
//		System.out.println("dest : " + Arrays.toString(dest));
		
		//���� �߰��Ϸ��� ?
		//������ �ٽ� ��������.
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[6];
//		System.out.println("src : " + Arrays.toString(src));
//		System.out.println("dest : " + Arrays.toString(dest));
//		for (int i = 0 ; i < src.length ; i++) {
//			dest[i] = src[i];		
//		}
//		dest[5] = 6;
//		System.out.println("dest : " + Arrays.toString(dest));
//		//src�� �߰��� ���� �������� ?
//		src = dest ;
//		System.out.println("src : " + Arrays.toString(src));
		
//		//�����ӿ�ũ�� �̿��� ������ �߰�
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);
		
//		//�迭�� ���� ����
//		int[] src = {1,2,3,4,5};
//		int[] dest = {0,0,0,0,0};
//		System.arraycopy(src, 2, dest, 0, 2);
//		System.out.println("src : " + Arrays.toString(src));
//		System.out.println("dest : " + Arrays.toString(dest));
		
		//��������
		//���� ����
		//{2,4,5,6,7}
		//{7,6,5,4,2}
//		int[] sortArr = {4,6,7,2,5};
//		
//		for (int j = 0 ; j<sortArr.length ; j++) {
//			int min = sortArr[j]; //0�� �ε����� ���� �۴ٰ� �����ϰ� �����ϱ�.
//			int minIndex=j; //���� ���� ���� �ε���
//			for (int i = j+1 ; i < sortArr.length ; i++) {
//				if (sortArr[i] < min) {
//					min = sortArr[i];
//					minIndex = i ;
//				}
//			}
//			System.out.println(min);
//			System.out.println(minIndex);
//			//���� �������� �����ؾ��ϹǷ� �� ���� ���� �ٲٱ�
//			sortArr[minIndex] = sortArr[j];
//			sortArr[j] = min;
//			System.out.println(Arrays.toString(sortArr));
//			//�� �ĵ��� �ݺ��ؾ��ϹǷ� ��ü �� ���� �ݺ��� ����
//		}
		
		//�ζ� ��ȣ ���� ���� ���
		// ��� 1) Math.random() * 100 +1;
		// ��� 2) Random() ;
		
		//int ���� Ȯ���ϱ�.
		System.out.println("MAX �� :" + Integer.MAX_VALUE);
		System.out.println("MIN �� :" + Integer.MIN_VALUE);
		
		int[] rT = new int[6]; //6���� ���ڸ� �������ϱ� 6���� ������� �����.
		Random rd = new Random();
		
		
		for (int i = 0 ; i < rT.length ; i ++) {
			boolean b = false; //������ �������� �ʴ´ٴ� ���� �Ͽ� ����.
			int num =rd.nextInt(45)+1 ; //0�� ���� ���Ͽ� +1
			for (int j = 0 ; j<i ; j++) {
				if (rT[j] == num) {
					i--; //continue�ϸ� 1�� �ε����� �ǳʶٰ� 2�� �ε����� ä������ �Ǵϱ�.
					b = true ; //�����Ѵ�.
					break;
				}
			}
			if (b) continue;
			
			rT[i] = num;
		}	
		Arrays.sort(rT); //�������� ����
		System.out.println(Arrays.toString(rT));
		//�̷��Ը� �Ѵٸ� �ߺ��Ǵ� ���ڵ��� �߻�
		//���� ������ ���ڰ� ��ϵǾ��ִٸ� break.
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
