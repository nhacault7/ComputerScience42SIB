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
    
    public boolean search(T data) {
        if (data == null) return false;
        return recursiveSearch(data, root);
        
    }

    private boolean recursiveSearch(T data, 
            TreeNode<T> current) {
//        //base case (on empty tree or go past a leaf node)
//        if (current == null) {
//            return false;
//        }
//        else if (data.compareTo(current.data) < 0) {
//            // recursive case (look in the left sub-tree)
//            return recursiveSearch(data, current.left);
//        }
//        else if (data.compareTo(current.data) > 0) {
//            // recursive case (look right in the sub tree)
//            return recursiveSearch(data, current.right);
//        }
//        else {
//            // base case (found it)
//            return true;
//        }


        //base case (on empty tree or go past a leaf node)
        if(current == null) return false;
        // recursive case (look in the left sub-tree)
        else if (data.compareTo(current.data) < 0)
            return recursiveSearch(data, current.left);
        // recursive case (look right in the sub tree)
        else if (data.compareTo(current.data) > 0)
            return recursiveSearch(data, current.right);
        else return true; // base case (found it)
        
    }
    
    public boolean insert(T data) {
        // error check
        if (data == null) return false;
        // inserting the very first node
        if (root == null) root = new TreeNode<>();
        // insert every other node
        else root.insert(data);
        return true;
    }
    
}
