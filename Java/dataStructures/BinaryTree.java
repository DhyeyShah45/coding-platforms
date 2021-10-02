// did my own way
// refer gfg binary search tree insertion fro Geeks for Geeks

package dataStructures;

public class BinaryTree {
    
	// parent root
	static TreeNode root;    
    
    public TreeNode insert(int data, TreeNode root) {
        // if parent root == null i.e the tree doesn't exist as of now
    	// so we make the new node as parent node
    	if(root==null){
            root = new TreeNode(data);
            return root;
        }
    	
    	// if the data is less than the node.data goto left sub-tree else right sub-tree
        if(data<root.data)
            root.left = insert(data,root.left);
        else
            root.right = insert(data,root.right);    
        return root;
    }
    
	public void inOrder(TreeNode root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public void preOrder(TreeNode root) {
		if(root==null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder(TreeNode root) {
		if(root==null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        // you have to store the returned root value into some root otherwise it won't get stored.
        // you can also create function 
        root = bt.insert(20,root);
        root = bt.insert(18,root);
        root = bt.insert(24,root);
        root = bt.insert(12,root);
        root = bt.insert(19,root);
        root = bt.insert(22,root);
        root = bt.insert(27,root);
        root = bt.insert(6,root);
        root = bt.insert(15,root);
        bt.inOrder(root);
        System.out.println();
        bt.preOrder(root);
        System.out.println();
        bt.postOrder(root);
        System.out.println();
    }
}

class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data = data;
    }
}