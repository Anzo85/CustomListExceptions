package anzo.custom;

public interface CustomList {


    boolean add(String element);

    void add(int index, String element) throws OutException;

    void add(Double n, String element);

    void remove(int index) throws OutException;

    int size();

    boolean isEmpty();

    String get(int index);

}
