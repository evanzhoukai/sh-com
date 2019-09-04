package cn.sh.test.demo1;

/**
 * @author zhoukai
 * @date 2019-02-13
 */
public class Demo2 {

    public static void main(String[] args) {
        String seq = "我爱，中国，就是，人事，财务";
        String searchSeq = "人事";
        int fromIndex = 0;
        System.out.println(seq.indexOf(searchSeq,fromIndex));


    }
}
