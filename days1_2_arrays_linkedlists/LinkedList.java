package days1_2_arrays_linkedlists;

public class LinkedList<T> {
    private class Node<N> {
        private N data;
        private Node<N> next;

        Node(N data) {
            this.data = data;
            this.next = null;
        }

        public N getData() {
            return data;
        }

        public Node<N> getNext() {
            return next;
        }

        public void setNext(Node<N> next) {
            this.next = next;
        }
    }

    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void add(T item) {
        Node<T> newNode = new Node<>(item);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
    }
}