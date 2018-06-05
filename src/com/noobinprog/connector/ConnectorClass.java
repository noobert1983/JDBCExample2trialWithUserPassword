package com.noobinprog.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.noobinprog.cutting.Cutting;
import com.noobinprog.cutting.QuantityForCutting;
import com.noobinprog.format.date.DateStringFormat;

public class ConnectorClass {
	public static void connectAndSelectAllFromDataBase() {
		String connURL = "jdbc:mysql://localhost/rozbior?user=rozbiorowy&password=rozbiorowy1983&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String query = "Select * FROM tab";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connURL);
			Class.forName("com.mysql.jdbc.Driver");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if (conn.getCatalog() != null) {
				System.out.println("CONGRATULATIONS CONNECTED WITH DATABASE...");
				System.out.println("DATABASE NAME IS : " + conn.getCatalog());
			} else
				System.out.println(" :-( SMUTECZEK ");
			while (rs.next()) {
				schowDataFromDataBase(rs);
			}
			conn.close();
			System.out.println("ROZLACZONO Z BAZA DANYCH");
		} catch (ClassNotFoundException classException) {
			System.out.println("Drivers problem with Class");
		} catch (SQLException exception) {
			// e.printStackTrace();
			System.out.println(
					"Login issue \n Please check:\n user name, user password, database name or IP server adress");
			System.out.println("SQLException: " + exception.getMessage());
			System.out.println("SQLState: " + exception.getSQLState());
			System.out.println("VendorError: " + exception.getErrorCode());
		}
	}

	static String dataFromDataBase;

	static void schowDataFromDataBase(ResultSet rs) {
		try {
			dataFromDataBase = rs.getString(1);
			System.out.println("\n" + dataFromDataBase + " ");
			dataFromDataBase = rs.getString(2);
			System.out.println(dataFromDataBase + " ");
			dataFromDataBase = rs.getString(3);
			System.out.println(dataFromDataBase);
			dataFromDataBase = rs.getString(4);
			System.out.println(dataFromDataBase);
			dataFromDataBase = rs.getString(5);
			System.out.println(dataFromDataBase);
			dataFromDataBase = rs.getString(6);
			System.out.println(dataFromDataBase);
			dataFromDataBase = rs.getString(7);
			System.out.println(dataFromDataBase);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void connectAndInsertToDataBase() {

		//RandomGenerator rg = new RandomGenerator();
		// for(int i=0;i<10;i++) {
		//rg.setRandInt(100);
		//System.out.println(rg.getRandInt());
		// }
		//Cutting c = new Cutting(rg.getRandInt() * 1000);
		
		
		
		//Cutting c = new Cutting(3000);
		QuantityForCutting qfc = new QuantityForCutting();
		Cutting cFromConnectorClass = qfc.getCutting(); 
		
		
				
		cFromConnectorClass.calculate(cFromConnectorClass);

		String connURL = "jdbc:mysql://localhost/rozbior?user=rozbiorowy&password=rozbiorowy1983&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String queryInsert = " insert into tab (data, tuszka, filet, cwiartka, skrzydlo, korpus)"
				+ " values (?, ?, ?, ?, ?, ?)";
		Connection conn = null; // `id`, `data`, `tuszka`, `filet`, `cwiartka`, `skrzydlo`, `korpus`
		try {
			conn = DriverManager.getConnection(connURL);
			Class.forName("com.mysql.jdbc.Driver");

			PreparedStatement preparedStmt = conn.prepareStatement(queryInsert);
			// preparedStmt.setInt(1,aut);
			// preparedStmt.setDate(2,java.sql.Date.valueOf("2018-05-31"));
			preparedStmt.setDate(1, java.sql.Date.valueOf(DateStringFormat.giveDateInStringFormat()));
			preparedStmt.setDouble(2, cFromConnectorClass.getPurchasedCarcassKilograms());
			preparedStmt.setDouble(3, cFromConnectorClass.getFillet());
			preparedStmt.setDouble(4, cFromConnectorClass.getQuarter());
			preparedStmt.setDouble(5, cFromConnectorClass.getWings());
			preparedStmt.setDouble(6, cFromConnectorClass.getBones());
			preparedStmt.execute();

			if (conn.getCatalog() != null) {
				System.out.println("CONGRATULATIONS CONNECTED WITH DATABASE...");
				System.out.println("DATABASE NAME IS : " + conn.getCatalog());
				System.out.println("insert into database ,status success".toUpperCase());
				System.out.println("czas potrzebny na operacje to : " + conn.getNetworkTimeout());
			} else
				System.out.println(" :-( COS NIE TAK NIE POLACZONO Z BAZA DANYCH");

			conn.close();
			System.out.println("ROZLACZONO Z BAZA DANYCH");
		} catch (ClassNotFoundException classException) {
			System.out.println("Drivers problem with Class");
		} catch (SQLException exception) {
			// e.printStackTrace();
			System.out.println(
					"Login issue \n Please check:\n user name, user password, database name or IP server adress");
			System.out.println("SQLException: " + exception.getMessage());
			System.out.println("SQLState: " + exception.getSQLState());
			System.out.println("VendorError: " + exception.getErrorCode());
		}
	}

}
