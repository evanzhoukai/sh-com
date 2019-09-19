package cn.mwee.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

/**
 * @author zhoukai
 * @date 2019/9/19
 */
public class Test1 {

    public static void main(String[] args) {

        //获取java 线程管理的Bean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 获取线程和线程堆栈信息
        // 参数一：lockedMonitors   dump all locked monitors
        // 参数二：lockedSynchronizers dump all locked ownable synchronizers
        // 都设置为false
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 打印结果
        Arrays.stream(threadInfos).forEach(val -> System.out.println("【Thread Id】: " + val.getThreadId() + " =====【Thread Name】 : " + val.getThreadName()));
    }
}
