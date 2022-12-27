package Ass4;

public class BisleriPack {

	private BisleriBottel botteltype;
	private int quantity;
	
	public BisleriBottel getBotteltype() {
		return botteltype;
	}

	public void setBotteltype(BisleriBottel botteltype) {
		this.botteltype = botteltype;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BisleriPack(BisleriBottel botteltype, int quantity) {
		super();
		this.botteltype = botteltype;
		this.quantity = quantity;
	}
	
	public float totalcost() {
		float tp=botteltype.getcost();
		return tp;
	}

	public float totalvolume() {
		float tv=botteltype.getvolume();
		return tv;
	}
	
}
