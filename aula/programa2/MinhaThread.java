package com.aula.programa2;

public class MinhaThread extends Thread {
	
	public void run() {
		// a interface Runnable exige a implementação do método run
		String name = Thread.currentThread().getName();
		System.out.println(name + " rodando");
		for (int i = 0; i < 1000; i++) {
			System.out.println(name + ": " + i);
		}
		System.out.println(name + " FIM ***");
	}
}
