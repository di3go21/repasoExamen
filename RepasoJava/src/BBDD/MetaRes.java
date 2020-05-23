package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaRes {
	public static void main(String[] args) {
		
	try {
		Connection conex = DriverManager.getConnection("jdbc:mysql://localhost/tiendafruta", "root", "");
		
		Statement st = conex.createStatement();
		
		ResultSet rs = st.executeQuery("select * from eproducto");
		ResultSetMetaData rmd = rs.getMetaData();
		
		for (int i = 1; i <= rmd.getColumnCount(); i++) {
			System.out.println("columna "+rmd.getTableName(i)+" "+rmd.getColumnName(i)+" "+rmd.getColumnTypeName(i)+"("+rmd.getColumnDisplaySize(i)+')');
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}


	}
}
