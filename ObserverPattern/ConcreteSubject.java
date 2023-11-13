package ObserverPattern;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
	private ArrayList<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public ConcreteSubject() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(o);
		}
	}
	
	public void notifyObservers() {
		Observer observer;
		
		for(int i = 0; i < observers.size(); i++) {
			observer = observers.get(i);
			observer.update(temp, humidity, pressure);
			
		}
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		
		notifyObservers();
	}
}
