package gr.codehub.generics;


public class MyPair<K, V>  implements Pair<K, V> {

    private K key;
    private V value;
    
    
    public MyPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
    
}
