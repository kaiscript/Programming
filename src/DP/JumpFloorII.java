package DP;
/**
 * ��Ŀ����

һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 *@author Kaiscript
 *
 *2016��8��4������10:40:58
 */
public class JumpFloorII {
	
	public int JumpFloorII(int target) {
        if(target<=2){
            return target;
        }
        
        int[] dp = new int[target];
        dp[0] = 1;
        dp[1] = 2;
        
        for(int i=2;i<target;i++){
            int temp = 0;
            for(int j=i-1;j>=0;j--){
                temp +=dp[j];
            }
            dp[i] = temp+1;
        }
        return dp[target-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
