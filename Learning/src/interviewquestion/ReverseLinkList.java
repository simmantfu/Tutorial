package interviewquestion;

public class ReverseLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Link<Integer> link = new Link<Integer>();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(5);
		link.add(6);

		link.print();

		link.delete(3);

		link.print();
	}

}

// LIFO BASED LINKD LIST
class Link<T> {

	Node<T> start;

	public void add(T data) {
		Node<T> node = new Node<T>(data, null);

		if (this.start == null) {
			start = node;
		} else {
			node.next = start;
			start = node;
		}
	}

	public void print() {
		Node<T> temp = start;

		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public void printRev() {
		printRev(start);
	}

	private void printRev(Node<T> node) {

		if (node.next != null)
			printRev(node.next);

		System.out.println(node.data);

	}

	public void delete(int k) {

		Node<T> temp = start;

		for (int i = 1; i < k - 1; i++) {
			temp = temp.next;
		}

		Node<T> tmp2 = temp.next;
		temp.next = tmp2.next;

	}

	private class Node<T> {
		T data;
		Node<T> next;

		Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

	}
}