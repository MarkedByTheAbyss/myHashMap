package MyHashMap;
import java.util.LinkedList;
public class myHashMap<K, V> {
	
	private class Entry{
		Entry(){
			key = null;
			value = null;
		}
		Entry(K Key, V Value){
			key = Key;
			value = Value;
		}
		
		K key;
		V value;
	}
	
	public myHashMap(){
		maxLength = 10;
		loadedBuckets = 0;
		useFactor = 0.7;
		hashMap = new LinkedList[maxLength];
		for (int i = 0; i < maxLength; i++) {
			hashMap[i] = new LinkedList<Entry>();
		}
	}
	
	public void add(K Key, V Value) {
		Entry entry = new Entry(Key, Value);
		add(entry);
	}
	
	public void add(Entry entry) {
		LinkedList<Entry> currentList = hashMap[indexFor(entry.key.hashCode(), maxLength)];
		int flag = 1;
		if (currentList.size() > 0) {
			var e = currentList.iterator();
			while(e.hasNext()) {
				var currentEntry = e.next();
				if (currentEntry.key == entry.key) {
					flag = 0;
					currentEntry.value = entry.value;
					break;
				}
			}
		}
		
		if (currentList.size() == 0 || flag == 1) {
			loadedBuckets += flag;
			currentList.add(entry);
			if (loadedBuckets / maxLength >= useFactor) 
				resize();
		}
	}
	
	static int indexFor(int h, int length)
	{
	    return h & (length - 1);
	}
	
	public void resize() {
		var temp = hashMap;
		int tempSize = maxLength;
		maxLength *= 2; loadedBuckets = 0;
		hashMap = new LinkedList[maxLength];
		for (int i = 0; i < maxLength; i++) {
			hashMap[i] = new LinkedList<Entry>();
		}
		for (int i = 0; i < tempSize; i++) {
			var e = temp[i].iterator();
			while(e.hasNext()) {
				var entry = e.next();
				add(entry);
			}
		}
	}
	
	public void print() {
		System.out.println("maxLength: " + maxLength.toString());
		for (int i = 0; i < maxLength; i++) {
			var e = hashMap[i].iterator();
			while(e.hasNext()) {
				var entry = e.next();
				System.out.println(entry.key.toString() + ' ' + entry.value.toString());
			}
		}
	}
	
	
	private Integer maxLength;
	private double loadedBuckets;
	private double useFactor;
	private LinkedList<Entry>[] hashMap;
}
