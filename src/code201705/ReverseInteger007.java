package code201705;
/*
 * Òì³£±È½ÏÂı
 */
public class ReverseInteger007 {
    public int reverse(int x) {
        String string = String.valueOf(x);
        char[] result = new char[string.length()];
        if (string.charAt(0) == '-') {
        	result[0] = '-';
        	for (int i = 1; i < string.length(); i ++) {
        		result[i] = string.charAt(string.length() - i);
        	}
        } else {
        	for (int i = 0; i < string.length(); i ++) {
        		result[i] = string.charAt(string.length() - i - 1);
        	}
        }
        String answerString = String.copyValueOf(result);
        Integer answerInteger = 0;
        try {
			answerInteger = Integer.parseInt(answerString);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			answerInteger = 0;
		}
        
        return answerInteger;
    }
}