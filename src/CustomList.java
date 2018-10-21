//implementacja wlasnej arraylisy

public class CustomList<E> {        //tworzymy klase generyczną

    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];                  //lub zamiast Object - E

    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if(size == elements.length){
            resize();
        }
        elements[size++] = e;
    }

    public void resize(){                               //powiekszenie tablicy x2
        int newSize = elements.length * 2;
        Object[] elements2 = new Object[newSize];
        for (int i = 0; i < elements.length; i++) {
           elements2[i] = elements[i];
        }
        elements = elements2;
    }



    public void size(){
        System.out.println(size);
    }

}
