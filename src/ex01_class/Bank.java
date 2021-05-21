package ex01_class;


//은행 클래스
public class Bank{ 

	private String name;
	private String bankNum;
	private int balance;
	
	//생성자
//	Bank (String name, String bankNum) { //반드시 은행명과 계좌번호를 가지고 가고 싶다면
//		this.name = name;
//		this.bankNum = bankNum;
//	}
	public Bank(String name, String bankNum) {
//		super(); 부모 클래스의 생성자를 이용해라 ?
		this.name = name;
		this.bankNum = bankNum;
	}

	public String getBankNum() {
		return bankNum;
	}
	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}
	//setter
//	void setName(String name) { //은행도 변경하지 못하도록 세터 생성 x
//		this.name = name;
//	}
	void setBanknum(String bankNum) { //계좌번호가 바뀔 수 있는 여지가 있는 상태
		this.bankNum = bankNum;
	}
//	void setBalance(int balance) { 잔금을 마음대로 바꾸지 못하도록 생성 x
//		this.balance = balance;
//	}
	//초기에 잔금이 있는 상태로 만들고 싶다면 생성자에 포함하기.
	
	//getter
	String getName() {
		return name ;
	}
	String getBanknum() {
		return bankNum ;
	}
	int getBalance() {
		return balance;
	}
	
	//입금 메소드
	void in(int a) {
		balance += a;
	}
	//출금 메소드
	int out(int a) {
		if (balance - a < 0) {
			return -1;
		}
		else
			return 0;
	}
	
	
	//참조 변수를 이용하여 필드값 출력 역할
	//어노테이션
	//오버라이딩 : 부모 클래스의 메소드 재정의
	@Override
	public String toString() { //String으로 반환하겠다.
		return "Bank [name=" + name + ", bankNum=" + bankNum + ", balance=" + balance + "]";
		//return "첫번째은행 [은행 이름=" + name + ", bankNum=" + bankNum + ", balance=" + balance + "]"; //이런 식으로 수정 가능
	}
	
	


//public class Bank {

	public static void main(String[] args) {

		
		
//		Bank bank1 = new Bank("자바 은행", "G-93-0808");
//		//bank1.setBanknum("220-89-123"); //세터를 생성했기 때문에 계좌번호 변경이 가능한 것.
//		System.out.println("은행명 : " + bank1.getName());
//		System.out.println("은행 계좌 : " + bank1.getBanknum());
//		System.out.println("잔액 : " + bank1.getBalance());
//		System.out.println(bank1);
//		bank1.in(70000);
//		System.out.printf("입금 후 잔액은 %,d원입니다.\n", bank1.getBalance());
//		System.out.println("--------------------------");
//		
//		Bank bank2 = new Bank("국제 은행", "H-93-1011", 500000);
//		System.out.println("은행명 : " + bank2.getName());
//		System.out.println("은행 계좌 : " + bank2.getBanknum());
//		System.out.println("잔액 : " + bank2.getBalance());
//		System.out.println(bank2);
//		bank2.out(100000);
//		bank2.in(7000);
//		System.out.printf("잔액은 %,d원입니다.\n", bank2.getBalance());
		
		
		
	}
}
