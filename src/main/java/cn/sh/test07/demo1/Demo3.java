package cn.sh.test07.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019-07-24
 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println("----this----");
        int[] arr = {8, 4, 1, 18, 3, 6, 11, 23, 9, 2, 5, 16, 22, 7, 15};
        int midKey = 10;
        demo1(arr, midKey);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 一个数组中，取一个中间值，把小于中间值放到右边，大于中间值的放到左边，不排序。
     *
     * @param arr
     * @param minKey
     */
    public static void demo1(int[] arr, int minKey) {
        int len = arr.length;
        int tmp = 0;
        int tmp2 = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] > minKey) {
                for (int j = i + 1; j < len; j++) {
                    if (arr[j] < minKey) {
                        tmp = arr[i];
                        tmp2 = arr[j];
                        arr[i] = tmp2;
                        arr[j] = tmp;
                        break;
                    }
                }
            }
        }
    }


    public static void demo2(int[] arr, int minKey) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minKey) {
                list1.add(arr[i]);
            } else {
                list2.add(arr[i]);
            }
        }
        int k = 0;
        for (int i = 0; i < list1.size(); i++) {
            arr[k] = list1.get(i);
            k++;
        }
        for (int i = 0; i < list2.size(); i++) {
            arr[k] = list2.get(i);
            k++;
        }
    }
}
