package cn.sh.test0909;

/**
 * [LeetCode] 1. Two Sum 两数之和
 * @author zhoukai
 * @Description:
 * @date 2019-09-10 22:55
 */
public class Demo090910 {

    public static void main(String[] args) {

        int [] tmp = {2,12,15,7};
        int target = 9;
        int[] demo = demo(tmp, target);
        for (int i = 0;i<demo.length;i++){
            System.out.println(demo[i]);
        }
    }

    /**
     * res 为下标
     *
     * @return
     */
    public static int[] demo(int [] arr,int target){
        int [] res = new int[2];
        for(int i =0;i<arr.length;i++){
          int tmp =  arr[i];
          int ta = target-tmp;
          for(int j = arr.length-1;j>i;j--){
              if(ta==arr[j]){
                  res[0]=i;
                  res[1]=j;
                  break;
              }
          }
        }
        return res;
    }
}
