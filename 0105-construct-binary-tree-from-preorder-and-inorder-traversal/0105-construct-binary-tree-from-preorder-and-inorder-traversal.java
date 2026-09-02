/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }
    public TreeNode build(int[] preorder, int left, int right) {

        if (left > right) {
            return null;
        }

        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);

        int index = map.get(rootValue);

        root.left = build(preorder, left, index - 1);

        root.right = build(preorder, index + 1, right);

        return root;
    }
}