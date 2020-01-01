package multition;

/**
 * @author guojinfu
 * 多例模式
 * 同一朝代多位皇帝
 */
public class Minister {
    public static void main(String[] args) {
        int ministerNum = 10;
        for (int i=0 ; i<ministerNum ; i++){
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+(i+1)+"位大臣参拜的是：");
            emperor.emperorInfo();
        }

        for (int i=0 ; i<ministerNum ; i++){
            Emperor emperor = Emperor.getInstance(1);
            System.out.println("第"+(i+1)+"位大臣参拜的是：");
            emperor.emperorInfo();
        }
    }
}
