package lab9_1;

public class MyLinkedTree {
	private Node root=null;
	public MyLinkedTree() {
		root=null;
	}
	class Node{
		int data;
		Node leftChild;
		Node rightChild;
		Node () {
			
		}
		Node (int i) {
			this.data=i;
			this.leftChild=null;
			this.rightChild=null;
		}
	}
	public MyLinkedTree(int data, MyLinkedTree leftSubtree, MyLinkedTree rightSubtree)  {
		root = new Node();           
		root.data = data;

		if (leftSubtree == null)   
			root.leftChild = null;           
		else   
			root.leftChild = leftSubtree.root;

		if (rightSubtree == null)   
			root.rightChild = null;           
		else  
			root.rightChild = rightSubtree.root;
	}
	public boolean isEmpty() {
		return root==null;
	}
	public void addLeft(int data) {

		Node n=new Node(data);
		if (this.isEmpty()) root=n;
		else {

		}
	}
	private void preorder(Node n) {
		if (n!=null) {
			System.out.print(n.data+" ");
			preorder(n.leftChild);
			preorder(n.rightChild);
		}
	}

	public void printPreorder() {
		this.preorder(root);
		System.out.println();
	}
	private void inorder(Node n) {
		if (n!=null) {
			inorder(n.leftChild);
			System.out.print(n.data+" ");
			inorder(n.rightChild);
		}
	}
	public void printInorder() {
		this.inorder(root);
		System.out.println();
	}
	private void postorder(Node n) {
		if (n!=null) {
			postorder(n.leftChild);
			postorder(n.rightChild);
			System.out.print(n.data);
		}
	}
	public void printLeft() {
		Node n=root;
		while(!(n==null)) {
			System.out.print(n.data+ " ");
			n=n.leftChild;
		}
		System.out.println();
	}
}
