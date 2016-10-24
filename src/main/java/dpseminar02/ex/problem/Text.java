package dpseminar02.ex.problem;

/**
 * Created by ynakashima on 2016/10/24.
 */
public class Text extends Element {
    String text;
    public Text(String text) {
        this.text = text;
    }

    @Override
    public void render(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(text);
    }
}
