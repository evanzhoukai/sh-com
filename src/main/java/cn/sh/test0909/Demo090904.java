package cn.sh.test0909;

/**
 * @author zhoukai
 * @date 2019/9/10
 */
public class Demo090904 {

    /**
     * 冒泡
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] tmp = {9, 8, 17, 4, 12, 3, 6, 1, 5, 2};
        demo(tmp);
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
    }

    public static void demo(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
