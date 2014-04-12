package com.aula02.exercicios.contador01;

import java.util.Random;

import javax.swing.JLabel;

public class Contador extends Thread{
	
	private boolean incrementing;
	private int number;
	public JLabel texto;
	
	public boolean isIncrementing() {
		return incrementing;
	}

	public void setIncrementing(boolean incremeting) {
		this.incrementing = incremeting;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	
	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}

	public void run(){
		long secondLast = 0;
		// identify if the current number already changed (inc or dec), if it did generate another, if not change it
		boolean changed = false;
		Random randomizer = new Random();
		number = 0;
		int sum = 0;
		while (true) {
			long secondNow = System.currentTimeMillis() / 1000;
		    if (secondNow != secondLast) {
		    	secondLast = secondNow;
		    	if(changed){
		    		number = this.incrementing ? (number += sum) : (number -= sum);
		    		changed = false;
		    	} else {
		    		sum = randomizer.nextInt(100);	
		    		changed = true;
		    	}
		    	texto.setText("" + number);
		    }
		}
	}
	
}
