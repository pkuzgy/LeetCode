package code201705;
/*
 * ����ͨ��ÿλ�Ƿ�Ϊ9�жϣ����������λһλλ�ļ�
 */
public class PlusOne066 {
    public int[] plusOne(int[] digits) {
        int overFlow = 1;
        int old = 0;
        for (int i = digits.length - 1; i >= 0; i --) {
        	old = digits[i];
        	digits[i] = (digits[i] + overFlow) % 10;
        	overFlow = (old + overFlow) / 10;
        }
        if (overFlow == 0) return digits;
        else {
        	int[] newInt = new int[digits.length + 1];
        	newInt[0] = 1;
        	return newInt;
        }
    }
}
