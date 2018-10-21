//implementacja wlasnej arraylisy

import java.util.Arrays;

public class CustomList<E> {        //tworzymy klase generyczną

    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];                  //lub zamiast Object - E

    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = e;
    }

    public void resize() {                               //powiekszenie tablicy x2
        int newSize = elements.length + 10;
        Object[] elements2 = new Object[newSize];
        for (int i = 0; i < elements.length; i++) {
            elements2[i] = elements[i];
        }
        elements = elements2;                           //przypisanie adresu tablicy elements2 w miejsce adresu tablicy elements

        //inne rozwiazanie
        //elements = Arrays.copyOf(elements, newSize);  //tu uzywa sie biblioteki standardowej
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Nie ma takiego elementu");
        }
        return (E) elements[i];
    }


    public int size() {
        return size;
    }

}
