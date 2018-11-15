package lab9_1;

public class MyArrayTree {
	private int[] treeArray; // Ʈ���� ������ �迭
	private int number;   // Ʈ���� ���� ��

	// ���� Ʈ���� �ʱ�ȭ �ϴ� ������
	public MyArrayTree() {
		number = 0;
		treeArray = new int[100];
	}

	// �Ű������� ���� �迭�� Ʈ���� �ʱ�ȭ�ϴ� ������
	public MyArrayTree(int[] array) {
		number = array.length;
		treeArray = new int[number];
		for(int i = 0; i < number; i++) {
			treeArray[i] = array[i];
		}
	}

	// Ʈ�� ��ü�� ���� ��ȸ�ϸ� ����� �����͸� ���
	public void printPreorder() {
		preorder(0);
		System.out.println();
	}

	// �ε��� index�� ��带 ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϴ� �޼ҵ�
	private void preorder(int index) {
		if(index<treeArray.length&&number>0) {
			System.out.print(treeArray[index]+" ");
			preorder(2*index+1);
			preorder(2*index+2);
		}

	}

	// Ʈ�� ��ü�� ���� ��ȸ�ϸ� ����� �����͸� ���
	public void printInorder() {
		inorder(0);
		System.out.println();
	}

	// �ε��� index�� ��带 ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϴ� �޼ҵ�
	private void inorder(int index) {
		if(index<treeArray.length&&number>0) {
			inorder(2*index+1);
			System.out.print(treeArray[index]+" ");
			inorder(2*index+2);
		}

	}

	// ��Ʈ������ ������忡 �̸������ ���� �ڽĵ��� ����ϴ� �޼ҵ�(��� �޼ҵ� �ƴ�. �ݺ��� �̿��� ��)
	public void printLeft() {
		int index=0;
		while(index<treeArray.length&&number>0) {
			System.out.print(treeArray[index]+" ");
			index=index*2+1;
		}
		System.out.println();
	}
}