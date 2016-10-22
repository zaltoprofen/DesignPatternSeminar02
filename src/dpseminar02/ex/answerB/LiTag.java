package dpseminar02.ex.answerB;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kagaminaoto on 2016/10/18.
 */
public class LiTag extends Tag {
    public LiTag(Text text){
        super(new ArrayList<Tag>(Arrays.asList(text)));
    }

    @Override
    public void open() {
        System.out.println("<li>");
    }

    @Override
    public void close() {
        System.out.println("</li>");
    }
}
