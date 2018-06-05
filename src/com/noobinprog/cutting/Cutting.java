package com.noobinprog.cutting;

public class Cutting {
	

	private double purchasedCarcassKilograms;
	private double fillet;
	private double quarter;
	private double wings;
	private double bones;
	

	public Cutting(double purchasedCarcassKilograms) {
		super();
		this.purchasedCarcassKilograms = purchasedCarcassKilograms;
		System.out.println("constructor cutting class with one argument : " + purchasedCarcassKilograms);
	}

	public double getPurchasedCarcassKilograms() {
		return purchasedCarcassKilograms;
	}

	public void setPurchasedCarcassKilograms(double purchasedCarcassKilograms) {
		this.purchasedCarcassKilograms = purchasedCarcassKilograms;
	}

	public double getFillet() {
		return fillet;
	}

	public void setFillet(double fillet) {
		this.fillet = fillet;
	}

	public double getQuarter() {
		return quarter;
	}

	public void setQuarter(double quarter) {
		this.quarter = quarter;
	}

	public double getWings() {
		return wings;
	}

	public void setWings(double wings) {
		this.wings = wings;
	}

	public double getBones() {
		return bones;
	}

	public void setBones(double bones) {
		this.bones = bones;
	}

	public void calculate(Cutting c) {
		if (c.getPurchasedCarcassKilograms() == 0) {
			System.out.println("podaj liczbe zakupionego towaru :");
		} else {

			double fillet = c.getPurchasedCarcassKilograms() * 0.28;
			c.setFillet(fillet);
			double quarter = c.getPurchasedCarcassKilograms() * 0.41;
			c.setQuarter(quarter);
			double wings = c.getPurchasedCarcassKilograms() * 0.14;
			c.setWings(wings);
			double bones = c.getPurchasedCarcassKilograms() * 0.17;
			c.setBones(bones);

		}
	}
}
