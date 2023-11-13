package ObserverPattern;

public class ConcreteObserver implements Observer {
	private float temp;
	private float humidity;
	private float pressure;
	
	private Subject concSub;
	
	public ConcreteObserver (Subject concSub) {
		this.concSub = concSub;
		concSub.registerObserver(this);
	}
	
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
	public void display() {
		System.out.println("Temp: " + temp);
		System.out.println("Humidity: " + humidity);
		System.out.println("Pressure: " + pressure);
	}
	
	public void unRegister() {
		concSub.removeObserver(this);
	}
}
