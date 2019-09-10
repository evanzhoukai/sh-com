package cn.sh.test0909;

/**
 * @author zhoukai
 * @date 2019/9/10
 */
public class Demo090908 {

    public static void main(String[] args) {


    }


    static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        maxSum = maxPath(root);
        return maxSum;
    }

    private static int maxPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxPath(root.left);
        int right = maxPath(root.right);
        maxSum = Math.max(left + right + root.val, maxSum);
        int temp = Math.max(left, right) + root.val;
        return temp > 0 ? temp : 0;
    }

    /**
     * 构造树
     */
    public static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }


}
