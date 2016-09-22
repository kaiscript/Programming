package campus;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * LRUCache 时间限制：C/C++语言 1000MS；其他语言 3000MS 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述： 为LRU Cache设计一个数据结构，它支持两个操作：
 * 
 * 1）get(key)：如果key在cache中，则返回对应的value值，否则返回-1。
 * 2）set(key,value):如果key不在cache中，则将该
 * (key,value)插入cache中（注意，如果cache已满，则必须把最近最久未使用的元素从cache中删除
 * ）；如果key在cache中，则重置value的值。 3）key,value为int型数据。 输入 第一行为capacity(capacity>0)，
 * 后面输入的每行数据，有两种情况，一种有key和value（key，value以空格分隔），这种情况为set数据，一种只有一个key值，这种为get数据。
 * 输出 根据给定的capacity和多组测试数据，输出指定key值对应value值，如果该key值不存在，返回-1。
 * 
 * 样例输入 3 
 * 100 100 
 * 200 200 
 * 300 300 
 * 100 100 
 * 400 400 
 * 100 
 * 200 
 * 300 
 * 500 
 * 样例输出 
 * 100 
 * -1
 * 300 
 * -1
 *
 * @author Kaiscript
 *
 *         2016年9月19日下午8:10:04
 */
public class LRUCache {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int capacity = sc.nextInt();
		LruCache cache = new LruCache(capacity);
		String str1 = sc.nextLine();
		// System.err.println(str1);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			// System.out.println(str);
			String[] ss = str.split(" ");

			if (ss.length == 2) {
				cache.put(Integer.valueOf(ss[0]), Integer.valueOf(ss[1]));

			} else if (ss.length == 1) {
				int i = Integer.valueOf(ss[0]);
				if (cache.get(i) != null) {
					System.out.println(cache.get(i));
				} else
					System.out.println("-1");
			}
		}

	}

	public static class LruCache<K, V> {
		private LinkedHashMap<K, V> map;

		private final int capacity;

		public LruCache(int c) {
			this.capacity = c;
			map = new LinkedHashMap(capacity, (float) 0.75, true) {
				@Override
				protected boolean removeEldestEntry(Map.Entry eldest) {
					return size() > capacity;
				}
			};
		}

		public V get(K k) {
			return map.get(k);
		}

		public void put(K k, V v) {
			map.put(k, v);
		}


	}

}

/*
 * class Cache{
 * 
 * public int capacity;
 * 
 * public Queue queue;
 * 
 * public Set<Integer> set;
 * 
 * public Cache(int capacity){ this.capacity = capacity; queue = new
 * ArrayBlockingQueue(capacity); set = new HashSet<>(capacity); }
 * 
 * public void add(int i){ queue.add(i); }
 * 
 * public void get(){ }
 * 
 * }
 */