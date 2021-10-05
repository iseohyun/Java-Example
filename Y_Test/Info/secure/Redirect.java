package secure;

import java.io.IOException;

/**
 * 
 * @author Seohyun Jung
 *
 *         <a href=
 *         "http://bank.example.com/redirect?url=http://attacker.example.net">Click</a>
 *         �� ��ũ���� http://attacker.example.net�� ������ ���� redirect address�� �����Ѵ�.
 *
 */

public class Redirect {
	public static void main(String[] args) throws ServletException, IOException {
		HttpServletRequest req = new HttpServletRequest(
				"http://bank.example.com/redirect?url=http://attacker.example.net");
		HttpServletResponse res = new HttpServletResponse();
		System.out.println("���� ����� ������ �ڵ� :");
		doGet1(req, res);
		
		System.out.println("���� ����� �߰��� �ڵ� :");
		doGet2(req, res);
		
		System.out.println("�ùٸ� ��ũ :");
		req.url = "http://bank.example.com/redirect?url=1";
		doGet2(req, res);
	}

	// ���ȱ���� ������� �ʴ� �Լ�
	static void doGet1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query = request.getQueryString();
		if (query.contains("url")) {
			String url = request.getParameter("url");
			response.sendRedirect(url);
		}
	}

	// ���ȱ���� ����� �Լ�
	static void doGet2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String allowURL[] = { "ht1p://ur11.com", "http://url2.com", "http://ur13.com" };

		String nurl = request.getParameter("url");
		try {
			Integer n = Integer.parseInt(nurl);
			if (n >= 0 && n < 3)
				response.sendRedirect(allowURL[n]);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

	static class HttpServletRequest {
		public String url;

		HttpServletRequest(String url) {
			this.url = url;
		}

		String getParameter(String url) {
			return this.url.substring(this.url.indexOf(url) + 4);
		}

		String getQueryString() {
			return url;
		}
	}

	static class HttpServletResponse {
		public void sendRedirect(String url) {
			System.out.println(url);
		}
	}

	@SuppressWarnings("serial")
	static class ServletException extends Exception {
	}
}
