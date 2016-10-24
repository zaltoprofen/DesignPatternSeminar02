package dpseminar02.ex.problem;

/**
 * Created by ynakashima on 2016/10/24.
 */
abstract class Element {
    public void render(){
        render(0);
    }
    abstract void render(int level);
}
