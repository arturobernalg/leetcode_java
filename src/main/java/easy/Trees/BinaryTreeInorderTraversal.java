package easy.Trees;

import node.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {



    public static void main(String arg[]){

        BinaryTreeInorderTraversal.inorderTraversal(new TreeNode());
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        final List<Integer> result=new ArrayList<>();
        inOrder(root,result);

        return result;
    }


    private static void inOrder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inOrder(node.left,result);
        result.add(node.val);
        inOrder(node.right,result);
    }


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
