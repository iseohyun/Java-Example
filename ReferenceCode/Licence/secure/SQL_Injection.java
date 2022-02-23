package secure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 * @author Seohyun Jung
 *
 *	?��?�� ?��?��?? SQL?��버에 ?��근하?��, props로�??�� ?��?���? 명과 �??��조건?�� 받아?? �??��?��?�� 기능?��?��.
 *	공격?�� ?��루어�??�� ?��간�? rs = executeQuery();?��?��.
 *
 *	tableName�? �??��조건(name)?�� ?��?��?�� ?��, 주석�? 같이 ?��?��?�� ?�� ?��?��.
 *	?��?�� stmt.setString?��?�� ?��?��?��?�� ?��름을 ?��?��?���?로써 보안?�� ?��?�� ?��?�� ?�� ?��?��.
 *
 */

@SuppressWarnings("unused")
public class SQL_Injection {
	public static void main(String[] args) {
		Properties props = new Properties();
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;

		try {
			conn = DriverManager.getConnection("URL");

			String tableName = props.getProperty("jdbc.tableName");
			String name = props.getProperty("jdbc.name");

			// String query = "SELECT FROM " + tableName + " WHERE Name =" + name;
			String query = "SELECT FROM ? WHERE Name = ? ";
			stmt = conn.prepareStatement(query);

			// ?��?��?��?�� ?��?�� ?��?��?�� 코딩
			stmt.setString(1, tableName);
			stmt.setString(2, name);

			rs = stmt.executeQuery();
		} catch (SQLException sqle) {
		} finally {
		}
	}
}