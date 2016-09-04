package DealString;

/**
 * [编程题]字符流中第一个不重复的字符<br>
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
 * 第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。 输出描述:
 * 
 * 如果当前字符流没有存在出现一次的字符，返回#字符。
 *
 * @author Kaiscript
 *
 *         2016年8月22日上午10:53:11
 */
public class FirstAppearingOnce {
	
	public int[] str = new int[256];
	public StringBuffer buffer = new StringBuffer();
	
	// Insert one char from stringstream
	public void Insert(char ch) {
		buffer.append(ch);
		str[ch] += 1;
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		char[] strs = buffer.toString().toCharArray();
		
		for(char c:strs){
			if(str[c]==1)
				return c;
		}
		
		return '#';	
	}

	public static void main(String[] args) {
		
		int[] c = new int[256];
		char t = 'l';
		c[t] = 1;
		for(int i=0;i<c.length;i++){
			if(c[i]==1)
				System.out.println(i);
		}
			
	}

}
