package Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public DatabaseConnection() {
		// TODO Auto-generated constructor stub
	}

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private static ThreadLocal<Connection> tlocal = new ThreadLocal<Connection>();

	public static Connection getConnection() {

		Connection connection = tlocal.get();

		if (connection == null) {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost/invoicetransaction", "root",
						"12345678");
				tlocal.set(connection);// set the connection to thread local

				connection.setAutoCommit(false);// setting auto commit is false to use roll back
				System.out.println(connection);
				return connection;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

		return connection;

	}

	public static void closeConnection(Exception e) {
		// get connectio from thread local

		Connection connection = tlocal.get();

		if (connection != null) {
			try {
				if (e == null) {
					connection.commit();// commit changes before colisng when there is no exception
				} else {
					connection.rollback();// roll back changes when there is exception
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			} finally {// close the connection no matter what
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tlocal.remove();// remove the connection from thread local
			}
		}
	}
}