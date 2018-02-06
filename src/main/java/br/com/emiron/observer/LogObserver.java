package br.com.emiron.observer;

public class LogObserver implements IObserver {

	@Override
	public void print() {
		System.out.println("Log");
		
	}

}
