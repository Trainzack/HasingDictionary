package xyz.alexfargo.Hashing.Dictionary;

import java.util.Iterator;

public class Dictionary<K extends Comparable<K>, V> implements IDictionary<K, V> {

	@Override
	public V add (K key, V value) {
		return null;
	}

	@Override
	public V remove (K key) {
		return null;
	}

	@Override
	public V getValue (K key) {
		return null;
	}

	@Override
	public boolean contains (K key) {
		return false;
	}

	@Override
	public Iterator<K> getKeyIterator () {
		return null;
	}

	@Override
	public Iterator<V> getValueIterator () {
		return null;
	}

	@Override
	public boolean isEmpty () {
		return false;
	}

	@Override
	public int getSize () {
		return 0;
	}

	@Override
	public void clear () {

	}

	private void rehash() {

	}
}
