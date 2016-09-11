package BitComputing;

/**
 * ��Ŀ����<br>
 *һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�<br>
 *��Ŀǿ�������������ֳ�����һ�Σ����������ֶ����������Ρ�
 *��������뵽������㣺һ�������������Ϊ0.����Ŀ��Ҫ���Ҷ�������ֻ����һ�ε����֡�
 *�����ȿ����������ֻ����һ������һ�ε����֣�������Ǵ�ͷ��β���������ô��������������������Ľ��Ϊ0����������������1�˵����֣�����Ͳ�Ϊ0�ˡ�
 *��ô��������˼·�����ǿ��԰��������ֽ��2�����顣ÿ�����鶼����һ������һ�ε����֡�
 *���ǿ����Ե�Nλ�ǲ���1������ֽ�����������飬2����ͬ���ֵĵ�Nλ�϶�����ͬ�ġ���ô����1�ε�2�����ֿ϶������䵽��������������,�����������������ֶ��ǳ������εġ�
 *���ǵĵ�Nλ��0��1��
 *�����Ǹղ���֪��������������ֻ����һ�ε����֣���ô����Ľⷨ�ͳ����ˡ�
 *@author Kaiscript
 *
 *2016��9��8������10:11:51
 */
public class FindNumsAppearOnce {
	
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		
		int resultOR = 0;
		for(int i=0;i<array.length;i++)
			resultOR^=array[i];
		
		int indexBit = FindFirstOf1(resultOR); //�ҵ���һ��1��λ��
		
		for(int i=0;i<array.length;i++){  
			if(isBit1(array[i], indexBit))  //��Nλ��1�ķŵ�һ������
				num1[0]^= array[i];
			else							//��Nλ��0�ķŵ�һ������
				num2[0]^= array[i];
		}
		
    }
	
	/**
	 * ��Nλ�ǲ���1
	 * @param num
	 * @param indexBit
	 * @return
	 */
	public boolean isBit1(int num,int indexBit){
		num = num>>indexBit;
		return (num & 1)==1;
	}
	
	public int FindFirstOf1(int a){
		int indexBit = 0;
		while((a & 1) ==0 && indexBit< 8*4){ //int 4���ֽڣ�һ���ֽ�8λ
			a = a>>1;//���Ʋ�������while���ҵ����ֵ�һ��1��λ��
			indexBit++;
		}
		return indexBit;
	}
	
}
