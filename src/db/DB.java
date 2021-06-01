package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
	
	// Gerando uma conexão com o banco de dadod
	private static Connection com = null;
	
	public static Connection getConnection() {
		if(com == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				com = DriverManager.getConnection(url, props);
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return com;
	}
	
	// fechando a conexão 
	
	public static void closeConnection() {
		if(com != null) {
			try {
				com.close();
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	// carregar as propriedades do arquivo db.proprierties
	// E guardar dentro de um objeto especifico

	private static Properties loadProperties() {
		
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
			//load faz a leitura do arquivo props apontanto pelo InputStream(fs)
			//E guarda os dados dentro do objeto props
		}
		catch (IOException e) {
			throw new DbException( e.getMessage());
		}
	}
	
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

}
