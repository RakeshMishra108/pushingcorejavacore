package Assignment6;

public class BisleriPack {
	private int quantity;
	private BisleriBottle bottleType;
	public BisleriPack() {
		super();
		quantity = 0;
	}
	public BisleriPack(int quantity, BisleriBottle bottleType) {
		super();
		this.quantity = quantity;
		this.bottleType = bottleType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BisleriBottle getBottleType() {
		return bottleType;
	}
	public void setBottleType(BisleriBottle bottleType) {
		this.bottleType = bottleType;
	}
}
