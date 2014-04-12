package com.trabalhos.paper1;

public class Unit extends Thread {
	private short health = 10;
	private short position = 0;
	private short startPosition = 0;
	private short finalPosition;
	private boolean patrolling = false;
	
	public static void print (String message) {
		System.out.println(message);
	}
	
	public void run() {
		synchronized (this) { // allows only one unit to move at a time 
			if (health <= 0) {
				this.destroy();
				print("Unit died.");
			}
			
			if (position == finalPosition) {
				if (!patrolling) {
					try {
						print("Unit reached destination, waiting for new command.");
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else { // patrolling 
					short intermediatePosition = finalPosition;
					finalPosition = startPosition;
					startPosition = intermediatePosition;
					try {
						print("Unit waiting for 100 milliseconds.");
						this.wait(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} else {
				if (position < finalPosition) {
					print("Unit moved from "+position+" to " + (position + 1)+".");
					position++;
				} else {
					print("Unit moved from "+position+" to " + (position - 1)+".");
					position--;
				}
			}
		}
	}
}
