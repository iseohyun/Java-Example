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
 *	?´?•˜ ?‘?—…?? SQL?„œë²„ì— ? ‘ê·¼í•˜?—¬, propsë¡œë??„° ?…Œ?´ë¸? ëª…ê³¼ ê²??ƒ‰ì¡°ê±´?„ ë°›ì•„?? ê²??ƒ‰?•˜?Š” ê¸°ëŠ¥?´?‹¤.
 *	ê³µê²©?´ ?´ë£¨ì–´ì§??Š” ?ˆœê°„ì? rs = executeQuery();?´?‹¤.
 *
 *	tableNameê³? ê²??ƒ‰ì¡°ê±´(name)?„ ?‚½?…?•  ?•Œ, ì£¼ì„ê³? ê°™ì´ ?‚½?…?•  ?ˆ˜ ?ˆ?‹¤.
 *	?´?•˜ stmt.setString?—?„œ ?‚½?…?˜?Š” ?´ë¦„ì„ ?™•?¸?•˜ë¯?ë¡œì¨ ë³´ì•ˆ?„ ?–¥?ƒ ?‹œ?‚¬ ?ˆ˜ ?ˆ?‹¤.
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

			// ?•ˆ? „?„±?„ ?–¥?ƒ ?‹œ?‚¤?Š” ì½”ë”©
			stmt.setString(1, tableName);
			stmt.setString(2, name);

			rs = stmt.executeQuery();
		} catch (SQLException sqle) {
		} finally {
		}
	}
}