package com.noobinprog.random;

import java.util.Random;

public class RandomGenerator {
	private int randInt;
	
	Random rand = new Random();

	public int getRandInt() {
		return randInt;
	}

	public void setRandInt(int i) {
		this.randInt = rand.nextInt(i);
	}
	
	public RandomGenerator() {
		System.out.println("contructor RandomGenerator");
	}
	
}
