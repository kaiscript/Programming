package Tree;
/**
 * ��Ŀ����
����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
 *@author Kaiscript
 *
 *2016��8��12������7:21:56
 */
public class VerifySquenceOfBST {
	
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence==null || sequence.length==0)
			return false;
        return isBST(sequence, 0, sequence.length-1);
    }
//	      ���ں��������˵��������������һ��Ԫ��һ���Ǹ��ڵ�,
//    ��������Ԫ�أ���ǰ��������Ϊ�����������֣���ಿ�ֶ�С���Ҳಿ�ֶ���
//    ����Ҳಿ���бȸø��ڵ�С��Ԫ�أ���ô�Ͳ��Ǻ������,��˵ݹ����
	public boolean isBST(int[] sequence,int start,int end){
		if(start>=end)  //˵����һ��ջ֡�Ƿ������������Ҳ���Ǻ�����������ȷ��
			return true;
		int curElement = sequence[end];   //���ڵ�ֵz
		int spiltIndex;
		//����߿�ʼ�������ҵ���curElement��ͱ�curElementС�ķֽ�㣬Ҳ���Ƿֳ����������ķֽ�㡣
		for(spiltIndex=start;spiltIndex<end && sequence[spiltIndex]<curElement;spiltIndex++); 
		//���Ҳ�Ҳ��������������Ϊ���������ȸ��ڵ�curElementС�����ÿ���
		for(int i=spiltIndex+1;i<end;i++){
			if(sequence[i]<curElement) //�������бȸ��ڵ�С��ֵ��˵��������в�����bst�ĺ�������������
				return false;
		}
		
		//�ݹ顣�ٲ鿴spitIndex���������״����
		return isBST(sequence, start, spiltIndex) && isBST(sequence, spiltIndex+1, end-1);//end-1��-1����ΪҪȥ������������һ��Ҳ���Ǹ��ڵ�
	}
	

}
