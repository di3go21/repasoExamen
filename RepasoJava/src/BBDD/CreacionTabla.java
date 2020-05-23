package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreacionTabla {
	public static void main(String[] args) {

		String createtable = "Create Table Autor (Id integer primary key, Nom_Ap Varchar(64))";
		Connection conex;
		try {
			conex = DriverManager.getConnection("jdbc:mysql://localhost/morgan", "root", "");

			Statement st = conex.createStatement();
			st.execute("drop table if exists Autor");
			st.execute(createtable);
			st.execute("insert into Autor values (127,'Peter Norton')");

				st.close();

				conex.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	

	}
}