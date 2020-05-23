package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	public static void main(String[] args) {

		try {
			Connection conex = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");

			Statement st = conex.createStatement();

			ResultSet rs = st.executeQuery("show databases");

			while (rs.next())
				System.out.println(rs.getString(1));
			//st.execute("create database morgan");
			rs = st.executeQuery("show databases");

			while (rs.next())
				System.out.println(rs.getString(1));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
