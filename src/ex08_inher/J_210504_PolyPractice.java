package ex08_inher;

import java.util.HashMap;
import java.util.Map;

//������ ����� ��� ���

class StationeryStore{
	
}

class Note extends StationeryStore {
	@Override
	public String toString() {
		return "��Ʈ";
	}
}

class Pen extends StationeryStore {
	@Override
	public String toString() {
		return "��";
	}
}





class Manage {
	//��� ���� ��
	Map<String, Integer> enterMap = new HashMap<>();
	
	//�԰� �޼ҵ�
	void store(StationeryStore production, int qty) {
		System.out.println(production.toString()+" " + qty+"��" + " �԰� �Ϸ�");
		System.out.println("�� ��� : " + enterMap.get(production.toString()));
		//��� 0�� ���
		//��ü�� ������ �� �ִ� Ŭ���� Integer ���
		Integer stockQty = enterMap.get(production.toString()); //���� ��� ��ȸ
																//��ǰ�� Ű�� ������ ���� �����ش�.
		if (stockQty == null) 
			stockQty = 0; //��� ���� ���, �ʱ�ȭ.
			enterMap.put(production.toString(), stockQty + qty);
		
		enterMap.put(production.toString(), qty);
	}

	//��� ��� �޼ҵ�
	void stock(StationeryStore production) {
		System.out.println("MAP : " + enterMap);
		//enterMap.get(production.toString()); //production �߿��� ������ ǰ���� �����ϴϱ�.
		System.out.println("�� ��� : " + enterMap.get(production.toString())+"��");
	}
	
	
	
}


public class J_210504_PolyPractice {

	public static void main(String[] args) {
		Manage m = new Manage();
		Note SpringNote = new Note();
		
		m.store(SpringNote, 50);
		m.store(SpringNote, 100);
		//�԰�� ��ǰ���� Ȯ���ϰ� �ʹٸ�? �迭, �� �̿� ->> Ŭ���� ���� �����ϱ�.
		m.stock(SpringNote);
		
		Pen monami = new Pen();
		

		

	}

}
