package ex14_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

class Server {
	private int port = 33333; //��Ʈ��ȣ�� �����ؾ���. ���α׷��� �����ϱ� ���� ��ȣ.
	void start () {
		ServerSocket server = null;
		Socket socket = null; //��Ʈ��ũ���� ����
		BufferedReader br = null;
		try {
			server = new ServerSocket(port); // � ���α׷��� ������ �� ������ �����ؾ���.
			System.out.println("���� ����");
			while (true) {
				System.out.println("Ŭ���̾�Ʈ ���� ��� �� ... ");
				socket = server.accept(); //Ŭ���̾�Ʈ�� ��û�� �ϸ� ��û�� ����ϰڴٴ� �ǹ�.
				System.out.println("Ŭ���̾�Ʈ ���� ����");
				//�����͸� �ְ� �ޱ� ���� ��Ʈ�� ���� in socket
				br = new BufferedReader(new InputStreamReader(socket.getInputStream())); //inputStream : ����Ʈ ����.
				while (true) {
					String data = br.readLine();
					if (data == null || data.equals("quit")) break;
					System.out.println("���� �޼��� : " + data);
				}
			}
		} 
		catch (SocketException e) {
			System.out.println("Ŭ���̾�Ʈ ���� ����");
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("IO ����");
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
