package String;
/**
 *@author Kaiscript
 *
 *2016��9��12������7:05:20
 */
public class Translation {
	
	public String stringTranslation(String A, int n, int len) {
		String str = A.substring(0,len);
		String res = A.substring(len)+str;
		return res;
    }
	
}
