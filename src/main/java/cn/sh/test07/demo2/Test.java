package cn.sh.test07.demo2;

public class Test {

    public static void main(String[] args) {

        Thread[] threads = new Thread[20];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new TestThread();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }

}

class TestThread extends Thread {
    @Override
    public void run() {
        // 对于不同单例模式的实现，只需更改相应的单例类名及其公有静态工厂方法名即可
        int hash = SingleDemo.getInstance2().hashCode();
        System.out.println(hash);
    }
}
