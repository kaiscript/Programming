package DP;
/**
 * ��Ŀ����

���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 *@author Kaiscript
 *
 *2016��8��4������11:09:00
 */
public class RectCover {
	
	 public int RectCover(int target) {
			if(target==0)
	            return 0;
	        if(target==1)
	            return 1;
	        int[] d = new int[target];
	        d[0] = 1;
	        d[1] = 2;
	        
	        for(int i=2;i<target;i++){
	            d[i] = d[i-1]+d[i-2];
	        }
	        return d[target-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
