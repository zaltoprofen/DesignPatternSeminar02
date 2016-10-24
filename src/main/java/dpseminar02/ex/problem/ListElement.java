package dpseminar02.ex.problem;

import javax.swing.text.html.HTML;
import java.util.Collections;
import java.util.List;

/**
 * Created by ynakashima on 2016/10/24.
 */
public class ListElement extends HTMLElement {
    private List<Element> children;
    public ListElement(List<Element> children) {
        for (Element e : children) {
            this.children.add(e);
        }
    }

    public ListElement(Element child) {
        this.children = Collections.singletonList(child);
    }

    @Override
    protected String getTagName() {
        return "li";
    }

    @Override
    protected List<Element> getChildren() {
        return children;
    }
}
