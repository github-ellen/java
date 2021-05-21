package ex10_interface;

public class MartDTO {

	private String address ;
	private String brandName ; 
	private int conNum ;
	
	public MartDTO() {}

	public MartDTO(String address, String brandName, int conNum) {
		this.address = address;
		this.brandName = brandName;
		this.conNum = conNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getConNum() {
		return conNum;
	}

	public void setConNum(int conNum) {
		this.conNum = conNum;
	}

	@Override
	public String toString() {
		return "MartDTO [address=" + address + ", brandName=" + brandName + ", conNum=" + conNum + "]";
	}
	
	
	
	
	
}
