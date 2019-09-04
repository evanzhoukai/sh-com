package cn.sh.test07.demo1;

/**
 * @author zhoukai
 * @date 2019-07-24
 */
public class Demo2 {

    public static void main(String[] args) {
        System.out.println("---mao---");
        int[] tmp = {23, 5, 1, 9, 2, 7, 3, 8, 4, 10, 5, 17, 39};
        sortDemo2(tmp);
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
    }

    /**
     * 冒泡
     *
     * @param arr
     */
    public static void sortDemo2(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换位置
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
