package com.aula02.exercicios.corrida02;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Judge extends Thread {
	private List<Runner> runners = new ArrayList<Runner>();
	
	public void addRunner (Runner runner) {
		runners.add(runner);
	}
	
	public void run() {
		boolean stopped = false;
		
		while (!stopped) {
			for (Runner runner : runners){
				if (runner.getText().getX() >= 320 && !stopped) {
					JOptionPane.showMessageDialog(null, "Runner " + runner.getText().getText() + " won!");
					stopped = true;
				}
			}
		}
	}
}
