package cn.sh.test0816;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019-08-16
 */
public class Demo081601 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Observable.fromIterable(list).filter(p -> {
            return p.equals("5");
        }).subscribe(list1::add);

        list1.stream().forEach(p -> System.out.println(p));

    }
}
