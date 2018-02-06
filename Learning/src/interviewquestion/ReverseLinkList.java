package interviewquestion;

public class ReverseLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Link<Integer> link = new Link<Integer>();
		link.add(1);
		link.add(2);
		link.add(3);

		link.printRev();
	}

}

// LIFO BASED LINKD LIST
class Link<T> {

	Node<T> start;

	public void add(T data) {
		Node<T> node = new Node(data, null);

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

	private class Node<T> {
		T data;
		Node<T> next;

		Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

	}
}