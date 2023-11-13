package SingletonPattern;

public class Singleton {
	public static Singleton instance = new Singleton(); // make static instance within the class
	private int num;
	
	private Singleton() { // lock out constructor
		
	}
	
	public static Singleton getInstance() { // make instance available
		return instance;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}
