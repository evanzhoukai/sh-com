package cn.sh.test06.demo0624;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019-06-24
 */
public class Demo01 {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        Person person1 = new Person(1, "lucy0");
        Person person2 = new Person(1, "lucy1");
        Person person3 = new Person(1, "lucy2");
        Person person4 = new Person(1, "lucy3");
        Person person5 = new Person(1, "lucy4");
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        List<String> names = Lists.transform(list, item -> item.name);
        names.forEach(name -> System.out.println(name));
    }

    public static class Person {
        private int age;
        private String name;

        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
