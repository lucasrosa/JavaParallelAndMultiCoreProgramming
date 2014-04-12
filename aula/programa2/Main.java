package com.aula.programa2;

public class Main {
	public static void main(String[] args) {
		System.out.println("Inicio da thread main ***");
		Thread t1 = new Thread(new MinhaThread(), "thread 1");
		Thread t2 = new Thread(new MinhaThread(), "\t\tthread 2");
		Thread t3 = new Thread(new MinhaThread(), "\t\t\t\t\t\tthread 3");
		Thread t4 = new Thread(new MinhaThread(), "\t\t\t\t\t\t\t\t\t\tthread 4");
		Thread t5 = new Thread(new MinhaThread(), "\t\t\t\t\t\t\t\t\t\t\t\tthread 5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	} 
}
