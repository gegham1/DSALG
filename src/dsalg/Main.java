package dsalg;
import bst.BinarySearchTree;
import bst.Node;

public class Main {
 	public static void main(String[] args) {
 		BinarySearchTree bst = new BinarySearchTree();
 		bst.add(8);
 		bst.add(4);
 		bst.add(1);
 		bst.add(50);
 		bst.add(2);
 		bst.add(14);
 		bst.add(10);
 		bst.add(5);
 		
 		Node n = bst.search(14);
	}
}
