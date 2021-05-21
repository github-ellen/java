package ex14_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

class Server {
	private int port = 33333; //포트번호는 유일해야함. 프로그램에 접속하기 위한 번호.
	void start () {
		ServerSocket server = null;
		Socket socket = null; //네트워크끼리 연결
		BufferedReader br = null;
		try {
			server = new ServerSocket(port); // 어떤 프로그램과 연결을 할 것인지 지정해야함.
			System.out.println("서버 시작");
			while (true) {
				System.out.println("클라이언트 접속 대기 중 ... ");
				socket = server.accept(); //클라이언트가 요청을 하면 요청을 허용하겠다는 의미.
				System.out.println("클라이언트 접속 성공");
				//데이터를 주고 받기 위한 스트림 생성 in socket
				br = new BufferedReader(new InputStreamReader(socket.getInputStream())); //inputStream : 바이트 단위.
				while (true) {
					String data = br.readLine();
					if (data == null || data.equals("quit")) break;
					System.out.println("받은 메세지 : " + data);
				}
			}
		} 
		catch (SocketException e) {
			System.out.println("클라이언트 접속 종료");
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("IO 예외");
			e.printStackTrace();
		} finally {
			try {
				if (br != null)		br.close();
				if (socket != null)		socket.close();
				if (server != null)		server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

public class J_210510_network_server {

	public static void main(String[] args) {
		Server server = new Server();
		server.start();

	}

}
