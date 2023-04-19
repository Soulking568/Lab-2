# MyList Interface and Implementations
This assignment involves creating an interface called MyList and implementing two classes, MyArrayList and MyLinkedList, which are implementations of the MyList interface in Java. The MyArrayList class is similar to the built-in ArrayList class in Java, while the MyLinkedList class is similar to the built-in LinkedList class, but without using any of the classes from the java.util package.

**MyList Interface**


The MyList interface defines a basic list data structure with common list operations such as adding, removing, and accessing elements, as well as other list-related operations. The interface has the following methods:

int size(): Returns the number of elements in the list.
boolean contains(Object o): Returns true if the list contains the specified element, false otherwise.
void add(T item): Adds the specified element to the end of the list.
void add(T item, int index): Adds the specified element at the specified index in the list.
boolean remove(T item): Removes the first occurrence of the specified element from the list, if it exists.
T remove(int index): Removes the element at the specified index from the list and returns it.
void clear(): Removes all elements from the list.
T get(int index): Returns the element at the specified index in the list.
int indexOf(Object o): Returns the index of the first occurrence of the specified element in the list, or -1 if it does not exist.
int lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in the list, or -1 if it does not exist.
void sort(): Sorts the elements in the list in ascending order.
MyArrayList Class
The MyArrayList class is an implementation of the MyList interface using an array to store the elements. It has the following features:

Private instance variable Object[] to store the elements of the list.
Private int variable size to keep track of the number of elements in the list.
add(E element) method that adds the specified element to the end of the list, dynamically resizing the array if needed.
get(int index) method that returns the element at the specified index in the list.
remove(int index) method that removes the element at the specified index from the list, shifting subsequent elements to the left.
size() method that returns the number of elements in the list.
Additional methods to implement the other operations specified in the MyList interface.

## **MyLinkedList Class**


The MyLinkedList class is an implementation of the MyList interface using a doubly linked list data structure in Java. It has the following features:

Private inner class Node that represents a node in the linked list, containing an element of type T and references to the next and previous nodes.
Private instance variables head and tail that reference the first and last nodes in the list, respectively.
Private int variable size to keep track of the number of elements in the list.
add(T element) method that adds the specified element to the end of the list, updating the tail reference.
add(T element, int index) method that adds the specified element at the specified index in the list, updating the next and previous references of surrounding nodes.
remove(int index) method that removes the element at the specified index from the list, updating the next and previous references of surrounding nodes.
get(int index) method that returns the element at the specified index in the list, traversing the list from the head or tail.
indexOf(Object o) method that returns the index of the first occurrence of the specified element in the list, or -1 if it does not exist.
lastIndexOf(Object o) method that returns the index of the last occurrence of the specified element in the list, or -1 if it does not exist.
size() method that returns the number of elements in the list.
clear() method that removes all elements from the list.
sort() method that sorts the elements in the list in ascending order.
