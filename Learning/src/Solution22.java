import java.util.Scanner;

public class Solution22 {

	public static void main(String... strings) {

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		CustomList<Integer> customList = new CustomList<Integer>(i);

		String s ="";
		sc.nextLine();
		s = sc.nextLine();

		String[] num = s.split(" ");

		for (String n : num) {
			customList.add(Integer.parseInt(n));
		}
		
		int j = sc.nextInt();

		for (int j1 = 1; j1 <= j; j1++) {
			String t1 = sc.next();
			sc.nextLine();
			String t2 = sc.nextLine();
			if (t1.equals("Insert")) {
				String[] t3 = t2.split(" ");
				customList.set(Integer.parseInt(t3[0]), Integer.parseInt(t3[1]));
			}

			if (t1.equals("Delete")) {
				String[] t3 = t2.split(" ");
				customList.delete(Integer.parseInt(t3[0]));
			}

		}

		String str = "";
		for (int i1 = 0; i1 < i; i1++) {
			str = str + " " + customList.get(i1);
		}

		System.out.println(str.substring(1, str.length()-1));
	}

}

class CustomList<T> {

	private final int initialSize = 5;

	private int counter = -1;

	Object[] objArray;

	public CustomList() {

		init(initialSize);
	}

	public CustomList(int size) {
		init(size);
	}

	private void init(int size) {
		objArray = new Object[size];
	}

	public void add(T value) {
		if (counter < objArray.length) {
			counter++;
			objArray[counter] = value;
		}
	}

	public void delete(int index) {
		if (index < objArray.length) {
			objArray[index] = null;
		}
	}

	public T get(int index) {
		T value = null;

		if (index < objArray.length)
			value = (T) objArray[index];

		return value;
	}

	public void set(int index, T value) {
		if (index < objArray.length) {
			objArray[index] = value;
		}
	}

}
