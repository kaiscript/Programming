package Array;
/**
 *@author kaiscript
 *
 *2016年3月19日下午9:03:44
 */
/*题目描述

在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。 
输入描述:
array： 待查找的二维数组
target：查找的数字


输出描述:
查找到返回true，查找不到返回false*/
public class Find {

	public static void main(String[] args) {
		int[][] array = {{},{}};
		System.out.println(array.length);
		System.out.println(array[0].length);
	}
	//左下角开始，遇大右移，遇小上移，直到超过边界都没找到，得false。否则得true。
	public boolean Find(int [][] array,int target) {
		int len = array.length-1;
        int i = 0;
        while((len >= 0)&& (i < array[0].length)){
            if(array[len][i] > target){ //遇到下的上移
                len--;
            }else if(array[len][i] < target){  //遇到大的右移
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
	
}
