import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Test MyLinkedList class
        MyLinkedList<Integer> myList = new MyLinkedList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        System.out.println("Linked List: " + myList);

        int elementAtIndex = myList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex);

        myList.remove(1);
        System.out.println("List after removing element at index 1: " + myList);

        myList.sort();
        System.out.println("List after sorting: " + myList);

        // Test MyArrayList class
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("apple");
        myArrayList.add("banana");
        myArrayList.add("cherry");

        System.out.println("Array List: " + myArrayList);

        String stringAtIndex = myArrayList.get(1);
        System.out.println("Element at index 1: " + stringAtIndex);

        int indexOfElement = myArrayList.indexOf("cherry");
        System.out.println("Index of 'cherry': " + indexOfElement);

        int lastIndexOfElement = myArrayList.lastIndexOf("banana");
        System.out.println("Last index of 'banana': " + lastIndexOfElement);

        int size = myArrayList.size();
        System.out.println("Size of Array List: " + size);
    }
}
