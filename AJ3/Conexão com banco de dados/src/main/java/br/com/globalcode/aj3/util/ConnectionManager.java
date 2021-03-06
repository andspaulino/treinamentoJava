package br.com.globalcode.aj3.util;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.globalcode.aj3.exception.GlobalcodeException;


public class ConnectionManager {

	/*
	 * Os valores das constantes abaixo devem estar de acordo com o banco de
	 * dados utilizado.
	 */
	private static final String DATABASE = "aj";
	private static final String IP = "192.168.0.1";
	private static final String STR_CON = "jdbc:mysql://" + IP + ":3306/" + DATABASE;
	private static final String USER = "aj";
	private static final String PASSWORD = "aj";

	public static Connection getConnection() throws GlobalcodeException {
		Connection conn = null;
		try {
			// a) Faca a abertura da conexao
			conn = DriverManager.getConnection("jdbc:mysql://host:3306/aj","aj", "aj");
			System.out.println("[ConnectionManager]: Obtendo conexao");
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro ao obter a conexao", e);
		}
            return conn;
	}

	public static void closeAll(Connection conn) {
		try {
			// b)Se a conexao (conn) nao eh null, entao feche a conexao
			if(conn != null) {
                conn.close();
            }
			
		} catch (Exception e) {
			System.out.println("---> Nao foi possivel fechar a conexao com o banco");
			System.out.println("---> Detalhamento do erro: ");
			e.printStackTrace();
		}
	}
}
