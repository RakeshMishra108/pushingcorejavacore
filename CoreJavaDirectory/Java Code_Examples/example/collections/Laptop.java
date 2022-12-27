package example.collections;

public class Laptop implements Comparable<Laptop> {
	private String serialNo;
	private String brandName;
	private int price;
	public Laptop() {
		serialNo = "S01";
		brandName = "HP";
		price = 50000;
	}
	public Laptop(String serialNo, String brandName, int price) {
		this.serialNo = serialNo;
		this.brandName = brandName;
		this.price = price;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [serialNo=" + serialNo + ", brandName=" + brandName + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + price;
		result = prime * result + ((serialNo == null) ? 0 : serialNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (price != other.price)
			return false;
		if (serialNo == null) {
			if (other.serialNo != null)
				return false;
		} else if (!serialNo.equals(other.serialNo))
			return false;
		return true;
	}
	@Override
	public int compareTo(Laptop secondLaptop) {
		//System.out.println("-----------------Comparison in progress--------------------");
		// Here the reference 'this' refers to the first laptop and that is being compared with secondLaptop
		//This method provides a default sorting algorithm: brandName wise Ascending
		String firstBrandName = brandName;//this.brandName
		String secondBrandName = secondLaptop.brandName;
		int comparison = firstBrandName.compareTo(secondBrandName);//Ascending
		//int comparison = secondBrandName.compareTo(firstBrandName);
		if(comparison == 0)
			comparison = 1;
		return comparison;
	}

}





