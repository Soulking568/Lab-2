import java.util.Arrays;

public class MyLinkedList<T> implements mylist<T> {
    private class Node {
        T element;
        Node next;
        Node prev;

        public Node(T element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void add(T item) {
        Node newNode = new Node(item);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(T item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        if (index == size) {
            add(item);
        } else {
            Node newNode = new Node(item);
            if (index == 0) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } else {
                Node current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                newNode.next = current;
                newNode.prev = current.prev;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
    }
    @Override
    public boolean remove(T item) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(item)) {
                if (current == head) {
                    head = current.next;
                } else {
                    current.prev.next = current.next;
                }
                if (current == tail) {
                    tail = current.prev;
                } else {
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current == head) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current == tail) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        size--;
        return current.element;
    }
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        Node current;
        if (index <= size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.element;
    }
    @Override
    public int indexOf(Object o) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (o == null) {
                if (current.element == null) {
                    return i;
                }
            } else if (o.equals(current.element)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }
    @Override
    public int lastIndexOf(Object o) {
        Node current = tail;
        for (int i = size - 1; i >= 0; i--) {
            if (o == null) {
                if (current.element == null) {
                    return i;
                }
            } else if (o.equals(current.element)) {
                return i;
            }
            current = current.prev;
        }
        return -1;
    }
    @Override
    public void sort() {
        if (size > 1) {
            boolean swapped;
            do {
                swapped = false;
                Node current = head;
                Node previous = null;
                while (current != null && current.next != null) {
                    if (((Comparable<T>) current.element).compareTo(current.next.element) > 0) {
                        // Swap current and current.next elements
                        T temp = current.element;
                        current.element = current.next.element;
                        current.next.element = temp;
                        swapped = true;
                    }
                    previous = current;
                    current = current.next;
                }
            } while (swapped);
        }
    }

    @Override
    public void sort(String[] arr,int start_index, int end_index) {

    }
}

