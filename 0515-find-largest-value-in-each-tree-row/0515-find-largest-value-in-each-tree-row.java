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

    public void printrootlevel(TreeNode root, int d,  List<Integer>res){
        if(root == null) return;
        
        if(d == res.size()){
            // List<Integer> li = new ArrayList<>();
            // li.add(root.val);
            res.add(root.val);
        }
        else{
          //   res.get(d).add(root.val);
          res.set(d, Math.max(res.get(d), root.val));
             
        }
        printrootlevel(root.left, d+1, res);
        printrootlevel(root.right, d+1, res);
        return;

    }
    // public int max(List<Integer> x){
    //     int max = Integer.MIN_VALUE;
    //     for(Integer y : x) max = Math.max(y, max);
    //     return max;
    // }
    public List<Integer> largestValues(TreeNode root) {
        //List<List<Integer>> result = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        printrootlevel(root, 0, a);
        // for(List<Integer> x : result)
        // a.add(max(x));
        return a;
    }
}