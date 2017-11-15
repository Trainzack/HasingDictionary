package xyz.alexfargo.Hashing.Dictionary;

public class Node<K, V> {
	public K key;
	public V val;
	public boolean flag;

	public Node() {
		key = null;
		val = null;
		flag = false;
	}
}
