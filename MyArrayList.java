import java.util.Arrays;

public class MyArrayList<T> implements mylist<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }
}
