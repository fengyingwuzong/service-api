package multition;

import java.util.ArrayList;
import java.util.Random;

public class Emperor{
    private static int maxNumOfEmperor = 2;
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);
    private static int countNumOfEmperor = 0;
    static {
        for (int i=0 ; i<maxNumOfEmperor ; i++){
            emperorList.add(new Emperor("第"+i+"位皇帝"));
        }
    }

    private Emperor(){

    }

    private Emperor(String info){
        emperorInfoList.add(info);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor)emperorList.get(countNumOfEmperor);
    }

    public static Emperor getInstance(int num){
        return (Emperor)emperorList.get(num);
    }

    public static void emperorInfo(){
        System.out.println("************************"+emperorInfoList.get(countNumOfEmperor));
    }
}