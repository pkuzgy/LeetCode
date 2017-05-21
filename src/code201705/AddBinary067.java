package code201705;
/*
 * 当需要不断对String进行操作时，可以使用StringBuilder，
 * 提供了append,insert,remove,replace,reverse等方法，
 * 效率远高于String的+
 */
public class AddBinary067 {

    public String addBinary(String a, String b) {
        int lengtha = a.length();
        int lengthb = b.length();
        int minLength = Math.min(lengtha, lengthb);
        int maxLength = Math.max(lengtha, lengthb);
        char overFlow = '0';
        int sumLength = maxLength + 1;
        char[] sum = new char[sumLength];
        for (int i = 1; i <= minLength; i ++) {
        	if (a.charAt(lengtha - i) == '1' && b.charAt(lengthb - i) == '1') {
        	    sum[sumLength - i] = overFlow;
        	    overFlow = '1';
        	} else if (a.charAt(lengtha - i) == '0' && b.charAt(lengthb - i) == '0') {
        	    sum[sumLength - i] = overFlow;
        	    overFlow = '0';
        	} else {
        		if (overFlow == '0') {
        	    	sum[sumLength - i] = '1';
        	    } else {
        	    	sum[sumLength - i] = '0';
        	    }
        	}
        }
        if (lengtha >= lengthb) {
        	for (int i = minLength + 1; i <= maxLength; i++) {
        		if (a.charAt(lengtha - i) == '0') {
        			sum[sumLength - i] = overFlow;
        			overFlow = '0';
        		} else {
        			if (overFlow == '1') {
        				sum[sumLength - i] = '0';
        			} else {
        				sum[sumLength - i] = '1';
					}
        		
				}
        	}
        } else {
        	for (int i = minLength + 1; i <= maxLength; i++) {
        		if (b.charAt(lengthb - i) == '0') {
        			sum[sumLength - i] = overFlow;
        			overFlow = '0';
        		} else {
        			if (overFlow == '1') {
        				sum[sumLength - i] = '0';
        			} else {
        				sum[sumLength - i] = '1';
					}
        		
				}
        	}
        }
        if (overFlow == '1') {
        	sum[0] = '1';
        	String string = new String(sum);
        	return string;
        } else {
        	String string = new String(sum, 1, sumLength - 1);
        	return string;
		}
    }
}
