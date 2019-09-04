package cn.sh.test.demo0620;

/**
 * @author zhoukai
 * @date 2019-06-20
 */
public class Demo1 {

    public static void main(String[] args) {

        int[] arr = {1, 3, -2, 5, -1, -3, -4, -6, 7, -9, 8};
        test1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    /**
     * 小于0 都放到数据的左边
     * 复杂度：O(N)
     * 定义一个记录小于0的下标index ,初始化为0位置。
     * 当数组第一次遇到一下标A的值小于0，则把下标A 的值放在index位置，把原来index位置的值放到A位置。，并把index加1，后面依次类推。
     * 第二次遇到下标B的值小于0，则把B 的值放到index位置，把原来index位置的值放到B位置。
     * 遍历一次数组后，就完成整个操作了。
     *
     * @param arr
     */
    public static void test1(int[] arr) {
        // 指定的判定条件
        int temp = 0;
        // 数组的索引，
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                int tag = arr[i];
                arr[i] = arr[index];
                arr[index] = tag;
                index++;
            }
        }
    }
}
