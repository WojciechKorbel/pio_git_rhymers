package edu.kis.vh.nursery.list;

/**
 * The IntLinkedList class represents a linked list where each node contains an integer value.
 */
public class IntLinkedList {

    private static final int DEFAULT_VALUE = -1;
    private Node last;
    private int i;

    /**
     * Insert integer at the top of the list.
     * @param i inserted value
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Check if the list is empty.
     * @return if list is empty - true, else - false
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Check if the list is full.
     * @return always return false, because list can't be full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Checks the value stored at the top of the linked list
     * @return the integer value of the node at the top of the list
     */
    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return last.getValue();
    }

    /**
     * Remove integer from end of the list.
     * @return removed value
     */
    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * The Node class represents a single element (node) of a linked list represented by the IntLinkedList
     */
    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Assigns a integer value to a node
         * @param i assigned value
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Return the node before the current node
         * @return the previous node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Set the node before the current node
         * @param prev the node that will be before the current node
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Return the node after the current node
         * @return the next node
         */
        public Node getNext() {
            return next;
        }

        /**
         * Set the node before the current node
         * @param next the node that will be after the current node
         */
        public void setNext(Node next) {
            this.next = next;
        }

        /**
         * Get the value assigned to this node
         * @return integer value assigned to the current node
         */
        public int getValue() {
            return value;
        }
    }




}