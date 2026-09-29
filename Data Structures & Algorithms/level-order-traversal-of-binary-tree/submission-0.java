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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> al =new ArrayList<>();

        if(root==null){
            return al;
        }
         Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
       
       while(!queue.isEmpty()){

            int size = queue.size();

            List<Integer> alQueue=new ArrayList<>();
         
            for(int i=0;i<size;i++){
                TreeNode trNode=queue.poll();
                alQueue.add(trNode.val);

                 if(trNode.left !=null){
                queue.offer(trNode.left);
                 }
                 if(trNode.right !=null){
                queue.offer(trNode.right);
                  }
            }
          al.add(alQueue);
         
       }

       return al; 
    }
}
