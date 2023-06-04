package CountGoodNodesinBinaryTree;

public class CountGoodNodesinBinaryTree {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int goodNodes(TreeNode root) {

        return traverseNodes(root, Integer.MIN_VALUE);
    }

    public int traverseNodes(TreeNode root, int index){
        if(root == null)
            return 0;

        if(root.val >= index){
            return 1 + traverseNodes(root.left,root.val)+ traverseNodes(root.right, root.val);
        } else{
            return traverseNodes(root.left, index + 1) + traverseNodes(root.right, index + 1);
        }


    }

}
