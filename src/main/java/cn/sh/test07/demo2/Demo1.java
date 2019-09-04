package cn.sh.test07.demo2;

/**
 * @author zhoukai
 * @date 2019-07-30
 */
public class Demo1 {

    public static void main(String[] args) {
        int[] tmp = {19, 10, 5, 1, 16, 14, 6, 9, 2, 8};
        demo1(tmp);
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
    }

    /**
     * 冒泡
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
