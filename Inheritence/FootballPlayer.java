package Inheritence;

class Athlete { // parent class
	// private attributes
	private int number;
	private String jerseyColor;
	private String yell = "Let's go Steelers";
	private String position;
	
	// setters and getters
	void setNumber(int number) {
		this.number = number;
	}
	
	int getNumber() {
		return this.number;
	}
	
	void setJerseyColor(String jerseyColor) {
		this.jerseyColor = jerseyColor;
	}
	
	String getJerseyColor() {
		return this.jerseyColor;
	}
	
	void setYell(String yell) {
		this.yell = yell;
	}
	
	String getYell() {
		return this.yell;
	}
	
	void setPosition(String position) {
		this.position = position;
	}
	
	String getPosition() {
		return this.position;
	}
}

public class FootballPlayer extends Athlete { // child class that inherits from Athlete

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FootballPlayer pickett = new FootballPlayer(); // instance of FootballPlayer
		pickett.setNumber(8);
		pickett.setJerseyColor("Black and Gold");
		pickett.setPosition("QB");
		System.out.println(pickett.getNumber());
		System.out.println(pickett.getJerseyColor());
		System.out.println(pickett.getYell());
		System.out.println(pickett.getPosition());
		
		FootballPlayer bosa = new FootballPlayer(); // new instance of FootballPlayer
		bosa.setNumber(97);
		bosa.setJerseyColor("Red and Gold");
		bosa.setYell("Let's go 49ers");
		bosa.setPosition("DE");
		System.out.println(bosa.getNumber());
		System.out.println(bosa.getJerseyColor());
		System.out.println(bosa.getYell());
		System.out.println(bosa.getPosition());
		
	}

}
