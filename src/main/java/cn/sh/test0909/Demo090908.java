package cn.sh.test0909;

/**
 * 求二叉树最大路径和--求二叉树的最大路径和
 * @author zhoukai
 * @date 2019/9/10
 */
public class Demo090908 {

    /***
     * [-10,9,20,null,null,15,7]
     * @param args
     */
    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(-10);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = null;
        TreeNode node5 = null;
        TreeNode node6 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node1.right=node3;
        node3.left=node6;
        node3.right = node7;
        int i = maxPathSum(node1);
        System.out.println(i);

    }


    /**
     * 定义最大值得和
     */
    static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;
    }

    private static int maxPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxPath(root.left);
        int right = maxPath(root.right);
        // 计算最大值得和，与上一计算值比较，取最大
        maxSum = Math.max(left + right + root.val, maxSum);
        int temp = Math.max(left, right) + root.val;
        return temp > 0 ? temp : 0;
    }

    /**
     * 构造树
     */
    public static class TreeNode {

        /**
         * 当前节点值
         */
        int val;

        /***
         * 左节点
         */
        TreeNode left;

        /***
         * 右节点
         */
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }


}
