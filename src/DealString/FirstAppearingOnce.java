package DealString;

/**
 * [�����]�ַ����е�һ�����ظ����ַ�<br>
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
 * ��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"�� �������:
 * 
 * �����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
 *
 * @author Kaiscript
 *
 *         2016��8��22������10:53:11
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
