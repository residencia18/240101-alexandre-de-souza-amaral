package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	
	private static final String USER = "uqiqaldz89ir1z7s";
	private static final String PASSWD = "GPZduIsgGF7pYxyrAKzU";
	private static final String URL = "jdbc:mysql://"+USER+":GPZduIsgGF7pYxyrAKzU@bw2algwaipwqausmb36r-mysql.services.clever-cloud.com:3306/bw2algwaipwqausmb36r";

	
	public static Connection conectar() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("Conexão feita com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Erro de conexão");
		}
		return con;
	}
	
	public static void main(String[] args) {
		Dao.conectar();
	}

}
