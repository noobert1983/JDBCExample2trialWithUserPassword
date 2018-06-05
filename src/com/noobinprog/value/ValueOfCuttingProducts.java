package com.noobinprog.value;

import java.util.Scanner;

import com.noobinprog.cutting.Cutting;
import com.noobinprog.cutting.QuantityForCutting;

class Weight {
	Weight() {
		System.out.println("Konstructor Class Wight");
	}

	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double wight) {
		this.weight = wight;
	}
}

class Price {
	Price() {
		System.out.println("Konstructor Class Price");
	}

	private double priceOfPurchasedCarcassKilograms;
	private double priceOfFillet;
	private double priceOfQuarter;
	private double priceOfWings;
	private double priceOfBones;

	public double getPriceOfPurchasedCarcassKilograms() {
		return priceOfPurchasedCarcassKilograms;
	}

	public void setPriceOfPurchasedCarcassKilograms(double priceOfPurchasedCarcassKilograms) {
		this.priceOfPurchasedCarcassKilograms = priceOfPurchasedCarcassKilograms;
	}

	public double getPriceOfFillet() {
		return priceOfFillet;
	}

	public void setPriceOfFillet(double priceOfFillet) {
		this.priceOfFillet = priceOfFillet;
	}

	public double getPriceOfQuarter() {
		return priceOfQuarter;
	}

	public void setPriceOfQuarter(double priceOfQuarter) {
		this.priceOfQuarter = priceOfQuarter;
	}

	public double getPriceOfWings() {
		return priceOfWings;
	}

	public void setPriceOfWings(double priceOfWings) {
		this.priceOfWings = priceOfWings;
	}

	public double getPriceOfBones() {
		return priceOfBones;
	}

	public void setPriceOfBones(double priceOfBones) {
		this.priceOfBones = priceOfBones;
	}

}

public class ValueOfCuttingProducts {
	
	private QuantityForCutting qfc = new QuantityForCutting();
	private Cutting cFromValueOfCuttingProducts = qfc.getCutting();
	private Price p = new Price();
	private Weight w = new Weight();
	Scanner sc = new Scanner(System.in);

	private double valueOfPurchasedCarcassKilograms;
	private double valueOfFillet;
	private double valueOfQuarter;
	private double valueOfWings;
	private double valueOfBones;

	public Cutting getC1000() {
		return cFromValueOfCuttingProducts;
	}

	public void setC1000(Cutting c1000) {
		this.cFromValueOfCuttingProducts = c1000;
	}

	public ValueOfCuttingProducts() {
		System.out.println("Konstructor Class ValueOfCuttingProducts");

	}

	public double getValueOfPurchasedCarcassKilograms() {
		return valueOfPurchasedCarcassKilograms;
	}

	public void setValueOfPurchasedCarcassKilograms() {
		cFromValueOfCuttingProducts.calculate(cFromValueOfCuttingProducts);
		w.setWeight(cFromValueOfCuttingProducts.getPurchasedCarcassKilograms());
		if (p.getPriceOfPurchasedCarcassKilograms() == 0) {
			System.out.println("Insert price for Purchased Carcass Kilograms : ");
			p.setPriceOfPurchasedCarcassKilograms(sc.nextDouble());
		}
		valueOfPurchasedCarcassKilograms = w.getWeight() * p.getPriceOfPurchasedCarcassKilograms();
		System.out.println("Value of Purchased Carcass Kilograms is : " + valueOfPurchasedCarcassKilograms + "PLN");

	}

	public void setValueOfFillet() {
		cFromValueOfCuttingProducts.calculate(cFromValueOfCuttingProducts);
		w.setWeight(cFromValueOfCuttingProducts.getFillet());
		if (p.getPriceOfFillet() == 0) {
			System.out.println("Insert price for fillet : ");
			p.setPriceOfFillet(sc.nextDouble());
		}
		valueOfFillet = w.getWeight() * p.getPriceOfFillet();
		System.out.println("Value of Fillet is : " + valueOfFillet + "PLN");
	}

	public double getValueOfFileet() {
		return valueOfFillet;
	}

	public double getValueOfQuarter() {
		return valueOfQuarter;
	}

	public void setValueOfQuarter() {
		cFromValueOfCuttingProducts.calculate(cFromValueOfCuttingProducts);
		w.setWeight(cFromValueOfCuttingProducts.getQuarter());
		if (p.getPriceOfQuarter() == 0) {
			System.out.println("Insert price for Quarter : ");
			p.setPriceOfQuarter(sc.nextDouble());
		}
		valueOfQuarter = w.getWeight() * p.getPriceOfQuarter();
		System.out.println("value of Quarter is : " + valueOfQuarter + "PLN");
	}

	public double getValueOfWings() {
		return valueOfWings;
	}

	public void setValueOfWings() {
		cFromValueOfCuttingProducts.calculate(cFromValueOfCuttingProducts);
		w.setWeight(cFromValueOfCuttingProducts.getWings());
		if (p.getPriceOfWings() == 0) {
			System.out.println("Insert price for Wings : ");
			p.setPriceOfWings(sc.nextDouble());
		}
		valueOfWings = w.getWeight() * p.getPriceOfWings();
		System.out.println("value of Wings is : " + valueOfWings + "PLN");
	}

	public double getValueOfBones() {
		return valueOfBones;
	}

	public void setValueOfBones() {
		cFromValueOfCuttingProducts.calculate(cFromValueOfCuttingProducts);
		w.setWeight(cFromValueOfCuttingProducts.getBones());
		if (p.getPriceOfBones() == 0) {
			System.out.println("Insert price for Bones : ");
			p.setPriceOfBones(sc.nextDouble());
		}
		valueOfBones = w.getWeight() * p.getPriceOfBones();
		System.out.println("value of Bones is : " + valueOfBones + "PLN");
	}
}
