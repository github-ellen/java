package ex15_swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//SWING ��Ű���� �̿��� GUIȭ�� �����
public class J_210510_swing extends JFrame {

	J_210510_swing(){
		super("JFRAME �׽�Ʈ");
		setTitle("JFrame �׽�Ʈ");
		setSize(500, 300);
		//�ؽ�Ʈ �ڽ�(������Ʈ)�� ����� �ʹٸ�
		JTextField tf = new JTextField();
		JButton btnAdd = new JButton("�׽�Ʈ");
		//������Ʈ�� �ø� �����̳� ����
		Container con = getContentPane();
		//������Ʈ�� �����̳ʿ� �߰�
		con.add(tf,"North");
		con.add(btnAdd,"South");
		setVisible(true); //ȭ�鿡 ���̰� �ϴ� ���
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //�����찡 ����� �� ���� ����.
	}
	
	
	public static void main(String[] args) {
		J_210510_swing myFrame = new J_210510_swing();
		
	}

}
