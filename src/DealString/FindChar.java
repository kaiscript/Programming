package DealString;

import java.util.Scanner;

/**
 *@author Kaiscript
 *
 *2016年8月23日下午3:46:46
 */
public class FindChar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.next();
			char[] cs = str.toCharArray();
			int[] hashmap = new int[256];
			char ch = 0;
			for(int i=0;i<cs.length;i++){
				ch = cs[i];
				hashmap[ch] += 1;
			}
			
			for(int i=0;i<cs.length;i++){
				if(hashmap[cs[i]]==1){
					System.out.println(cs[i]);
					break;
				}
					
			}
		}
		
	}

}
