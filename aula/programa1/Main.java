package com.aula.programa1;

public class Main {
	public static void main(String[] args) {
		MinhaThread t = new MinhaThread();
		Thread t2 = new Thread(t);
		t2.start();
	}
}
