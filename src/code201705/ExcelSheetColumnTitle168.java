package code201705;
/*
 * StringBuilder效率还是很高的
 */
public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        n = n - 1;
        while (n >= 0) {
        	stringBuilder.append((char) (n % 26 + 'A'));
        	n = n / 26 - 1;
        }
        return stringBuilder.reverse().toString();
    }
}
