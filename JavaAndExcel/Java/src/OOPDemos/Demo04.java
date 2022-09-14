package OOPDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int num = sc.nextInt();
			System.out.println(num);
		}
	}
	
	public void methodToConnectDB() throws SQLException {
		Connection conn = DriverManager.getConnection("dbURL","username","password");
		Statement stmt = conn.createStatement();
		String s = "select * from employees";
		ResultSet rs =  stmt.executeQuery(s);
		
		while(rs.next()) {
			int eid = rs.getInt("employee_id");
		}
		conn.close();
	}
}
