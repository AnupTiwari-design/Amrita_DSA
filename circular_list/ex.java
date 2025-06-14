package circular_list;

import java.util.ArrayList;

class Ex {
    String name;
    int age;

    Ex(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class ArrayListExample {
    ArrayList<Ex> arr = new ArrayList<>();

    ArrayListExample() {
        arr.add(new Ex("Anup", 24));
        arr.add(new Ex("Ravi", 22));
    }

    void printList() {
        for (Ex e : arr) {
            System.out.println("Name: " + e.name + ", Age: " + e.age);
        }
    }

    public static void main(String[] args) {
        ArrayListExample ob = new ArrayListExample();
        ob.printList();
    }
}