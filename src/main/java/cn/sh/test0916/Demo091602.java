package cn.sh.test0916;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhoukai
 * @date 2019/9/16
 */
public class Demo091602 {

    /**
     * "pwwkew" 输出3.kew
     *
     * @param args
     */
    public static void main(String[] args) {

        String s = "dvdf";
        Set<String> set = new HashSet<>();
        int max = demo(s);
        System.out.println(max);
    }


    public static int demo(String s) {
        int[] hash = new int[123];
        int max = 0;
        int i = 0, j = 0;

        while (i < s.length() && j < s.length()) {
            System.out.println(s.charAt(j));
            System.out.println(hash[s.charAt(j)]);
            if (hash[s.charAt(j)] == 0) {
                hash[s.charAt(j)] = 1;
                j++;
                max = (j - i) > max ? (j - i) : max;
            } else {
                hash[s.charAt(i)] = 0;
                i++;
            }
        }
        return max;
    }
}
