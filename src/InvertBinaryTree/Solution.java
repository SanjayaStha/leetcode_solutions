package InvertBinaryTree;


//   Definition for a binary tree node.
//   public class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode() {}
//       TreeNode(int val) { this.val = val; }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//           this.val = val;
//           this.left = left;
//           this.right = right;
//       }
//   }
 
class Solution {

    public static class TreeNode {
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

             @Override
             public String toString() {
             // TODO Auto-generated method stub
             System.out.println("Root: "+val+" Left: "+left.val+" right: "+right.val);
             return super.toString();
             }
         }

         public static void main(String[] args) {
            TreeNode root = new TreeNode();
            TreeNode lroot = new TreeNode();
            TreeNode rroot = new TreeNode();
            root.val = 0;
            // lroot.val = null;
            rroot.val = 1;

            System.out.println();

            root.left = lroot;
            root.right = rroot;
            System.out.println(root.toString());
            TreeNode newroot = invertTree(root);
            System.out.println(newroot.toString());
            
         }


    public static TreeNode invertTree(TreeNode root) {

        if(root == null){
            return root;
        }

        if(root.left == null && root.right == null){

            return root;
        }

        if(root.left != null){
            TreeNode temp = root.left;
            if(root.right !=null){
                root.left = root.right;
                root.right = temp;
            }else {
                root.right = temp;
                root.left = null;
            }

          
        } else {
            root.left = root.right;
            root.right = null;
        }
        
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }


    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}