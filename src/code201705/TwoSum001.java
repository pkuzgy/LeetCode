package code201705;
/*
 * HashMap get(),put()��ʱ�临�Ӷ�ΪO(1)��
 * HashMap�������������ķ�ʽ�洢��ֵ��
 * �Ƚ�ֵ���±����HashMap
 * �ٸ���containsKey������
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