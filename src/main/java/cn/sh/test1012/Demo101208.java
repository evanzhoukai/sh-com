package cn.sh.test1012;

/**
 * @author zhoukai
 * @date 2019/11/12
 */
public class Demo101208 {

    public static void main(String[] args) {
        String s = "01-01 ~ 01-02";
        String substring = s.substring(0, s.indexOf("~"));
        String substring1 = s.substring(s.indexOf("~") + 1, s.length());
        System.out.println(substring);
        System.out.println(substring1);

    }
}
