package Stack;
/**
 * һ��ջ����ѹ��1,2,3,4,5��ô��ջ����ջ�׷ֱ�Ϊ5,4,3,2,1�������ջת�ú󣬴�ջ����ջ��Ϊ1,2,3,4,5��
 * Ҳ����ʵ����ջ��Ԫ�ص����������һ���㷨ʵ������ջ�Ĳ���������ֻ���õݹ麯����ʵ�֣�����������������ݽṹ��
����һ��ջStack�Լ�ջ�Ĵ�Сtop���뷵��������ջ��
����������
[1,2,3,4,5],5
���أ�[5,4,3,2,1]
 *@author Kaiscript
 *
 *2016��9��12������3:25:18
 */
public class ReverseStack {
	
	int i = 0;
	
	//�ݹ齫Ԫ������
	//���ݹ鵽���һ��Ҳ����ջ�ĵ�һ��Ԫ��ʱ��indexӦ�����ʼ�ġ����Կ�������һ������������index
	public int[] reverseStackRecursively(int[] stack, int top) {
		if(top>0){
			int a = stack[top-1];
			i++;
			stack = reverseStackRecursively(stack, top-1);
			i--;
			stack[i] = a;
			
		}
		return stack;
    }
	
}
