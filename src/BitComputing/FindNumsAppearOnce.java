package BitComputing;

/**
 * 题目描述<br>
 *一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。<br>
 *题目强调了有两个数字出现了一次，而其他数字都出现了两次。
 *这可以联想到异或运算：一个数异或它本身都为0.而题目中要求找都那两个只出现一次的数字。
 *我们先考虑这个数组只存在一个出现一次的数字，如果我们从头到尾遍历异或，那么数组中其他的数字异或后的结果为0，再异或上这个出现1此的数字，结果就不为0了。
 *那么按照这种思路，我们可以把这个数组分解成2个数组。每个数组都包含一个出现一次的数字。
 *我们可以以第N位是不是1把数组分解成两个子数组，2个相同数字的第N位肯定是相同的。那么出现1次的2个数字肯定被分配到这两个子数组中,子数组中其他的数字都是出现两次的。
 *他们的第N位是0或1。
 *而我们刚才又知道如何求解数组中只出现一次的数字，那么问题的解法就出来了。
 *@author Kaiscript
 *
 *2016年9月8日下午10:11:51
 */
public class FindNumsAppearOnce {
	
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		
		int resultOR = 0;
		for(int i=0;i<array.length;i++)
			resultOR^=array[i];
		
		int indexBit = FindFirstOf1(resultOR); //找到第一个1的位置
		
		for(int i=0;i<array.length;i++){  
			if(isBit1(array[i], indexBit))  //第N位是1的放到一个数组
				num1[0]^= array[i];
			else							//第N位是0的放到一个数组
				num2[0]^= array[i];
		}
		
    }
	
	/**
	 * 第N位是不是1
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
		while((a & 1) ==0 && indexBit< 8*4){ //int 4个字节，一个字节8位
			a = a>>1;//右移操作，并while，找到出现第一个1的位置
			indexBit++;
		}
		return indexBit;
	}
	
}
