package code201705;

public class FactorialTrailingZeroes172 {
    public int trailingZeroes(int n) {

    	int sum = 0;
    	while (n != 0) {
    		sum += n / 5;
    		n = n / 5;
    	}
    	return sum;
    }
}
