package cn.sh.test1012;

/**
 * @author zhoukai
 * @date 2019/11/5
 */
public class Demo101206 {

    public static void main(String[] args) {
        String url = "http://member.wx.mwee.cn/wxshop/page?appid={$wx_appid}";
        String substring = url.substring(0, url.indexOf("?"));
        String substring1 = url.substring(url.lastIndexOf("?"));
        substring = substring + "?id=" + 3;
        System.out.println(substring);
        System.out.println(substring1);
        System.out.println(substring + "&" + substring1);
    }
}
