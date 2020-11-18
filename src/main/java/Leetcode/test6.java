package Leetcode;


public class test6 {
    public static void main(String[] args) {
        String s1 = new StringBuilder("go")
                .append("od").toString();
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("ja")
                .append("va").toString();
        System.out.println(s2.intern() == s2);
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null ){
            return null;
        }
        int size = (nums.length-1)/2;
        TreeNode head = new TreeNode(nums[size]);

        buildtree(nums,0,size-1,head,true);
        buildtree(nums,size+1,nums.length-1,head,false);
        return head;
    }

    public static void buildtree(int[] nums,int start,int end, TreeNode head,boolean isleft){
        if (start>end){
            return ;
        }
        TreeNode headnew = null;
        int size = (start - end)/2;
        if (start == end){
             headnew = new TreeNode(nums[start]);
        }else{
            headnew = new TreeNode(nums[size]);
        }
        if (isleft){
            head.left=headnew;
        }else{
            head.right = headnew;
        }
        buildtree(nums,0,size-1,head,true);
        buildtree(nums,size+1,nums.length-1,head,false);
    }
}
