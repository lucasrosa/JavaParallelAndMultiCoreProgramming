package com.aula01.exercicios.semaforo02;

import javax.swing.JLabel;

public class Semaforo  extends Thread {
	
	/* status : which light is on at the moment
	 * 0 : Red
	 * 1 : Orange
	 * 2 : Green
	 */
	private int        status;
	private JLabel    redText;
	private JLabel orangeText;
	private JLabel  greenText;
	private boolean statusJustChanged;
	private long secondOfChange   = 0;
	
	public JLabel getRedText() {
		return redText;
	}
	public void setRedText(JLabel redText) {
		this.redText = redText;
	}
	public JLabel getOrangeText() {
		return orangeText;
	}
	public void setOrangeText(JLabel orangeText) {
		this.orangeText = orangeText;
	}
	public JLabel getGreenText() {
		return greenText;
	}
	public void setGreenText(JLabel greenText) {
		this.greenText = greenText;
	}	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public boolean didStatusJustChanged() {
		return statusJustChanged;
	}
	public void setStatusJustChanged(boolean statusJustChanged) {
		this.statusJustChanged = statusJustChanged;
	}
	public long getSecondOfChange() {
		return secondOfChange;
	}
	public void setSecondOfChange(long secondOfChange) {
		this.secondOfChange = secondOfChange;
	}
	
	public void change() {
		
		this.setSecondOfChange(System.currentTimeMillis() / 1000);
		
		if (this.getStatus() == 0) {
			this.setStatusJustChanged(true);
			this.setStatus(2);
		} else { // this.status == 2
			this.setStatusJustChanged(true);
			this.setStatus(0);
		}
	}
	
	public void run(){
		
		long secondNow 	    = 0;
		boolean red    = false,
				orange = false,
				green  = false;
		
		int localStatus = 0;
		
		
		while (true) {
			if (this.didStatusJustChanged()) {
				secondNow = System.currentTimeMillis() / 1000;
				
				// if 5 seconds passed... 
				if (secondNow - this.getSecondOfChange() >= 5) {
					this.setStatusJustChanged(false);
					localStatus = this.getStatus();
				} else {
					// if it is transitioning to red (0), it should be orange (1)
					if (this.getStatus() == 0) {
						//System.out.println("here");
						localStatus = 1;
					} else {
						localStatus = 0;
					}
				}
			} else {
				localStatus = this.getStatus();
			}
			
			switch (localStatus) {
			case 0:
				red = true;
				orange = green = false;
				break;
			case 1:
				orange = true;
				red = green = false;
				break;
			case 2:
				green = true;
				orange = red = false;
				break;
				
			default:
				break;			
			}
			
			redText   .setText("" +    (red?1:0));
			orangeText.setText("" + (orange?1:0));
			greenText .setText("" +  (green?1:0));
		}
	}
}
