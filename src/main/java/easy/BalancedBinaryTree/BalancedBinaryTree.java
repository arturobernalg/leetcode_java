package easy.BalancedBinaryTree;

import node.TreeNode;

public class BalancedBinaryTree {

    public static void main(String arc[]) {


        BalancedBinaryTree.isBalanced(create());
    }

    public static boolean isBalanced(TreeNode root) {

        if(root==null){
            return true;
        }

        int left = height(root.left);
        int right = height(root.right);

        if (Math.abs(left - right)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }


    private static int height(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;

    }

    public static TreeNode create() {
        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);

        tree.right.left.left = new TreeNode(8);

        return tree;
    }
}
