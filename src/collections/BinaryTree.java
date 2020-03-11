package collections;

import java.io.Serializable;

/**
 *
 * @author n.hacault
 * @param <T>
 */
public class BinaryTree <T extends Comparable<T>> implements Serializable {
    
    private TreeNode<T> root;
    
    private LinkedList<T> list;
    private LinkedList<T> order;
    
    
    
    public BinaryTree() {
        root = null;
        list = new LinkedList<>();
        order = new LinkedList<>();
    }
    
}
