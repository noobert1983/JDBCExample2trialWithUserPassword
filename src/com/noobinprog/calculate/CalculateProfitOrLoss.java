package com.noobinprog.calculate;

import com.noobinprog.value.ValueOfCuttingProducts;

public class CalculateProfitOrLoss {

	private double elementsValue;
	private double profitOrLoss;

	public double calculateElementsValue(ValueOfCuttingProducts vocp) {
		if (vocp.getValueOfPurchasedCarcassKilograms() != 0) {
			elementsValue = vocp.getValueOfFileet() + vocp.getValueOfQuarter() + vocp.getValueOfWings()
					+ vocp.getValueOfBones();
			System.out.println("wartosc elementów z rozbioru to : " + elementsValue + "PLN");
		} else {
			System.out.println("nie ma ustalonych wartosci ");
		}
		return elementsValue;
	}

	public double calculateProfitOrLost(ValueOfCuttingProducts vocp) {
		if (elementsValue < vocp.getValueOfPurchasedCarcassKilograms()) {
			profitOrLoss = elementsValue - vocp.getValueOfPurchasedCarcassKilograms();
			System.err.println("dokladka do BIZNESU :( \n Wartosc elementow po rozbiorze to: " + elementsValue
					+ " wartosc zakupionego towaru to : " + vocp.getValueOfPurchasedCarcassKilograms()
					+ " Dokladka to : " + profitOrLoss);
		} else if (elementsValue == vocp.getValueOfPurchasedCarcassKilograms()) {
			System.out.println("nie zarobiles ani nie dolozyles :) ");
		} else if (elementsValue > vocp.getValueOfPurchasedCarcassKilograms()) {
			profitOrLoss = elementsValue - vocp.getValueOfPurchasedCarcassKilograms();
			System.out.println("udalo sie zarobic : " + profitOrLoss + "PLN" + "\nWartosc elementow po rozbiorze to: "
					+ elementsValue + " wartosc zakupionego towaru to : " + vocp.getValueOfPurchasedCarcassKilograms());
		}
		return profitOrLoss;
	}
}


/*public boolean profit(cal) {
	return false;
	
}
*/

