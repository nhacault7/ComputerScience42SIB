package collections;

import java.io.Serializable;

/**
 *
 * @author n.hacault
 * @param <T>
 */
public class Stack <T extends Comparable<T>> implements Serializable {
    
    /** Node reference to the top of the stack  */
    private Node top;
    /** The number of nodes in the stack */
    private int length;
    
    /**
     * Default constructor to set class properties 
     */
    public Stack() {
        finalize();
    }
    
    /**
     * Calls for garbage collection, and frees
     * up memory - when the stack is destroyed
     */
    @Override
    public final void finalize() {
        top = null;
        length = 0;
        System.gc();
    }
    
    /**
     * 
     * @return 
     */
    public boolean isEmpty() {
//        if (length == 0) {
//            return true;
//        } else {
//            return false;
//        }
        // same thing
        return length == 0;
        
    }
    
    /**
     * 
     * @return 
     */
    public int size() {
        return length;
    }
    
    /**
     * 
     * @param data
     * @return 
     */
    public boolean push(T data) {
        if (data == null) return false;
        Node node = new Node(data);
        if (!isEmpty()) node.next = top;
        top = node;
        length++;
        return true;
    }
    
    /**
     * 
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (isEmpty()) return "Empty Stack";
        else {
            String text = "Stack [";
            Node current = top;
            while (current != null) {
                text += current.toString() + ",";
                current = current.next;
            }
            
            return text + "]";
        }
    }
    
}
