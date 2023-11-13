package Testing;

public class Otter {
	private int legs;
	private String color;
	private boolean canSwim;
	
	Otter() {
		
	}
	
	Otter(int legs, String color, boolean canSwim) {
		this.legs = legs;
		this.color = color;
		this.canSwim = canSwim;
	}

	public static void main(String[] args) {
		Otter o1 = new Otter(5, "blue", false);
		
		System.out.println(o1.getLegs());
		System.out.println(o1.getColor());
		System.out.println(o1.getCanSwim());
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
	
	public boolean getCanSwim() {
		return canSwim;
	}

}
