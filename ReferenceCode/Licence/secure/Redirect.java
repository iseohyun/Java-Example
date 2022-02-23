package secure;

import java.io.IOException;

/**
 * 
 * @author Seohyun Jung
 *
 *         <a href=
 *         "http://bank.example.com/redirect?url=http://attacker.example.net">Click</a>
 *         위 링크에서 http://attacker.example.net을 공격을 위한 redirect address로 가정한다.
 *
 */

public class Redirect {
	public static void main(String[] args) throws ServletException, IOException {
		HttpServletRequest req = new HttpServletRequest(
				"http://bank.example.com/redirect?url=http://attacker.example.net");
		HttpServletResponse res = new HttpServletResponse();
		System.out.println("보안 기능이 부족한 코드 :");
		doGet1(req, res);
		
		System.out.println("보안 기능을 추가한 코드 :");
		doGet2(req, res);
		
		System.out.println("올바른 링크 :");
		req.url = "http://bank.example.com/redirect?url=1";
		doGet2(req, res);
	}

	// 보안기능을 사용하지 않는 함수
	static void doGet1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query = request.getQueryString();
		if (query.contains("url")) {
			String url = request.getParameter("url");
			response.sendRedirect(url);
		}
	}

	// 보안기능을 사용한 함수
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
