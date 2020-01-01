package proxy;

/**
 * @author guojinfu
 * 代理模式
 * 场景：西门庆请王婆做代理，勾搭潘金莲
 */
public class XiMenQing {
    public static void main(String[] args) {
        System.out.println("西门庆找王婆代理约潘金莲");
        WangPo wangPo = new WangPo();

        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();

        System.out.println("************");
        System.out.println("西门庆又想勾搭贾氏，找王婆");
        JiaShi jiashi =  new JiaShi();
        wangPo = new WangPo(jiashi);

        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();
    }
}
