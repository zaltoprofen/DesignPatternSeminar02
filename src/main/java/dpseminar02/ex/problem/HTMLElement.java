package dpseminar02.ex.problem;

import java.util.List;

/**
 * Created by ynakashima on 2016/10/24.
 */
public abstract class HTMLElement extends Element {

    protected abstract String getTagName();
    protected abstract List<Element> getChildren();

    @Override
    public void render(int level) {
        String tn = getTagName();
        for (int i = 0; i < level; i++) System.out.print("\t");
        System.out.println(String.format("<%s>", tn));
        for (Element e : getChildren()) {
            e.render(level+1);
        }
        for (int i = 0; i < level; i++) System.out.print("\t");
        System.out.println(String.format("</%s>", tn));
    }
}
