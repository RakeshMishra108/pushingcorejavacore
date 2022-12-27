package practice_ex;

public class BankDetails {
private int bal;
private int pwd;
private int cbal=50000;

public BankDetails() {

}

public BankDetails(int bal, int pwd, int cbal) {
	this.bal = bal;
	this.pwd = pwd;
	this.cbal = cbal;
}

public int getBal() {
	return bal;
}

public void setBal(int bal) {
	this.bal = bal;
}

public int getPwd() {
	return pwd;
}

public void setPwd(int pwd) {
	this.pwd = pwd;
}

public int getCbal() {
	return cbal;
}

public void setCbal(int cbal) {
	this.cbal = cbal;
}



}
