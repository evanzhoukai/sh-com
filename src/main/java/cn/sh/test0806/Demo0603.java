package cn.sh.test0806;

/**
 * @author zhoukai
 * @date 2019-08-06
 */
public class Demo0603 {

    public static void main(String[] args) {

        int[] tmp = {19, 3, 9, 2, 17, 45, 7};
        demo(tmp);
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
    }


    public static void demo(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
