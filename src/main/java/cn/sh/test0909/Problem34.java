package cn.sh.test0909;

import java.util.ArrayList;

public class Problem34 {

    public static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    // pathList存所有可能路径
    // path用来保存路径的数据结构 这儿用ArrayList模拟了栈的数据结构
    private ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> path = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int sum) {
        if (root == null)
            return pathList;
        path.add(root.val);
        sum -= root.val;
        // 路径值等于0，且当前节点是叶子节点 则找到一条路径
        if (sum == 0 && root.left == null && root.right == null)
            // 每次找到路径都需要添加一个新的path 不可以直接加path成员变量 这是个引用，不然所有pathList的值都指向同一个path
            pathList.add(new ArrayList<Integer>(path));
        if (root.left != null)
            findPath(root.left, sum);

        if (root.right != null)
            findPath(root.right, sum);
        // 访问完当前节点 需要删除路径中最后一个节点，回退至父节点
        path.remove(path.size() - 1);
        return pathList;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(12);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        Problem34 p34 = new Problem34();
        System.out.println(p34.pathList);
        p34.findPath(node1, 22);
        for (ArrayList<Integer> list : p34.pathList) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}