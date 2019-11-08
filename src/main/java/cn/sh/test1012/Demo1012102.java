package cn.sh.test1012;

import java.io.File;

/**
 * @author zhoukai
 * @date 2019/10/29
 */
public class Demo1012102 {

    public static void main(String[] args) {
        String path = (String.valueOf(Thread.currentThread()
                .getContextClassLoader().getResource(""))).
                replaceAll("file:/", "").replaceAll("%20", " ").trim();
        if (!path.startsWith(File.separator)) {
            path = File.separator + path;
        }
        System.out.println(path);
    }


}
