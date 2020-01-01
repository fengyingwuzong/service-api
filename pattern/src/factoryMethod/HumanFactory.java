package factoryMethod;

import java.util.List;
import java.util.Random;

public class HumanFactory {
    public static Human createHuman(Class c){
        Human human = null;
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        }catch (InstantiationException e){
            System.out.println("必须指定人种");
        }catch (IllegalAccessException e){
            System.out.println("制定人种格式错误");
        }catch (ClassNotFoundException e){
            System.out.println("指定人种不存在");
        }
        return human;
    }
    public static Human createHuman(){
        Human human = null;
        List<Class> concreateHumanList = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        int rand = random.nextInt(concreateHumanList.size());
        human = createHuman(concreateHumanList.get(rand));
        return human;
    }
}
