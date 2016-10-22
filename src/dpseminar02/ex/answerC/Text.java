package dpseminar02.ex.answer;

import java.util.ArrayList;

/**
 * Created by kagaminaoto on 2016/10/18.
 */
public class Text extends Tag {
    private String content;

    public Text(String content){
        super(new ArrayList<Tag>());
        this.content = content;
    }

    @Override
    public void open() {}

    @Override
    public void close() {}


    @Override
    public void print(int indent){
        String indentText = "";
        for(int i=0;i<indent;i++) indentText += "\t";

        System.out.println(indentText + content);
    }
}
