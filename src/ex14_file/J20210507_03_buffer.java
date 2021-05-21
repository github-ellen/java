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
		// 한 줄씩 쓰기
		Scanner sc = new Scanner(System.in);
//		BufferedWriter bw = new BufferedWriter( // FileWriter의 보조 스트림
//				new FileWriter("./data/bufferWriter.txt")); // 텍스트 파일에 문자 단위로 쓰겠다.
		try(BufferedWriter bw = new BufferedWriter(
								new FileWriter("./data/bufferWriter.txt"))) {
			while (true) {
				System.out.println("이름,국,영,수?");
				String data = sc.nextLine();
				if (data.equals("quit")) {
					System.out.println("프로그램 종료");
					break;
				}
				bw.write(data);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
		}


//
////			bw.write("이순신,89,99,78");
////			bw.newLine();
//		}
//		bw.close();

		// 한 줄씩 읽기
		
		try (BufferedReader br = new BufferedReader(
								new FileReader("./data/bufferWriter.txt"))){
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
				String[] data = s.split(",");
				System.out.println(Arrays.toString(data));
				int sum = 0;
				for(int i = 1 ; i < 4 ; i++) {
					sum += Integer.parseInt(data[i]); //합계
				}
				System.out.println("이름 : " + data[0]);
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + sum/3.);
				System.out.println("---------------------");
			}
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}


	}

}
