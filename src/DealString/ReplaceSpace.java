package DealString;
/**
 *@author kaiscript
 *
 *2016年3月23日下午11:12:33
 */
public class ReplaceSpace {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("we are happy");
		System.out.println(replaceSpace(str));
	}
	
	public static String replaceSpace(StringBuffer str) {
		int index;
		while((index=str.indexOf(" "))!=-1){
			str.replace(index, index+1, "%20");
		}
		
    	return str.toString();
    }
	
}
