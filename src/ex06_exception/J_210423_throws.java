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
			System.out.println("0~2를 입력해주세요.");
		}
		catch (Exception e) {
			System.out.println("예외 발생");
		}
	}
	
	//예외 던지기
	static void arrIndex_throws(int index) throws ArrayIndexOutOfBoundsException  { //언체크 예외
		int[] arr = {10,20,30};
		System.out.println(arr[index]);
	}
	
	//체크 예외기 때문에 누군가(호출한 쪽)는 처리해줘야함.
	static void fileRead(String fileName) throws FileNotFoundException { 
		File file = new File(fileName);
		System.out.println(file); //어떤 파일을 읽어들이겠다.
		Scanner sc = new Scanner(file , "utf-8"); //sc가 파일을 읽어들일꺼야.
												//불러들일 파일의 인코딩 형식 작성. 지금 나의 이클립스 버전은 MS949라서 파일을 읽어들이지 못함.
												//그래서 파일의 인코딩 형식을 작성해야함.
		System.out.println("파일 읽기 성공");
		//파일에 있는 내용을 하나씩 읽어들이기.
		//inputstream 형태 생각하기
		while(sc.hasNextLine()) { //한 줄씩 읽을꺼니까 nextLine.
			String s = sc.nextLine();
			System.out.println(s);
			}
		
		
	}
	
	public static void main(String[] args) {
		//throws : 예외던지기
		//throws 하는 이유 : 코딩이 길어져서 가독성이 떨어지기 때문에.  
//		J_210423_throws.arrayIndex(4);
//		
//		try { //예외를 던졌기 때문에 여기서 예외 처리해주어야함.
//			J_210423_throws.arrIndex_throws(4);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("throws로 처리 : 잘못된 인덱스");
//		}
//		catch (Exception e) {
//			System.out.println("예외 발생");
//		}
		
		try {
			J_210423_throws.fileRead("sample.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		
		
		
		

	}

}
