package com.aula02.exercicios.corrida02;

import java.util.Random;

import javax.swing.JLabel;

public class Runner extends Thread{
	private int position;
	public JLabel text;

	public float getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public JLabel getText() {
		return text;
	}

	public void setText(JLabel text) {
		this.text = text;
	}

	public void run(){
		long secondLast = 0;
		Random randomizer = new Random();
		position = 0;
		boolean stopped = false;
		
		while (!stopped) {
			
			long secondNow = System.currentTimeMillis() / 50;
		    if (secondNow != secondLast) {
		    	secondLast = secondNow;
		    	position += randomizer.nextInt(3) + 1;
		    	position += randomizer.nextInt(1);
		    	text.setLocation(position, text.getY());
		    }
		    if 	(position >= 320) {
		    	//System.out.println("HERE!!!!");
		    	stopped = true;//this.interrupt();
		    }
		}
	}
}
