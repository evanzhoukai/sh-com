package cn.sh.test.demo3;

/**
 * @author zhoukai
 * @date 2019-04-08
 */
public class Demo4 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 7, 5, 6, 4};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 冒泡排序
     * 1,遍历数组，最后一位不需要遍历
     * 2,相邻2个数值比较。交换位置
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
