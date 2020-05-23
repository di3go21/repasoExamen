package BBDD;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaBase {

	public static void main(String[] args) {

		try {
			Connection conex = DriverManager.getConnection("jdbc:mysql://localhost/morgan", "root", "");

			DatabaseMetaData md = conex.getMetaData();

			System.out.println("gestor " + md.getDatabaseProductName());

			System.out.println("version " + md.getDatabaseProductVersion());
			System.out.println("nombre del driver " + md.getDriverName());
			System.out.println("version controlador " + md.getDriverVersion());
			System.out.println("#####################");
			System.out.println("listado de bbdd ");

			ResultSet rs = md.getCatalogs();
			while (rs.next())
				System.out.println(rs.getString(1));
			System.out.println("#####################");
			System.out.println("listadod e tablas en bbdd examen");
			rs = md.getTables("examen", null, "%", null);
			while (rs.next())
				System.out.println(rs.getString(1)+" " +rs.getString(3));
			System.out.println("#####################");
			System.out.println("columnas:");
			rs = md.getColumns("examen", null, "%", null);
			while (rs.next())
				System.out.println(rs.getString(4)+" " +rs.getString(6));
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
