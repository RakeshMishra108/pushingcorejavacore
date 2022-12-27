package Assignment5;
import java.util.Scanner;
public class Shirt {
	private String brandName;
	private String color;
	private String type;
	Scanner sc =new Scanner(System.in);
	//Constructors
	public Shirt() {
		// TODO Auto-generated constructor stub
	}

	public Shirt(String brandName, String color, String type) {
		super();
		this.brandName = brandName;
		this.color = color;
		this.type = type;
	}
	//Callback method
	@Override
	public String toString() {
		return "Shirt [brandName=" + brandName + ", color=" + color + ", type=" + type + "]";
	}

	//Getters and setters
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName() {
		System.out.println("Enter the BrandName of shirt : ");
		this.brandName = sc.next();
	}

	public String getColor() {
		return color;
	}

	public void setColor() {
		System.out.println("Enter the color of shirt : ");
		this.color = sc.next();
	}

	public String getType() {
		return type;
	}

	public void setType() {
		System.out.println("Enter the type of shirt : ");
		this.type = sc.next();
	}
	

}
