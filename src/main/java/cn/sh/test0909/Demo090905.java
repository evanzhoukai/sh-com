package cn.sh.test0909;

/**
 * @author zhoukai
 * @date 2019/9/10
 */
public class Demo090905 {

    /**
     * 选择
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

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void demo(int[] arr) {
        int size = arr.length;
        int tmp = 0;
        for (int i = 0; i < size; i++) {
            int k = i;
            for (int j = size - 1; j > i; j--) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
        }
    }
}
