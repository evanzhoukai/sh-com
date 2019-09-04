package cn.sh.test.demo3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author zhoukai
 * @date 2019-04-18
 */
public class Demo6 {


    public static void main(String[] args) {
        String app = "f4d5283673726e49e54dc41230fbf010";
        String key = "appId1012callWay1languagezh-CNnonce9ff16c7fcf7e1ff4961fa75d6eae126cprintWay1shopIds[134489,134488]timeZoneGMT+8timestamp1555553502v1.0weixinQrDesctestbyechowxShopImghttp://img3.mwee.cn/shoplogo/2016/1010/17/57fb5cd4afb81.jpgwxViewUrlhttp://test";
        key = key + app;
        String msg = "appId1012callWay1languagezh-CNnonce9ff16c7fcf7e1ff4961fa75d6eae126cprintWay1shopIds[134489,134488]timeZoneGMT+8timestamp1555553502v1.0weixinQrDesctestbyechowxShopImghttp://img3.mwee.cn/shoplogo/2016/1010/17/57fb5cd4afb81.jpgwxViewUrlhttp://test";
        String md5 = encryptMD5(msg + app);

        System.out.println(md5);
    }

    private final static String MD5 = "MD5";


    /**
     * 转换字节数组为十六进制字符串
     *
     * @param bytes 字节数组
     * @return 十六进制字符串
     */
    private static String byteArrayToHexString(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(byteToHexString(bytes[i]));
        }
        return sb.toString();
    }

    /**
     * 将一个字节转化成十六进制形式的字符串
     *
     * @param b 字节数组
     * @return 字符串
     */
    private static String byteToHexString(byte b) {
        int ret = b;
        //System.out.println("ret = " + ret);
        if (ret < 0) {
            ret += 256;
        }
        int m = ret / 16;
        int n = ret % 16;
        return hexDigits[m] + hexDigits[n];
    }


    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static String encryptMD5(String input) {
        try {
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance(MD5);
            // 使用指定的字节更新摘要
            mdInst.update(input.getBytes());
            // 获得密文
            byte[] md = mdInst.digest();
            return byteArrayToHexString(md);
        } catch (NoSuchAlgorithmException e) {
        }
        return "";
    }
}
