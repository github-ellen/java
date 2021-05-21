package ex08_inher;

import java.util.HashMap;
import java.util.Map;

//문구점 입출고 목록 출력

class StationeryStore{
	
}

class Note extends StationeryStore {
	@Override
	public String toString() {
		return "노트";
	}
}

class Pen extends StationeryStore {
	@Override
	public String toString() {
		return "펜";
	}
}





class Manage {
	//재고 저장 맵
	Map<String, Integer> enterMap = new HashMap<>();
	
	//입고 메소드
	void store(StationeryStore production, int qty) {
		System.out.println(production.toString()+" " + qty+"개" + " 입고 완료");
		System.out.println("현 재고 : " + enterMap.get(production.toString()));
		//재고가 0인 경우
		//객체를 저장할 수 있는 클래스 Integer 사용
		Integer stockQty = enterMap.get(production.toString()); //기존 재고 조회
																//물품의 키를 넣으면 값을 돌려준다.
		if (stockQty == null) 
			stockQty = 0; //재고가 없을 경우, 초기화.
			enterMap.put(production.toString(), stockQty + qty);
		
		enterMap.put(production.toString(), qty);
	}

	//재고 출력 메소드
	void stock(StationeryStore production) {
		System.out.println("MAP : " + enterMap);
		//enterMap.get(production.toString()); //production 중에서 꺼내올 품목을 골라야하니까.
		System.out.println("현 재고 : " + enterMap.get(production.toString())+"개");
	}
	
	
	
}


public class J_210504_PolyPractice {

	public static void main(String[] args) {
		Manage m = new Manage();
		Note SpringNote = new Note();
		
		m.store(SpringNote, 50);
		m.store(SpringNote, 100);
		//입고된 물품들을 확인하고 싶다면? 배열, 맵 이용 ->> 클래스 내에 생성하기.
		m.stock(SpringNote);
		
		Pen monami = new Pen();
		

		

	}

}
