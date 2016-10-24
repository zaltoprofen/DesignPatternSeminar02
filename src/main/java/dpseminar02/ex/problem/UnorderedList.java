package dpseminar02.ex.problem;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by ynakashima on 2016/10/24.
 */
public class UnorderedList extends AbstractList {
    public UnorderedList(List<ListElement> listElements) {
        super();
        setElements(listElements);
    }


    @Override
    protected String getTagName() {
        return "ul";
    }
}
