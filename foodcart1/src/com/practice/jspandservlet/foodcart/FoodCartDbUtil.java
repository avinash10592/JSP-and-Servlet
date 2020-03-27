package com.practice.jspandservlet.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {
	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/food?useSSL=false";
		String userName = "root";
		String password = "Lakshmi@2";

		ArrayList<Food> food = new ArrayList<>();

		// Load the mysql driver
		Class.forName("com.mysql.jdbc.Driver");

		// get the connection
		Connection connection = DriverManager.getConnection(url, userName, password);

		// create the statement
		Statement statement = connection.createStatement();

		// execute the statement and loop over the result set
		ResultSet rs = statement.executeQuery("SELECT * FROM food.foodcart");

		while (rs.next()) {
			int id = rs.getInt(1);
			String items = rs.getString(2);
			float price = rs.getFloat(3);
			Food food1 = new Food(id, items, price);
			food.add(food1);
		}
		return food;
	}

}
