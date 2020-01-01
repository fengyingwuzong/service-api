package factoryMethod;

public class WhiteHuman implements Human {

    private static String color = "白种人";
    @Override
    public void laugh() {
        System.out.println(color +"会笑");
    }

    @Override
    public void cry() {
        System.out.println(color +"会哭");
    }

    @Override
    public void talk() {
        System.out.println(color +"会说话");
    }
}
