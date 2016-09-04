package Array;

import java.util.ArrayList;

/**
 * 题目描述<br>
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 *@author Kaiscript
 *
 *2016年8月11日下午9:23:08
 */
public class PrintMatrix {
	
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = matrix.length;
		int m = matrix[0].length;
		if(n==0 || m==0)
			return list;
		int cir = (Math.min(n, m)-1)/2+1;
		for(int i= 0;i<cir;i++){
			for(int k=i;k<m-i;k++) list.add(matrix[i][k]);
			for(int j=i+1;j<n-i;j++) list.add(matrix[j][m-i-1]);
			for(int k=m-i-2;k>=i && n-i-1!=i;k--) list.add(matrix[n-i-1][k]);
			for(int j=n-i-2;j>i && m-i-1!=i;j--) list.add(matrix[j][i]);
		}
		return list;
	
	}
	
	//error
	public static ArrayList<Integer> printMatrix0(int [][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		if(matrix==null || matrix.length==0)
			return list;
		int left = 0;
		int right = matrix[0].length-1;
		int top = 0;
		int bottom = matrix.length-1;
		System.out.println(bottom);
		while(left<=right && top<=bottom){
			for(int i=left;i<=right;i++) list.add(matrix[top][i]);
			for(int i=top+1;i<=bottom;i++) list.add(matrix[i][right]);
			if(left!=right)
				for(int i=right-1;i>=left;i--)
					list.add(matrix[bottom][i]);
			if(top!=bottom)
				for(int i=bottom-1;i>top;i--)
					list.add(matrix[i][left]);
			
			left++;right--;top++;bottom--;
		}
		
		return list;
    }
	
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4}};
		printMatrix(a);
	}

}
