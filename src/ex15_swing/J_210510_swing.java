package ex15_swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//SWING 패키지를 이용한 GUI화면 만들기
public class J_210510_swing extends JFrame {

	J_210510_swing(){
		super("JFRAME 테스트");
		setTitle("JFrame 테스트");
		setSize(500, 300);
		//텍스트 박스(컴포넌트)를 만들고 싶다면
		JTextField tf = new JTextField();
		JButton btnAdd = new JButton("테스트");
		//컴포넌트를 올릴 컨테이너 생성
		Container con = getContentPane();
		//컨포넌트를 컨테이너에 추가
		con.add(tf,"North");
		con.add(btnAdd,"South");
		setVisible(true); //화면에 보이게 하는 기능
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //윈도우가 종료될 때 강제 종료.
	}
	
	
	public static void main(String[] args) {
		J_210510_swing myFrame = new J_210510_swing();
		
	}

}
