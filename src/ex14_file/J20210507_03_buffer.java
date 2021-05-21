package ex14_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class J20210507_03_buffer {

	public static void main(String[] args) {
		// �� �پ� ����
		Scanner sc = new Scanner(System.in);
//		BufferedWriter bw = new BufferedWriter( // FileWriter�� ���� ��Ʈ��
//				new FileWriter("./data/bufferWriter.txt")); // �ؽ�Ʈ ���Ͽ� ���� ������ ���ڴ�.
		try(BufferedWriter bw = new BufferedWriter(
								new FileWriter("./data/bufferWriter.txt"))) {
			while (true) {
				System.out.println("�̸�,��,��,��?");
				String data = sc.nextLine();
				if (data.equals("quit")) {
					System.out.println("���α׷� ����");
					break;
				}
				bw.write(data);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
		}


//
////			bw.write("�̼���,89,99,78");
////			bw.newLine();
//		}
//		bw.close();

		// �� �پ� �б�
		
		try (BufferedReader br = new BufferedReader(
								new FileReader("./data/bufferWriter.txt"))){
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
				String[] data = s.split(",");
				System.out.println(Arrays.toString(data));
				int sum = 0;
				for(int i = 1 ; i < 4 ; i++) {
					sum += Integer.parseInt(data[i]); //�հ�
				}
				System.out.println("�̸� : " + data[0]);
				System.out.println("�հ� : " + sum);
				System.out.println("��� : " + sum/3.);
				System.out.println("---------------------");
			}
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}


	}

}
