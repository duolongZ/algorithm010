import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author:huangzhen
 * @createTime:2020/8/2 23:01
 * @description:LRU缓存机制
 */
public class LRUCache extends LinkedHashMap<Integer,Integer> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75F,true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        super.put(key,value);
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
        return size() > capacity;
    }

}
