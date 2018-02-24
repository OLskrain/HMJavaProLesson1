import java.util.ArrayList;
import java.util.Collections;

public class Tack2<T> {
    private T[] array;
    private ArrayList<T> list;

    public Tack2(T[] array) {
        this.array = array;
    }
    public void transformation(){
        list = new ArrayList<>();
        Collections.addAll(list,array);
        System.out.print(list);

    }
}
