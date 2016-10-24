package dpseminar02.ex.problem;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by ynakashima on 2016/10/24.
 */
public abstract class AbstractList extends HTMLElement {
    protected List<Element> listElements;

    public AbstractList() {
        this.listElements = Lists.newArrayList();
    }

    protected void setElements(List<ListElement> listElements) {
        for (Element e : listElements) {
            this.listElements.add(e);
        }
    }

    @Override
    protected List<Element> getChildren() {
        return listElements;
    }
}
