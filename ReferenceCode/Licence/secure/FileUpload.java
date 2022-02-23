package secure;

import java.io.File;
import java.util.Iterator;

/**
 * 
 * @author Seohyun Jung
 *
 */

public class FileUpload {
	
	@SuppressWarnings("unused")
	public void upload(HttpServletRequestWrapper request) throws ServletException {
		MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
		String next = (String) mRequest.getFileNames().next();
		MultipartFile file = mRequest.getFile(next);
		
		// MultipartFile�κ��� ������ ��´�.
		String fileName = file.getOriginalFilename();
		
		// upload ���Ͽ� ���� Ȯ���ڳ� ũ���� ��ȿ���� üũ���� �ʾҴ�.
		File uploadDir = new File("/app/webapp/data/upload/notice");
		String uploadFilePath = uploadDir.getAbsolutePath() + "/" + fileName;
		/* ���� file upload ��ƾ */
	}

	public void upload(HttpServletRequest request) throws ServletException {
		MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
		String next = (String) mRequest.getFileNames().next();
		MultipartFile file = mRequest.getFile(next);
		if (file == null) {
			return;
		}

		// ���ε� ������ ũ�⸦ �����Ѵ�
		int size = file.getSize();
		if (size > MAX_FILE_SIZE)
			throw new ServletException("Error");

		// MultipartFile�κ��� ������ ��´�.
		String fileName = file.getOriginalFilename().toLowerCase();

		// ȭ��Ʈ����Ʈ ������� ���ε� ������ Ȯ���ڸ� üũ�ϵ��� �Ѵ�
		if (fileName != null) {
			if (fileName.endsWith(".doc") || fileName.endsWith(".hwp") || fileName.endsWith(".pdf")
					|| fileName.endsWith(".xls")) {
			}
		}
	}
	
	private static final int MAX_FILE_SIZE = 1000000;

	class MultipartHttpServletRequest {
		MultipartFile getFile(String str) {
			MultipartFile m = null;
			return m;
		}

		Iterator<String> getFileNames() {
			Iterator<String> iter = null;
			return iter;
		}
	}

	class HttpServletRequestWrapper extends MultipartHttpServletRequest {
	}

	@SuppressWarnings("serial")
	class ServletException extends Exception {
		ServletException(String str) {
		}
	}

	class MultipartFile {
		String getOriginalFilename() {
			String str = null;
			return str;
		}

		int getSize() {
			return 1;
		}
	}

	class HttpServletRequest extends MultipartHttpServletRequest {
		String getQueryString() {
			return "";
		}
		String getParameter(String str) {
			return str;
		}
		void sendRedirect(String url) {
		}
	}
}
