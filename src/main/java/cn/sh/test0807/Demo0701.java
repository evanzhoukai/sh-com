package cn.sh.test0807;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019-08-07
 */
public class Demo0701 {


    static String base = "string";


    public static void main(String[] args) {


        try {

            List<String> list = new ArrayList<String>();
            for (int i = 0; i < Integer.MAX_VALUE; i++) {

                String str = base + base;
                str += i;
                base = str;
                list.add(str.intern());
                Thread.sleep(2000L);
            }
            Thread.sleep(20000000L);
        } catch (Exception e) {

            try {
                Thread.sleep(20000000L);
            } catch (Exception e1) {

            }


        }

    }
}
