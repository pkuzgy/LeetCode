package code201705;

public class PalindromeNumber009 {
    public boolean isPalindrome(int x) {
    	if(x < 0) {
    		return false;
    	}
        
        while (x/10 != 0) {
            if (String.valueOf(x).charAt(0) == String.valueOf(x).charAt(String.valueOf(x).length() - 1)) {
                x = Integer.parseInt(String.valueOf(x).substring(1)) / 10;
                
            } else {
                return false;
            }
        }
        return true;
    }
}