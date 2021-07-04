package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection con = null;

	public static void Conectar() {
		System.out.println("Conectando ao banco...");
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/divulgatudo", "root", "");
			System.out.println("Conectado.");
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}

	}
}
