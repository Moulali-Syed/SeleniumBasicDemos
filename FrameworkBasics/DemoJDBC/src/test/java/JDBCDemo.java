import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {

		String host = "localhost";
		String port = "3306";

		Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/databasename", "username",
				"password");
		Statement s = conn.createStatement();

		ResultSet rs = s.executeQuery("select * from credentials where scenario='zeroBalance'");

		while (rs.next()) {
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
			
//			driver.findElement(By.xpath("xpath")).sendKeys(rs.getString("username"));
//			driver.findElement(By.xpath("xpath")).sendKeys(rs.getString("password"));
		}

	}
}

/*
 * 
 * "jdbc:mysql://"+host+":"+port+"/databasename"; port-3306 default
 * 
 * in our local machine url is "jdbc:mysql://"+localhost+":"+3306+"/db";
 * 
 */