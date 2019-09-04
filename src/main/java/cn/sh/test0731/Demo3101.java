package cn.sh.test0731;

/**
 * @author zhoukai
 * @date 2019-07-31
 */
public class Demo3101 {

    public static void main(String[] args) {
        int[] tmp = {20, 17, 2, 8, 1, 9, 4, 15, 3, 5, 11, 7};
        demo1(tmp);
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void demo1(int[] arr) {
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
