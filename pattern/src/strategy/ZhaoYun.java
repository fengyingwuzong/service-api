package strategy;

/**
 * @author guojinfu
 * 策略模式
 * 场景刘备入赘，诸葛亮给赵云三个锦囊妙计
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("刘备刚到吴国拆第一个********");
        context = new Context(new BackDoor());
        context.operate();//拆开锦囊
        System.out.println("**********************");

        System.out.println("刘备乐不思蜀拆第二个********");
        context = new Context(new GivenGreenLight());
        context.operate();//拆开锦囊
        System.out.println("**********************");

        System.out.println("孙权追兵逼近拆第三个********");
        context = new Context(new BlockEnemy());
        context.operate();//拆开锦囊
        System.out.println("**********************");

    }
}
