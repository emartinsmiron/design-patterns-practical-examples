package br.com.emiron.observer;

public class LogObserver implements Observable {

	@Override
	public void execute() {
		System.out.println("Log");

	}

}
