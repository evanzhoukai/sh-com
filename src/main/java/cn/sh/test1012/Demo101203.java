package cn.sh.test1012;

/**
 * @author zhoukai
 * @date 2019/10/30
 */
public class Demo101203 {
    public static void main(String[] args) {

        String string = "http://mmbiz.qpic.cn/mmbiz_jpg/02aibu6IrDdZ0lBzHv2LYEl7EskNVfHEIqIqWaq3ArQNP2uyAYtwDPv9qRhd7IkyC5kYlBNWu5TavpO9F8HIvJQ/0?wx_fmt=jpeg";

        String ext = string.substring(string.lastIndexOf("=") + 1);
        System.out.println(ext);
    }
}
