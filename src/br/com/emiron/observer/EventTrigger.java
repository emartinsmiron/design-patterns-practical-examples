package br.com.emiron.observer;

import java.util.ArrayList;
import java.util.List;

public class EventTrigger {
	List<IObserver> observers = new ArrayList<>();
	
	public void addObserver(IObserver observable) {
		observers.add(observable);
	}
	
	public void removeObserver(IObserver observable) {
		observers.remove(observable);
	}
	
	public void sentNotification() {
		observers.forEach(observer -> observer.print());
	}
	

}
