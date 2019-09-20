package cn.sh.test0916;

/**
 * @author zhoukai
 * @date 2019/9/20
 */
public class Demo091604 {

    public static void main(String[] args) {

        Message message = () -> System.out.println("Hi.");
        message.print();
    }

    interface Message {

        public void print();

    }
}
