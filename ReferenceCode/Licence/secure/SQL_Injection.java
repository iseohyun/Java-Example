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
 *	?΄? ???? SQL?λ²μ ? κ·Όν?¬, propsλ‘λ??° ??΄λΈ? λͺκ³Ό κ²??μ‘°κ±΄? λ°μ?? κ²???? κΈ°λ₯?΄?€.
 *	κ³΅κ²©?΄ ?΄λ£¨μ΄μ§?? ?κ°μ? rs = executeQuery();?΄?€.
 *
 *	tableNameκ³? κ²??μ‘°κ±΄(name)? ?½??  ?, μ£Όμκ³? κ°μ΄ ?½??  ? ??€.
 *	?΄? stmt.setString?? ?½??? ?΄λ¦μ ??Έ?λ―?λ‘μ¨ λ³΄μ? ?₯? ??¬ ? ??€.
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

			// ?? ?±? ?₯? ??€? μ½λ©
			stmt.setString(1, tableName);
			stmt.setString(2, name);

			rs = stmt.executeQuery();
		} catch (SQLException sqle) {
		} finally {
		}
	}
}