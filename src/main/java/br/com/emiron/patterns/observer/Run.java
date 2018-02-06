package br.com.emiron.observer;

public class Run {
	public static void main(String[] args) {
		EventTrigger trigger = new EventTrigger();
		
		trigger.addObserver(new LogObserver());
		trigger.addObserver(new HistoryObserver());
		
		trigger.sentNotification();
	}


}
