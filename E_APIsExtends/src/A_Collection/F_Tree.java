package A_Collection;

class Node {
	int value;
	Node left;
	Node right;

	Node(int value) {
		this.value = value;
		right = null;
		left = null;
	}
}

class BinaryTree {
	Node root;

	public void add(int value) {
		root = addRecursive(root, value);
	}

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			return current;
		}
		return current;
	}

	private boolean containsNodeRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}
		if (value == current.value) {
			return true;
		}
		return value < current.value ? containsNodeRecursive(current.left, value)
				: containsNodeRecursive(current.right, value);
	}

	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}

	private Node deleteRecursive(Node current, int value) {
		if (current == null) {
			return null;
		}

		if (value == current.value) {
			// Node to delete found
			// ... code to delete the node will go here
			if (current.right == null) {
				current = null;
				return current;
			}
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;
		}
		if (value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		current.right = deleteRecursive(current.right, value);
		return current;
	}

	public void delete(int value) {
		root = deleteRecursive(root, value);
	}

	private int findSmallestValue(Node root) {
		return (root.left == null) ? root.value : findSmallestValue(root.left);
	}

	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.value);
		}
	}
}

public class F_Tree {
	public static void main(String[] args) {
		BinaryTree bt = createBinaryTree();

		System.out.print("6 검색 : ");
		assertTrue(bt.containsNode(6));
		System.out.print("4 검색 : ");
		assertTrue(bt.containsNode(4));
		System.out.print("1 검색 : ");
		assertTrue(bt.containsNode(1));

		System.out.print("중위 순회 검색 : ");
		bt.traverseInOrder(bt.root);

		System.out.println();
		System.out.print("전위 순회 검색 : ");
		bt.traversePreOrder(bt.root);

		System.out.println();
		System.out.print("후위 순회 검색 : ");
		bt.traversePostOrder(bt.root);

		System.out.println();
		System.out.print("9 삭제 전 : ");
		assertTrue(bt.containsNode(9));
		bt.delete(9);
		System.out.print("9 삭제 후 : ");
		assertTrue(bt.containsNode(9));

		System.out.println();
		System.out.print("후위 순회 검색 : ");
		bt.traversePostOrder(bt.root);
	}

	private static void assertTrue(boolean containsNode) {
		if (containsNode) {
			System.out.println("있음");
		} else {
			System.out.println("없음");
		}
	}

	public static BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();

		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);

		return bt;
	}
}