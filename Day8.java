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

class Element{
    int sum;
    int ans;   
}

class Solution {
    public Element helper(TreeNode root){
        if(root == null){
            return new Element();
        }
        
        Element leftans = helper(root.left);
        Element rightans = helper(root.right);
               
        Element ob = new Element();           
        ob.sum = leftans.sum + rightans.sum + root.val;
        ob.ans = leftans.ans + rightans.ans + Math.abs(leftans.sum - rightans.sum);
        return ob;
    }
    public int findTilt(TreeNode root) {
        return helper(root).ans;
    }
}