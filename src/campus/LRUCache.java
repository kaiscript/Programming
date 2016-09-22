package campus;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * LRUCache ʱ�����ƣ�C/C++���� 1000MS���������� 3000MS �ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
 * ��Ŀ������ ΪLRU Cache���һ�����ݽṹ����֧������������
 * 
 * 1��get(key)�����key��cache�У��򷵻ض�Ӧ��valueֵ�����򷵻�-1��
 * 2��set(key,value):���key����cache�У��򽫸�
 * (key,value)����cache�У�ע�⣬���cache������������������δʹ�õ�Ԫ�ش�cache��ɾ��
 * �������key��cache�У�������value��ֵ�� 3��key,valueΪint�����ݡ� ���� ��һ��Ϊcapacity(capacity>0)��
 * ���������ÿ�����ݣ������������һ����key��value��key��value�Կո�ָ������������Ϊset���ݣ�һ��ֻ��һ��keyֵ������Ϊget���ݡ�
 * ��� ���ݸ�����capacity�Ͷ���������ݣ����ָ��keyֵ��Ӧvalueֵ�������keyֵ�����ڣ�����-1��
 * 
 * �������� 3 
 * 100 100 
 * 200 200 
 * 300 300 
 * 100 100 
 * 400 400 
 * 100 
 * 200 
 * 300 
 * 500 
 * ������� 
 * 100 
 * -1
 * 300 
 * -1
 *
 * @author Kaiscript
 *
 *         2016��9��19������8:10:04
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