package Quiz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 분석결과를 쓰시오.
 * 
 */
public class T07Q17_Security {
	public static void main(String[] args) {
		/* 특수 문자 공백 처리 */
		CharSequence UserInput = "ID/PW";
		//CharSequence UserInput = "where";
		//CharSequence UserInput = "ID/union";
		
		final Pattern SpecialChars = Pattern.compile("['\'\\-#()@;=*/+]");
		UserInput = SpecialChars.matcher(UserInput).replaceAll("");
		
		final String regex = "(union|select|from|where)";
		
		final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		final Matcher matcher = pattern.matcher(UserInput);
		
		if(matcher.find()) {
			System.out.println("<script>alert('Block');</script>");
		}else {
			System.out.println("No cross-script attack.");
		}
	}
}