package chapter_17_9_散列与散列码.理解hashCode;

import java.util.*;
import net.mindview.util.*;

/**
 * 这是一个用ArrayList来实现的Map <br>
 * 类名：SlowMap<br>
 * 作者： mht<br>
 * 日期： 2018年4月22日-下午5:03:33<br>
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    public V put(K key, V value) {
        V oldValue = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keys.indexOf(key), value);
        }
        return oldValue;
    }

    public V get(Object key) {
        if (!keys.contains(key))
            return null;
        return values.get(keys.indexOf(key));
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext()) {
            set.add(new MapEntry<K, V>(ki.next(), vi.next()));
        }

        return set;
    }

    public static void main(String[] args) {
        SlowMap<String, String> m = new SlowMap<>();
        m.putAll(Countries.capitals(15));
        System.out.println(m);
        System.out.println(m.get("BULGARIA"));
        System.out.println(m.entrySet());
    }
}
