package dpseminar02.ex.answer;

import java.util.List;

/**
 * Created by kagaminaoto on 2016/10/18.
 */
public abstract class Tag {
    private List<Tag> children;

    public Tag(List<Tag> children) {
        this.children = children;
    }

    public abstract void open();
    public abstract void close();

    public void print(){
        print(0);
    }

    public void print(int indent){
        String indentText = "";
        for(int i=0;i<indent;i++) indentText += "\t";

        System.out.print(indentText);
        open();
        for(Tag child : children){
            child.print(indent+1);
        }
        System.out.print(indentText);
        close();
    }
}
