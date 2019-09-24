package cn.sh.test0916;

import lombok.Data;
import org.springframework.util.Assert;

/**
 * @author zhoukai
 * @date 2019/9/24
 */
public class Demo091607 {

    public static void main(String[] args) {
        Person person = new Person();

        try {
            Assert.notNull(person.name, "person的name空。");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Data
    static class Person {
        private int age;
        private String name;

        public Person() {

        }

        public Person(int age) {
            this.age = age;
        }
    }
}
