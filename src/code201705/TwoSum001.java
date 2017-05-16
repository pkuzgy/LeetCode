package code201705;
/*
 * HashMap get(),put()的时间复杂度为O(1)，
 * HashMap采用数组加链表的方式存储键值对
 * 先将值和下标存入HashMap
 * 再根据containsKey来遍历
 */
public class TwoSum001 {
    public int[] twoSum(int[] nums, int target) {
    	boolean flag = false;
    	int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i + 1; j < nums.length; j++) {
        		if (nums[i] + nums[j] == target) {
        			flag = true;
        			result[0] = i;
        			result[1] = j;
        			break;
        		}
        	}
        	if (flag == true) break;
        }
        
        return result;
        
    }
    
    

}