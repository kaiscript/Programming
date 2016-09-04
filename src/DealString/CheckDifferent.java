package DealString;

import java.util.HashMap;
import java.util.Map;

/**
 *@author Kaiscript
 *
 *2016年8月6日下午11:07:31
 */
public class CheckDifferent {
	
	 public static boolean checkDifferent(String str) {
		 char[] strs = str.toCharArray();
		 Map<String,String> map = new HashMap<>();
		 for(int i=0;i<str.length();i++){
			 if(map.get(str.substring(i, i+1))==null)
				 map.put(str.substring(i, i+1), "0");
			 else
				 return false;
		 }
		 return true;
	 }
	
	public static boolean checkDifferent0(String str){
		boolean[] charset = new boolean[65535];
		for(int i=0;i<str.length();i++){
			int ivalue = str.charAt(i);
			if(charset[ivalue])
				return false;
			charset[ivalue] = true;
		}
		return true;
	}
	 
	public static void main(String[] args) {
		System.out.println(checkDifferent0("qeer"));
	}

}
