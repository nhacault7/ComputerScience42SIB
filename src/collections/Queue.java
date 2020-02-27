/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.io.Serializable;

/**
 *
 * @author n.hacault
 */
public class Queue <T extends Comparable<T>> implements Serializable {
    
    // Node reference to the first node in the queue
    private Node head;
    // Node reference to the last node in the queue
    private Node tail;
    /** The number of nodes in the stack */
    private int length;
    
    /**
     * Default constructor, set class properties
     */
    public Queue() {
        finalize();
    }
    
    /**
     * Removes an item from the tail of the queue
     * 
     * @return the generic data in the queue
     */
    public T dequere() {
        if (isEmpty()) return null;
        else {
            length--;
            T data = (T)tail.data;
            if (head == tail) {
                finalize();
            }
            else {
                tail = tail.previous;
                tail.next.previous = null;
                tail.next = null;
                System.gc();
            }
            return data;
        }
    }
    
    /**
     * Adds data to the head of the queue
     * 
     * @param data
     * @return 
     */
    public boolean enqueue(T data) {
        if (data == null) return false;
        Node node = new Node(data);
        if (isEmpty()) head = tail = node;
        else {
            node.next = head;
            head.previous = node;
            head = node;
        }
        length++;
        return true;
    }
    
    /**
     * 
     * 
     * @return 
     */
    public T front() {
        if (isEmpty()) return null;
        return (T)tail.data;
    }
    
    /**
     * 
     * @return 
     */
    public T back() {
        if (isEmpty()) return null;
        return (T)head.data;
    }
    
    @Override
    public final void finalize() {
        head = tail = null;
        length = 0;
        System.gc();
        
    }
    
    /**
     * Determines if the stack is empty or not
     * 
     * @return empty stack (true) or not (false)
     */
    public boolean isEmpty() {
        return length == 0;
    }
    
    /**
     * The number of items in the stack
     * 
     * @return the length of the stack
     */
    public int size() {
        return length;
    }
    
}
