package dpseminar02.ex.answer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kagaminaoto on 2016/10/18.
 */
public class OlTag extends Tag {
    public OlTag(List<LiTag> children){
        super(new ArrayList<Tag>(children));
    }

    @Override
    public void open() {
        System.out.println("<ul>");
    }

    @Override
    public void close() {
        System.out.println("</ul>");
    }
}
