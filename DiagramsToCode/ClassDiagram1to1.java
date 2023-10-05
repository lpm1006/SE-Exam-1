package DiagramsToCode;

/* Coverting the following 1 to 1 class diagram to code:
 * 
 * +--------------+             +-----------+
 * |              | 1         1 |           |
 * |  Advertiser  |-------------|  Account  |
 * |              |             |           |
 * +--------------+             +-----------+
 * 
 */

class Advertiser {
	private Account account; // make an instance of Account
	
	Advertiser() {
		account = new Account(this);
	}
	
	public Account getAccount() {
		return this.account;
	}
}

class Account {
	private Advertiser owner; // make an instance of Advertiser
	
	Account(Advertiser owner) {
		this.owner = owner;
	}
	
	public Advertiser getOwner() {
		return this.owner;
	}
}

public class ClassDiagram1to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
