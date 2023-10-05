package DiagramsToCode;

import java.util.HashSet;
import java.util.Set;

/* Coverting the following 1 to many class diagram to code:
 * 
 * +--------------+             +-----------+
 * |              | 1         * |           |
 * |  Advertiser  |-------------|  Account  |
 * |              |             |           |
 * +--------------+             +-----------+
 * 
 */

class Advertiser2 {
	private Set<Account2> accounts; // make an instance of Account
	
	Advertiser2() {
		accounts = new HashSet<Account2>();
	}
	
	public void addAccount(Account2 a) {
		accounts.add(a);
		a.setOwner(this);
	}
	
	public void removeAccount(Account2 a) {
		accounts.remove(a);
		a.setOwner(null);
	}
}

class Account2 {
	private Advertiser2 owner; // make an instance of Advertiser
	
	public void setOwner(Advertiser2 newOwner) {
		if(owner != newOwner) {
			Advertiser2 old = owner;
			owner = newOwner;
			if(newOwner != null) {
				newOwner.addAccount(this);
			}
			if(old != null) {
				old.removeAccount(this);
			}
		}
	}
}

public class ClassDiagrams1toMany {

}
