package ex07_jdbc.sales;

import java.util.Date;

public class ItemDTO {
	private String itemCode ;
	private String itemName ;
	private int price ;
	private String note ;
	private String regdate ;
	
	public ItemDTO () {}
	
	public ItemDTO(String itemCode, String itemName, int price, String note, String regdate) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.note = note;
		this.regdate = regdate;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "ItemDTO [itemCode=" + itemCode + ", itemName=" + itemName + ", price=" + price + ", note=" + note
				+ ", regdate=" + regdate + "]";
	}
	
	
	
	
	
	
	
	
}
