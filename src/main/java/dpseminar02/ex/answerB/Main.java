package dpseminar02.ex.answerB;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kakaminaoto on 2016/10/18.
 */
public class Main {
    public static void main(String[] args){
        Text text1 = new Text("text1");
        Text text2 = new Text("text2");
        Text text3 = new Text("text3");

        LiTag liTag1 = new LiTag(text1);
        LiTag liTag2 = new LiTag(text2);
        LiTag liTag3 = new LiTag(text3);

        UlTag ulTag = new UlTag(new ArrayList<LiTag>(Arrays.asList(liTag1,liTag2,liTag3)));
        ulTag.print();

        OlTag olTag = new OlTag(new ArrayList<LiTag>(Arrays.asList(liTag1,liTag2,liTag3)));
        olTag.print();
    }
}
