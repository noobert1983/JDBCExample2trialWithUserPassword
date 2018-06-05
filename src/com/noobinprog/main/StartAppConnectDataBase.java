package com.noobinprog.main;

import com.noobinprog.calculate.CalculateProfitOrLoss;
import com.noobinprog.connector.ConnectorClass;
import com.noobinprog.value.ValueOfCuttingProducts;

public class StartAppConnectDataBase {

	public static void main(String[] args) {		
	
		ValueOfCuttingProducts vocp = new ValueOfCuttingProducts();
		vocp.setValueOfPurchasedCarcassKilograms();
		vocp.setValueOfFillet();
		vocp.setValueOfQuarter();
		vocp.setValueOfWings();
		vocp.setValueOfBones();

		CalculateProfitOrLoss cpol = new CalculateProfitOrLoss();
		cpol.calculateElementsValue(vocp);
		cpol.calculateProfitOrLost(vocp);
		
		ConnectorClass.connectAndInsertToDataBase();
		ConnectorClass.connectAndSelectAllFromDataBase();
	}
}
