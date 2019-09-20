package cn.sh.test0916;

/**
 * @author zhoukai
 * @date 2019/9/20
 */
public class Demo091605 {

    @FunctionalInterface
    interface Count {
        public int sum(int x, int y);
    }

    public static void main(String[] args) {
        Count c = ((x, y) -> {
            int result = x + y;
            return result;
        });
        System.out.println(c.sum(1, 2));
    }


}
