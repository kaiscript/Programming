package Tree;
/**
 * 题目描述
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *@author Kaiscript
 *
 *2016年8月12日下午7:21:56
 */
public class VerifySquenceOfBST {
	
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence==null || sequence.length==0)
			return false;
        return isBST(sequence, 0, sequence.length-1);
    }
//	      对于后序遍历来说，序列数组的最后一个元素一定是根节点,
//    则根据这个元素，将前面的数组分为左、右两个部分，左侧部分都小，右侧部分都大，
//    如果右侧部分有比该根节点小的元素，那么就不是后序遍历,如此递归进行
	public boolean isBST(int[] sequence,int start,int end){
		if(start>=end)  //说明这一个栈帧是符合上述的情况也就是后续遍历的正确性
			return true;
		int curElement = sequence[end];   //根节点值z
		int spiltIndex;
		//从左边开始遍历，找到比curElement大和比curElement小的分界点，也就是分成左右子树的分界点。
		for(spiltIndex=start;spiltIndex<end && sequence[spiltIndex]<curElement;spiltIndex++); 
		//看右侧也就是右子树，因为左子树都比根节点curElement小，不用看了
		for(int i=spiltIndex+1;i<end;i++){
			if(sequence[i]<curElement) //右子树有比根节点小的值，说明这个序列不符合bst的后续遍历的特性
				return false;
		}
		
		//递归。再查看spitIndex左右两侧的状况。
		return isBST(sequence, start, spiltIndex) && isBST(sequence, spiltIndex+1, end-1);//end-1的-1是因为要去掉后序遍历最后一个也即是根节点
	}
	

}
