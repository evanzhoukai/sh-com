package cn.sh.test07.demo1;

/**
 * @author zhoukai
 * @date 2019-07-24
 */
public class Demo1 {

    public static void main(String[] args) {
        System.out.println("---test---");
        int[] tmp = {5, 9, 4, 10, 3, 6, 8, 1, 7, 12, 2, 24};
        sortDemo1(tmp);
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
    }

    /**
     * @param arr 冒泡排序，注意遍历数组的次数。第一层循环为数组长度-1，第二层循环为数据长度-1再-第一层循环的位置下标
     */
    public static void sortDemo1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
