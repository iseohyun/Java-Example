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
		
		// MultipartFile로부터 파일을 얻는다.
		String fileName = file.getOriginalFilename();
		
		// upload 파일에 대한 확장자나 크기의 유효성을 체크하지 않았다.
		File uploadDir = new File("/app/webapp/data/upload/notice");
		String uploadFilePath = uploadDir.getAbsolutePath() + "/" + fileName;
		/* 이하 file upload 루틴 */
	}

	public void upload(HttpServletRequest request) throws ServletException {
		MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
		String next = (String) mRequest.getFileNames().next();
		MultipartFile file = mRequest.getFile(next);
		if (file == null) {
			return;
		}

		// 업로드 파일의 크기를 제한한다
		int size = file.getSize();
		if (size > MAX_FILE_SIZE)
			throw new ServletException("Error");

		// MultipartFile로부터 파일율 얻는다.
		String fileName = file.getOriginalFilename().toLowerCase();

		// 화이트리스트 방식으로 업로드 파일의 확장자를 체크하도록 한다
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
