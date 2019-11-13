package cn.sh.test1012;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhoukai
 * @date 2019/11/12
 */
public class Demo101207 {

    public static void main(String[] args) {
        String s = "1-2";
        if (StringUtils.contains(s, "-")) {
            String substring = s.substring(0, s.indexOf("-"));
            String substring1 = s.substring(s.indexOf("-") + 1, s.length());
            System.out.println(substring);
            System.out.println(substring1);
        }
    }
}
