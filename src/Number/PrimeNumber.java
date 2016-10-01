package Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ��ӡN���ڵ�����������
 * <br>
 *@author Kaiscript
 *
 *2016��9��24������4:07:22
 */
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrimeNumber p = new PrimeNumber();
		long start = System.currentTimeMillis();
		p.printPrime0(n);
		System.out.println((System.currentTimeMillis()-start)+"ms");
		start = System.currentTimeMillis();
		p.printPrime(n);
		System.out.println((System.currentTimeMillis()-start)+"ms");
		p.printPrimeMulti(n);
	}
	
	/**
	 * ֻҪ����С�ڡ�x ����������
	 * @param n
	 */
	public void printPrime0(int n){
		List<Integer> list = new ArrayList<>();
		list.add(2);
		System.out.print(2+" ");
		boolean flag = true;
		for(int i=2;i<n;i++){
			for(int j:list){
				if(i%j!=0){
					flag = true;
					continue;
				}
				else{
					flag = false;
					break;
				} 
			}
			if(flag){
				System.out.print(i+" ");
				list.add(i);
			}
		}
	}

	/**
	 * ɸѡ����ɸ��2�ı�����3�ı�����5�ı�����7�ı���
	 * ��ʱ�任�ռ�
	 */
	public void printPrime(int n){
		boolean[] numbers = new boolean[n+1];
		for(int i=0;i<numbers.length;i++)
			numbers[i] = true;
		int[] basePrime = new int[4];
		basePrime[0] = 2; numbers[2] = true;numbers[1] = false;
		basePrime[1] = 3; numbers[3] = true;
		basePrime[2] = 5; numbers[5] = true;
		basePrime[3] = 7; numbers[7] = true;
		for(int i:basePrime){
			int bei = 2;
			int multi = bei*i;
			while(multi<=n){
				numbers[multi] = false;
				bei++;
				multi = bei*i;
			}
			
		}
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]){}
				System.out.print(i+" ");
		}
	}
	
	
	public void printPrimeMulti(int n){
		List<Integer> list = new ArrayList<>();
		list.add(2);
		boolean flag = true;
		for(int i=2;i<n;i++){
			for(int j:list){
				if(i%j!=0){
					flag = true;
					continue;
				}
				else{
					flag = false;
					break;
				} 
			}
			if(flag)
				list.add(i);
			
		}
		String str=n+"=";
		for(int i=0;i<list.size();i++){
			while(n%list.get(i)==0){
				str=str+list.get(i)+"*";
				n/=list.get(i);
			}
		}
		str = str.substring(0,str.length()-1);
		System.out.println(str);
	}
	
}
