package Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *@author Kaiscript
 *
 *2016年9月19日下午3:33:23
 */
public class Duplicate {
	
	// Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers==null || numbers.length==0){
    		duplication[0] = -1;
    		return false;
    	}
    	
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int i:numbers){
    		if(map.get(i)==null)
    			map.put(i, 1);
    		else
    			map.put(i, map.get(i)+1);
    	}
    	Iterator<Integer> iter = map.keySet().iterator();
    	int j = 0;
    	while(iter.hasNext()){
    		int num = iter.next();
    		Integer count = map.get(num);
    		if(count>=2){
    			duplication[0] = num;
    			return true;
    		}
    		iter.remove();
    	}
    	duplication[0] = -1;
    	return false;
    }
	
    
    public static void main(String[] args){
    	Duplicate d = new Duplicate();
    	int[] numbers = {2,1,3,1,4};
    	d.duplicate(numbers, numbers.length, new int[1]);
    }
    
}
