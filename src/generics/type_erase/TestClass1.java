package generics.type_erase;

import java.util.ArrayList;

/*
class TestClass1 <T extends Comparable<T>> {

    private void handle(T operand) {
    }

    private void handle(Object obj) {
    }

    AddTenList<Integer> addTenList = new AddTenList<>(Integer.class);

}

public static class AddTenList<T> {
    private ArrayList<T> list = new ArrayList<>();

    public AddTenList(ArrayList<T> list) {
        this.list = list;
        for (int i = 0; i < 10; i++) {
            list.add(new T());
        }
    }
}
*/
