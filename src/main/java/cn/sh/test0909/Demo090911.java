package cn.sh.test0909;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhoukai
 * @date 2019/9/12
 */
public class Demo090911 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                2, 2L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(2));
    }
}
