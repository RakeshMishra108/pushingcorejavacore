package Ass4;

import java.util.Objects;

public class Shirt {
	
	private String brandName;
	private String color;
	private String Type;
	
	

	@Override
	public int hashCode() {
		return Objects.hash(Type, brandName, color);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shirt other = (Shirt) obj;
		return Objects.equals(Type, other.Type) && Objects.equals(brandName, other.brandName)
				&& Objects.equals(color, other.color);
	}
	public Shirt(String brandName, String color, String type) {
		super();
		this.brandName = brandName;
		this.color = color;
		Type = type;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	

}
