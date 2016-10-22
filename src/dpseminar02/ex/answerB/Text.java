package dpseminar02.ex.answerB;

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
    public void print(){
        System.out.println(content);
    }
}
