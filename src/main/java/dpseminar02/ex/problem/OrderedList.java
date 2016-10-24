package dpseminar02.ex.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ynakashima on 2016/10/24.
 */
public class OrderedList extends AbstractList {
    public OrderedList(List<ListElement> listElements) {
        setElements(listElements);
    }

    @Override
    protected String getTagName() {
        return "ol";
    }
}
