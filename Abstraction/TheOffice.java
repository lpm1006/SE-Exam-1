package Abstraction;

abstract class TvShows { // abstract class
	// private attributes
	private String name;
	private int seasons;
	private int releaseYear;
	
	abstract void description(); // abstract method (no concrete code, just name)
	
	// setters and getters
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	
	int getSeasons() {
		return seasons;
	}
	
	void setReleaseYear(int year) {
		this.releaseYear = year;
	}
	
	int getReleaseYear() {
		return this.releaseYear;
	}
}

class Comedy extends TvShows { // class that extends the abstract class 
	void description() { // define the abstract method
		System.out.println("This is a comedy show");
	}
}

public class TheOffice extends Comedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheOffice theOffice = new TheOffice(); // instantiate
		
		theOffice.setName("The Office");
		theOffice.setSeasons(8);
		theOffice.setReleaseYear(2007);
		
		System.out.println(theOffice.getName());
		System.out.println(theOffice.getSeasons());
		System.out.println(theOffice.getReleaseYear());
		theOffice.description(); // call the abstract method
	}

}
