package bst;

public class BinarySearchTree {
	private Node root;
	
	private Node addRecursively(Node currentNode, int value) {
		if(currentNode == null) {
			return new Node(value);
		} else if(currentNode.value > value) {
			currentNode.left = addRecursively(currentNode.left, value);
		} else if(currentNode.value < value) {
			currentNode.right = addRecursively(currentNode.right, value);
		}
		return currentNode;
	}
	
	private Node searchRecursively(Node currentNode, int value) {
		if(currentNode.value > value) {
			return searchRecursively(currentNode.left, value);
		} else if(currentNode.value < value) {
			return searchRecursively(currentNode.right, value);
		}
		return currentNode;
	}
	
	public void add(int value) {
		root = addRecursively(root, value);
	}
	
	public Node search(int value) {
		return searchRecursively(root, value);
	}
}
