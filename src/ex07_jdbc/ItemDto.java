package ex07_jdbc;

import java.util.Date;

public class ItemDto {
	private String itemcode ;
	private String itemname;
	private int price ;
	private String note;
	private Date regdate;
	
	public ItemDto () {}
	public ItemDto(String itemcode, String itemname, int price, String note, Date regdate) {
		super();
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.price = price;
		this.note = note;
		this.regdate = regdate;
	}
	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
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
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "ItemDto [itemcode=" + itemcode + ", itemname=" + itemname + ", price=" + price + ", note=" + note
				+ ", regdate=" + regdate + "]";
	}
	
	
	
	
}
