import java.util.Iterator;

public class CustomArrayList<V> implements Iterable<V> {

	private static final int INIT_CAPACITY = 10;
	Object[] objects;
	private int pointer = 0;

	public CustomArrayList() {
		// TODO Auto-generated constructor stub
		init(INIT_CAPACITY);
	}

	public CustomArrayList(int capacity) {
		init(capacity);
	}

	private void init(int capacity) {
		objects = new Object[capacity];
	}

	public void add(Object obj) {
		if (pointer <= objects.length - 1) {
			objects[pointer] = obj;
			pointer++;
		}
	}

	public V get(int index) {
		if (objects[index] == null || objects == null) {
			return null;
		} else {
			V data = (V) objects[index];

			return data;
		}
	}

	public void remove(int index) {
		if (objects[index] != null || objects != null) {
			objects[index] = null;
		} else {
			System.out.println("Not a valid");
		}
	}

	public void set(int index, Object data) {
		if (objects[index] != null || objects != null) {
			objects[index] = data;
		} else {
			System.out.println("Not a valid");
		}
	}

	public static void main(String... strings) {
		CustomArrayList<Integer> arrayList = new CustomArrayList<>(15);
		for (int i = 0; i < 15; i++) {
			arrayList.add(i);
		}

		for (int i = 0; i < 15; i++) {
			System.out.println(arrayList.get(i));
		}

		arrayList.remove(10);

		for (int i = 0; i < 15; i++) {
			System.out.println(arrayList.get(i));
		}

		arrayList.set(0, 10);

		for (int i = 0; i < 15; i++) {
			System.out.println(arrayList.get(i));
		}
	}

	@Override
	public Iterator<V> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
