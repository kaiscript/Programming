package Number;
/**
 * ��Ŀ����

��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
 *<br>
 *˼·����ʽ����������+ĩ�*����/2
 *���ǲ������ó˳��������Ա����õݹ���ߵ���������n����0����������ڲ�����if��
 *�����ö�·����
 *@author Kaiscript
 *
 *2016��9��17������4:48:35
 */
public class Sum_Solution{
	
	public int Sum_Solution(int n) {
		int sum = n;
		boolean bol = (n!=0) && ((sum+=Sum_Solution(n-1))>0);//��·���ԾͿ������õݹ顣
		return sum;
    }
	
}
