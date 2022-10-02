package easy.MaximumDepthBinaryTree;

import node.TreeNode;

public class MaximumDepthBinaryTree {


    public static void main(String arc[]) {


        MaximumDepthBinaryTree.maxDepth(create());
    }


    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if (left > right)
            return (left + 1);
        else
            return (right + 1);
    }

   /* private static int inOrder(TreeNode node) {

        if (node == null) {
            return 0;
        }
        int left =  inOrder(node.left);
        int right = inOrder(node.right);

        return Math.max(left, right);
    }*/


    /**
     * Java method to create binary tree with test data * * @return a sample binary tree for testing
     */
    public static TreeNode create() {
        TreeNode tree = new TreeNode(1);
        //tree.left.left = new TreeNode(10);
        //tree.left.left.left = new TreeNode(5);
        //tree.left.right = new TreeNode(30);
        tree.right = new TreeNode(2);
        tree.right.right = new TreeNode(3);
        //tree.left.right.left = new TreeNode(67);
        //tree.left.right.right = new TreeNode(78);
        return tree;
    }
}
