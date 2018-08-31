package chapter_17_9_散列与散列码.为速度而散列;

import java.util.*;

import chapter_17_9_散列与散列码.理解hashCode.MapEntry;
import net.mindview.util.Countries;

/**
 * 利用散列的原理，实现一个简单的散列Map
 * <br>类名：SimpleHashMap<br>
 * 作者： mht<br>
 * 日期： 2018年4月22日-下午7:56:18<br>
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    
    static final int SIZE = 997;
    
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
    
    public V put(K key, V value) {
        V oldValue = null;
        // 首先计算散列码，并算出下标，算法不一定非要用这一样
        int index = Math.abs(key.hashCode()) % SIZE;
        // 判断此位置上是否已经存在了一个LinkedList<MapEntry<K, V>>
        if (buckets[index] == null) {
            // 如果没有，则新建一个LinkedList
            buckets[index] = new LinkedList<MapEntry<K, V>>();
        }
        // 用下标取得数组中对应的LinkedList
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        // 将key和value放入MapEntry结构体中得到pair
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        // 标记
        boolean found = false;
        // 因为bucket是一个LinkedList，因此，创建一个list迭代器，并通过它来线性查找bucket中的元素
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            // 取得
            MapEntry<K, V> iPair = it.next();
            // equals比较键
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair); // replace old with new
                found = true;
                break;
            }
        }
        if(!found)
            buckets[index].add(pair);
        return oldValue;
    }
    
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null) return null;
        for (MapEntry<K, V> iPair : buckets[index])
            if (iPair.getKey().equals(key))
                return iPair.getValue();
        return null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) {
                continue;
            }
            for (MapEntry<K, V> mpair : bucket)
                set.add(mpair);
        }
        return set;
    }
    
    public static void main(String[] args) {
//        SimpleHashMap<String, String> m = new SimpleHashMap<>();
//        m.putAll(Countries.capitals(25));
//        System.out.println(m);
//        System.out.println(m.get("ERITREA"));
//        System.out.println(m.entrySet());
        MapEntry s = new MapEntry<>("firstKey", "Nihao");
        int d = Math.abs(s.hashCode());
        System.out.println(d);
        System.out.println(d % 997);
        
    }
    
}
