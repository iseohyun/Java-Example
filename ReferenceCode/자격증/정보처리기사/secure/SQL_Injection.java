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
 *	이하 작업은 SQL서버에 접근하여, props로부터 테이블 명과 검색조건을 받아와 검색하는 기능이다.
 *	공격이 이루어지는 순간은 rs = executeQuery();이다.
 *
 *	tableName과 검색조건(name)을 삽입할 때, 주석과 같이 삽입할 수 있다.
 *	이하 stmt.setString에서 삽입되는 이름을 확인하므로써 보안을 향상 시킬 수 있다.
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

			// 안전성을 향상 시키는 코딩
			stmt.setString(1, tableName);
			stmt.setString(2, name);

			rs = stmt.executeQuery();
		} catch (SQLException sqle) {
		} finally {
		}
	}
}