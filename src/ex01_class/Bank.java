package ex01_class;


//���� Ŭ����
public class Bank{ 

	private String name;
	private String bankNum;
	private int balance;
	
	//������
//	Bank (String name, String bankNum) { //�ݵ�� ������ ���¹�ȣ�� ������ ���� �ʹٸ�
//		this.name = name;
//		this.bankNum = bankNum;
//	}
	public Bank(String name, String bankNum) {
//		super(); �θ� Ŭ������ �����ڸ� �̿��ض� ?
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
//	void setName(String name) { //���൵ �������� ���ϵ��� ���� ���� x
//		this.name = name;
//	}
	void setBanknum(String bankNum) { //���¹�ȣ�� �ٲ� �� �ִ� ������ �ִ� ����
		this.bankNum = bankNum;
	}
//	void setBalance(int balance) { �ܱ��� ������� �ٲ��� ���ϵ��� ���� x
//		this.balance = balance;
//	}
	//�ʱ⿡ �ܱ��� �ִ� ���·� ����� �ʹٸ� �����ڿ� �����ϱ�.
	
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
	
	//�Ա� �޼ҵ�
	void in(int a) {
		balance += a;
	}
	//��� �޼ҵ�
	int out(int a) {
		if (balance - a < 0) {
			return -1;
		}
		else
			return 0;
	}
	
	
	//���� ������ �̿��Ͽ� �ʵ尪 ��� ����
	//������̼�
	//�������̵� : �θ� Ŭ������ �޼ҵ� ������
	@Override
	public String toString() { //String���� ��ȯ�ϰڴ�.
		return "Bank [name=" + name + ", bankNum=" + bankNum + ", balance=" + balance + "]";
		//return "ù��°���� [���� �̸�=" + name + ", bankNum=" + bankNum + ", balance=" + balance + "]"; //�̷� ������ ���� ����
	}
	
	


//public class Bank {

	public static void main(String[] args) {

		
		
//		Bank bank1 = new Bank("�ڹ� ����", "G-93-0808");
//		//bank1.setBanknum("220-89-123"); //���͸� �����߱� ������ ���¹�ȣ ������ ������ ��.
//		System.out.println("����� : " + bank1.getName());
//		System.out.println("���� ���� : " + bank1.getBanknum());
//		System.out.println("�ܾ� : " + bank1.getBalance());
//		System.out.println(bank1);
//		bank1.in(70000);
//		System.out.printf("�Ա� �� �ܾ��� %,d���Դϴ�.\n", bank1.getBalance());
//		System.out.println("--------------------------");
//		
//		Bank bank2 = new Bank("���� ����", "H-93-1011", 500000);
//		System.out.println("����� : " + bank2.getName());
//		System.out.println("���� ���� : " + bank2.getBanknum());
//		System.out.println("�ܾ� : " + bank2.getBalance());
//		System.out.println(bank2);
//		bank2.out(100000);
//		bank2.in(7000);
//		System.out.printf("�ܾ��� %,d���Դϴ�.\n", bank2.getBalance());
		
		
		
	}
}
