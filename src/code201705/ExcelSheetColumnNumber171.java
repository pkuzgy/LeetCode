package code201705;

public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String s) {
        int mult = 1;
        int sum = 0;
        int len = s.length();
        for (int i = len - 1; i >= 0; i --) {
        	sum += mult * (s.charAt(i) - 'A' + 1);
        	mult = mult * 26;
        }
        return sum;
        
    }
}
