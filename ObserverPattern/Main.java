package ObserverPattern;

public class Main {
	public static void main(String args[]) {
		ConcreteSubject concSub;
		ConcreteObserver concObs;
		
		concSub = new ConcreteSubject();
		
		concObs = new ConcreteObserver(concSub);
		
		System.out.println("Set Measurements");
		concSub.setMeasurements(80,  65, 30.4f);
		
		System.out.println("Remove Observers");
		concObs.unRegister();
		
		System.out.println("Set Measurements");
		concSub.setMeasurements(80,  65, 30.4f);
	}
}
