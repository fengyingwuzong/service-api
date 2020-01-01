package singleton;

/**
 * 皇帝一般只有一个
 */
public class Emperor {
    /**
     *     //定义一个皇帝
     *     private static Emperor emperor = null;
     *
     *     public static Emperor getInstance(){
     *         //如果还没有皇帝，就先立一个
     *         if (emperor == null){
     *             emperor = new Emperor();
     *         }
     *         return emperor;
     *     }
     *
     *     //皇帝叫什么
     *     public static void emperorInfo(){
     *         System.out.println("我就是皇帝某某某...");
     *     }
     *     上述方法无法保证线程是否会并发产生第二个皇帝对象
     */
    //定义一个皇帝
    private static Emperor emperor = new Emperor();

    //限制不能直接立一个皇帝实例
    private Emperor(){

    }

    public synchronized static Emperor getInstance(){
        return emperor;
    }

    //皇帝叫什么
    public static void emperorInfo(){
        System.out.println("我就是皇帝某某某...");
    }
}
