package ex07_jdbc.sales;


public class SalesDTO {

	private String salesDate ;
	private int seq ;
	private String itemCode ;
	private int qty ;
	private int amount ;
	private String regdate ;
	
	public SalesDTO () {}
	
	public SalesDTO(String salesDate, int seq, String itemCode, int qty, int amount, String regdate) {
		this.salesDate = salesDate;
		this.seq = seq;
		this.itemCode = itemCode;
		this.qty = qty;
		this.amount = amount;
		this.regdate = regdate;
	}

	public String getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "SalesDTO [salesDate=" + salesDate + ", seq=" + seq + ", itemCode=" + itemCode + ", qty=" + qty
				+ ", amount=" + amount + ", regdate=" + regdate + "]";
	}
	
	
	
	
}
