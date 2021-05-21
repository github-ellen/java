package ex01_class;

import java.util.Arrays;

//�հ踦 ���ϴ� �޼ҵ� �����
class Sum {
	//�����ε� ���
	
	//�� ������ �Ű������� �޾Ƽ� ���� �����ϴ� �޼ҵ�
	int add(int a, int b) {
		return a+b;
	}
	
	//�� ������ �Ű������� �޾Ƽ� ���� �����ϴ� �޼ҵ�
	int add(int a, int b, int c) {
		return a+b+c;
	}
	//�Ű������� �ϳ��� �迭�� �޾Ƽ� ���� �����ϴ� �޼ҵ�(second)
	int add(int[] arr) {
		int sum = 0;
		for (int i = 0 ; i <arr.length-1 ; i++) {
			sum += arr[i];
		}
		arr[arr.length-1] = sum;
		return sum;
	}
	
	int addVarargs(int ...arr) { //�Ű������� �迭�� ���� ���� ������ �����ϰڴ�. (��������)
		int sum = 0;
		for (int i = 0 ; i <arr.length ; i++) {
			sum += arr[i];
		}
		return sum;
	}
	//���ڿ��� �������ڷ� �޾Ƽ� ����ϱ�
	void word(String...arr) { //��ȯ���� ���� ������ ���� �Լ� ������ ��� �Ұ�.
		for(String i : arr) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
}

public class J_210420_overLoading {

	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.add(50, 90));
		System.out.println(s.add(10, 50, 90));
		
		int[] arr = {10 ,50, 90, 50, 0}; //�迭�� ���� �Ŀ� �޼ҵ� �����(first)
		System.out.println("�迭�� ���� " + s.add(arr));
		System.out.println(Arrays.toString(arr));
		
		System.out.println("�迭�� ���� " + s.addVarargs(10,20,30,40, 50)+"\n");
	
		s.word("�浿", "2��", "B");
	}

}
