package cn.sh.test0816;

import com.google.common.collect.Lists;
import io.reactivex.Observable;

import java.util.List;

/**
 * @author zhoukai
 * @date 2019-08-16
 */
public class Demo081602 {

    public static void main(String[] args) {

        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);
        List<Integer> list1 = Lists.newArrayList(5, 6, 7, 8);
        List<Integer> list2 = Lists.newArrayList();

        Observable.merge(Observable.fromIterable(list),
                Observable.fromIterable(list1)).filter(p -> {
            return true;
        }).subscribe(list2::add);
        list2.stream().forEach(p -> System.out.println(p));


    }
}
