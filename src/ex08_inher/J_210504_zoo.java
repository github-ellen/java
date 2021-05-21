package ex08_inher;

//다형성을 이용하여 처리하기.

//사자
//팬더
//기린
//백곰

class Animal{ //여기서는 부모 클래스의 특별한 기능은 없다.
	
}

class Lion extends Animal {
	@Override
	public String toString() {
		return "사자";
	}
	
}

class Panda extends Animal{

	@Override
	public String toString() {
		return "판다";
	}
	
}

class Rabbit extends Animal {
	@Override
	public String toString() {
		return "토끼";
	}
	
}




class AnimalCare {
	//먹이주기 메소드
//	void feed(){
//		System.out.println(animal + "에게 먹이를 주었습니다.");
//	} 를 하려면 다형성이 필요함.
	void feed(Animal name){
	System.out.println(name + "에게 먹이를 주었습니다.");
	}
	
	//목욕시키기
	void take_Bath(Animal name) {
		System.out.println(name + "를 목욕시켰습니다.");
	}
	
	
}


public class J_210504_zoo {

	public static void main(String[] args) {
		AnimalCare care = new AnimalCare();
		Lion lion = new Lion();		
		Panda panda = new Panda();
		care.feed(lion); //Lion클래스에 toString을 해야지만 찍어낼 수 있음.
		care.feed(panda);
		care.take_Bath(panda);
		care.take_Bath(new Rabbit());
		

	}

}
