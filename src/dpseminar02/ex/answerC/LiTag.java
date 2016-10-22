package dpseminar02.ex.answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
