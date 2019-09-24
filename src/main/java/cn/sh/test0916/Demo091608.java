package cn.sh.test0916;

import org.springframework.util.Assert;

/**
 * @author zhoukai
 * @date 2019/9/24
 */
public class Demo091608 {

    public static void main(String[] args) {

        Person person = new Person();
        try {
            Assert.notNull(person.getName(), "name 为空。");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
