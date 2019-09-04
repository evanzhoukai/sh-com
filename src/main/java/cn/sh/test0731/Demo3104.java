package cn.sh.test0731;

/**
 * @author zhoukai
 * @date 2019-07-31
 */
public class Demo3104 {

    public static void main(String[] args) throws Exception {
        int[] tmp = {20, 17, 2, 5, 1, 19, 3, 8, 4, 16, 6, 13, 7};
        demo(tmp);
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
    }

    /***
     * 冒泡
     * @param arr
     */
    public static void demo(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
