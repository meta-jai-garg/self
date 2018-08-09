import java.util.List;

public interface Dictionary<K extends Comparable<K>, V> {
	void add(K key, V value);

	void delete(K key);

	V get(K key);

	List<BSTNode<K, V>> getSortedList();

	List<BSTNode<K, V>> getSortedList(K key1, K key2);
}
