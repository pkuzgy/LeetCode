package code201705;
/*
 * Å£¶Ùµü´ú·¨
 * long r = x;
    while (r*r > x)
        r = (r + x/r) / 2;
    return (int) r;
 */
public class Sqrt069 {
    public int mySqrt(int x) {
        for (int i = 1;;i++) {
        	if (i > x / i) {
        		return i - 1;
        	}
        }
    }
}
