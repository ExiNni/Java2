package com.kh.treeMain;

/*
	��带 �����ϰ� ���ư��� ����ϴ� ����Ʈ��
	���� ��ȸ : root (�Ѹ�)�� ���� ���� �湮
	���� ��ȸ : ���� ���� Ʈ���� �湮 �� root (�Ѹ�)�� �湮
	���� ��ȸ : ���� Ʈ�� ��� �湮 �� root (�Ѹ�)�� �湮
	���� ��ȸ : �� �� node�� ���� �Ʒ� �������� ���ʴ�� �湮
*/
public class BinaryTree {
	TreeNode root;

	public BinaryTree() {
		this.root = null;
	}

	/*
		insert �޼���� insertRec �޼���� ���� Ʈ���� ���ο� ��带 �����ϴµ� ���
		insert : �ܺο� ����Ǵ� �޼���
	*/
	public void insert(int data) {
		root = insertRec(root, data);
	}
	// insertRec ���� ���� �۾� �޼���
	// ����� : �ڱ� �ڽ��� �����ϰ� �ٽ� �ڱ� �ڽ��� ����ؼ� ���ǳ���
	// ��������� ��带 �����ϰ� �������� ��ġ�� ã�� ���ο� ��带 ����
	private TreeNode insertRec(TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
			return root;
		}

		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	/*
		inOrderT : ���� ��ȸ
		inOrderTR : ���� ��ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴµ� ���
		���� ����Ʈ�� ���� ��� ������ ����Ʈ�� ������ ��� ���
	*/
	public void inOrderT() { // inOrder Traversal ���� ��ȸ
		inOrderTR(root);
	}
	
	private void inOrderTR(TreeNode root) {
		if(root != null) {
			inOrderTR(root.left);
			System.out.print("root.left : " + root.data + " ");
			System.out.println();
			inOrderTR(root.right);
			System.out.print("root.right : " + root.data + " ");
			System.out.println();

		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		tree.insert(100);
		tree.insert(200);
		tree.insert(33);
		tree.insert(22);
		tree.insert(11);


		System.out.println("���� Ʈ���� ���� ��ȸ ��� : ");
		tree.inOrderT();
	}

}