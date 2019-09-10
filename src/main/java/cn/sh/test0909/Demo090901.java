package cn.sh.test0909;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author zhoukai
 * @date 2019/9/9
 */
public class Demo090901 {


    public static void main(String[] args) {
        RandomAccessFile randomAccessFile = null;
        try {

            randomAccessFile = new RandomAccessFile("/Users/shenqi/work/company/file/my.txt", "rw");
//            randomAccessFile = new RandomAccessFile("src/main/resources/test.txt", "rw");
            FileChannel channel = randomAccessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int read = channel.read(buffer);
            System.out.println(read);
            while (read != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    char a = (char) buffer.get();
                    String s = new String(String.valueOf(a).getBytes("ISO-8859-1"), "UTF-8");
                    System.out.println(s);
//                    System.out.println((char) buffer.get());
                }
                buffer.compact();
                read = channel.read(buffer);
            }
        } catch (Exception e) {

        }
    }

}
