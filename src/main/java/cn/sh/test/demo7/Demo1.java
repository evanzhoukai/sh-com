package cn.sh.test.demo7;

/**
 * @author zhoukai
 * @date 2019-04-25
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 10, 2, 5, 3, 8, 4};
        maoSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 冒泡
     * <p>
     * 思想:1,循环比较相邻元素大小。根据排序规则去交换相邻数据的大小
     *
     * @param arr
     */
    public static void maoSort(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
