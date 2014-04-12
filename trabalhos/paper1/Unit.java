package com.trabalhos.paper1;

public class Unit extends Thread {
	private short health = 10;
	private short position = 0;
	private short startPosition = 0;
	private short finalPosition;
	private boolean patrolling = false;

	public short getHealth() {
		return health;
	}

	public void setHealth(short health) {
		this.health = health;
	}

	public short getPosition() {
		return position;
	}

	public void setPosition(short position) {
		this.position = position;
	}

	public short getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(short startPosition) {
		this.startPosition = startPosition;
	}

	public short getFinalPosition() {
		return finalPosition;
	}

	public void setFinalPosition(short finalPosition) {
		this.finalPosition = finalPosition;
	}

	public boolean isPatrolling() {
		return patrolling;
	}

	public void setPatrolling(boolean patrolling) {
		this.patrolling = patrolling;
	}


	public static void print (String message) {
		System.out.println(message);
	}

	public void run() {

		synchronized (this) { // allows only one unit to move at a time
			while (health > 0) {

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
							print("Unit reached patrol destination, waiting for 3000 milliseconds to start going back.");
							health--;
							this.wait(3000);
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
		
		print("Unit died.");
	}
}
