package code201705;

public class PalindromeNumber009 {
    public boolean isPalindrome(int x) {
    	if (x < 0) {
    		return false;
    	}
        int result = 0;
        int value = x;
        while (x != 0) {
        	int newResult = result * 10 + x % 10;
        	if ((newResult - x % 10) / 10 != result) {
        		return false;
        	}
        	x = x / 10;
        	result = newResult;
        }
        if (result == value) return true;
        else return false;
    }
}
