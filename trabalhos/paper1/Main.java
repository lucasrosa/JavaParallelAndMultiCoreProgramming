package com.trabalhos.paper1;

public class Main {
	public static void main(String[] args) {
		Unit soldier1 = new Unit();
		soldier1.setUnitName("Soldier 1");
		soldier1.setHealth((short) 3);
		soldier1.setPosition((short) 0);
		soldier1.setStartPosition((short) 0);
		soldier1.setFinalPosition((short) 100);
		soldier1.setPatrolling(false);
		
		Unit soldier2 = new Unit();
		soldier2.setUnitName("Soldier 2");
		soldier2.setHealth((short) 3);
		soldier2.setPosition((short) 0);
		soldier2.setStartPosition((short) 0);
		soldier2.setFinalPosition((short) 3);
		soldier2.setPatrolling(true);
		
		soldier1.start();
		soldier2.start();
	}
}
