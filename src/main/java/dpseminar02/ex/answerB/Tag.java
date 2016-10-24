package dpseminar02.ex.answerB;

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
        open();
        for(Tag child : children){
            child.print();
        }
        close();
    }
}
