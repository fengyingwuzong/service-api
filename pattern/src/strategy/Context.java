package strategy;

public class Context {
    private Strategy strategy;

    //拿一个锦囊装计谋
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //使用计谋
    public void operate(){
        this.strategy.operate();
    }
}
