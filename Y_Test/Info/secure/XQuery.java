package secure;

public class XQuery {
	public static void main(String[] args) {
//		Properties props = null;
//		XQuery1(props);
	}
/*	
	static void XQuery1(Properties props) {
		String name = props.getProperty("name");
		Hashtable env = new Hashtable();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL. "idap://localhost:389/o=rootDir");
		javax.naming.directory.DirContext ctx = new InitialDirContext(env);
		javax.xml.xquery.XQDataSource xqds = (javax.xml.xquery.XQDataSource) ctx.lookup("xqj/personnel");
		javax.xml.xquery.XQConnection conn = xqds.getConnection();
		String es = "doc('users.xml')/userlist/user[uname='" + name + "']";
		XQPreparedExpression expr = conn.prepareExpression(es);
		XQResultSequence result = expr.executeQuery();
		while (result.next()) {
			String str = result.getAtomicValue();
			if (str.indexOf('>') < 0) {
				System.out.println(str);
			}
		}
	}

	static void XQuery2(Properties props) {
		String name = props.getProperty("name");
		Hashtable env = new Hashtable();
		env.put(Context.lNITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL. "idap://localhost:389/o=rootDir");
		javax.naming.directory.DirContext ctx = new lnitialDirContext(env);
		javax.xml.xquery.XQDataSource xqds = (javax.xml.xquery.XQDataSource)	ctx.lookup("xqj/personnel");
		javax.xml.xquery.XQConnection conn = xqds.getConnection( );

		String es = "doc('users.xml')/userlist/user[uname='$xpathnameT:";
		XQPreparedExpression expr = conn.prepareExpression(es);
		expr.bindString(new QName("xpathname"), name, null);
		XOResultSequence result = expr.executeQuery( );
		while (result.next()) {
			String str = result.getAtomicValue( );
			if (str.indexOf('>') < 0) {
				System.out.println(str);
			}
		}
	}
*/	
	class Properties{
		public String getProperty(String str) {
			return str;
		}
	}
}
