package singleton;

/**
 * @author guojinfu
 * 单例模式
 * 场景大臣们只听命于一位皇帝
 */
public class Minister {
    public static void main(String[] args) {
        System.out.println("******第一天");
        Emperor  emperor1=Emperor.getInstance();
        emperor1.emperorInfo(); //第一天见的皇帝叫什么名字呢？
        System.out.println("******第二天");
        Emperor  emperor2=Emperor.getInstance();
        Emperor.emperorInfo();
        System.out.println("******第三天");
        Emperor  emperor3=Emperor.getInstance();
        emperor2.emperorInfo();
    }
}
