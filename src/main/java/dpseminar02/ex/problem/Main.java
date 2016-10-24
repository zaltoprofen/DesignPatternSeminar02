package dpseminar02.ex.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by kakaminaoto on 2016/10/18.
 */
public class Main {
    public static void main(String[] args){
        Text text1 = new Text("text1");
        Text text2 = new Text("text2");
        Text text3 = new Text("text3");

        ListElement listElement1 = new ListElement(text1);
        ListElement listElement2 = new ListElement(text2);
        ListElement listElement3 = new ListElement(text3);

        UnorderedList unorderedList = new UnorderedList(new ArrayList<ListElement>(Arrays.asList(listElement1, listElement2, listElement3)));
        unorderedList.render();

        OrderedList orderedList = new OrderedList(new ArrayList<ListElement>(Arrays.asList(listElement1, listElement2, listElement3)));
        orderedList.render();
    }
}
