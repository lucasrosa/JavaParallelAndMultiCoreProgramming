package com.aula01.exercicios.thread01;

import javax.swing.JLabel;

public class Contador extends Thread{
	
	private boolean paused;
	private int number;
	public JLabel texto;
	
	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
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
		number = 0;
		while (true) {
			long secondNow = System.currentTimeMillis() / 1000;
		    if (secondNow != secondLast && !this.isPaused()) {
		    	secondLast = secondNow;
		    	number++;
		    	texto.setText("" + number);
		    }
		}
	}
	
}
