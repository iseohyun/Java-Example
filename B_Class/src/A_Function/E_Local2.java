package A_Function;

public class E_Local2 {
	static int s_val = 0;
	public static void main(String [] argv) {
		int m_val = 0;
		int m_val2 = 0;
		for(int i=0; i<10;i++) {
			m_val2 = locTest(m_val, m_val2);
		}
		
	}
	static int locTest(int m_val, int m_val2)
	{
		int l_val = 0;
		s_val++;
		l_val++;
		m_val++;
		m_val2++;
		System.out.println("[s/l/m/2]"+ s_val + " " + l_val + " " + m_val + " " + m_val2);
		
		return m_val2;
	}
}
