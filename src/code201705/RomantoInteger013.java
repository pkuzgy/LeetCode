package code201705;
/*
 * 用switch像是更快，现将每一位代表的数字存入数组，再遍历int数组
 */
import java.util.HashMap;

public class RomantoInteger013 {
    public int romanToInt(String s) {
       HashMap<Character, Integer>letterIndex = new HashMap<Character, Integer>();
       letterIndex.put('M', 1);
       letterIndex.put('D', 2);
       letterIndex.put('C', 3);
       letterIndex.put('L', 4);
       letterIndex.put('X', 5);
       letterIndex.put('V', 6);
       letterIndex.put('I', 7);
       
       HashMap<Character, Integer>letterInt = new HashMap<Character, Integer>();
       letterInt.put('M', 1000);
       letterInt.put('D', 500);
       letterInt.put('C', 100);
       letterInt.put('L', 50);
       letterInt.put('X', 10);
       letterInt.put('V', 5);
       letterInt.put('I', 1);
       
       int result = 0;
       for (int i = 0; i < s.length() - 1; i ++) {
    	   if (letterIndex.get(s.charAt(i)) <= letterIndex.get(s.charAt(i + 1))) {
    		   result += letterInt.get(s.charAt(i));
    	   } else {
    		   result -= letterInt.get(s.charAt(i));
    	   }
       }
       result += letterInt.get(s.charAt(s.length() - 1));
       return result;
    }
}
