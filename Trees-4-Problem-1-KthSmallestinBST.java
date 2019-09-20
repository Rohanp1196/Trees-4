/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     int count=0;
        int result;
    public int kthSmallest(TreeNode root, int k) {
        
        inorder(root,k);
        return result;
        
       
        
        
        
    }
    
    public void inorder(TreeNode root, int k){
        
        //base case
        if(root == null)return;
        
        inorder(root.left,k);
        count++;
        
        if(count==k){
            result = root.val;
            return;
        }
        
        inorder(root.right,k);
        
        
    }
}