package com.trabalhos.paper1;

public class Main {
	public static void main(String[] args) {
		Unit soldier1 = new Unit();
		soldier1.setHealth((short) 3);
		soldier1.setPosition((short) 0);
		soldier1.setStartPosition((short) 0);
		soldier1.setFinalPosition((short) 3);
		soldier1.setPatrolling(true);
		soldier1.start();
	}
}
