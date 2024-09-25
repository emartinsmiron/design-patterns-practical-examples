package br.com.emiron.observer;

import java.util.ArrayList;
import java.util.List;

public class EventTrigger {
	List<Observable> observers = new ArrayList<>();

	public void addObserver(Observable observable) {
		observers.add(observable);
	}

	public void removeObserver(Observable observable) {
		observers.remove(observable);
	}

	public void sentNotification() {
		observers.forEach(Observable::execute);
	}

}
