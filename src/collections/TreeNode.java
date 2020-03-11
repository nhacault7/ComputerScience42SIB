package collections;

import java.io.Serializable;

/**
 *
 * @author n.hacault
 * @param <T>
 */
public class TreeNode <T extends Comparable<T>> implements Serializable {
    
    public T data;
    
    public TreeNode left;
    public TreeNode right;
    
    
    
    public TreeNode() {
        this(null, null, null);
    }
    
    public TreeNode(T data) {
        this(data, null, null);
    }
    
    public TreeNode(T data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
    @Override
    public String toString() {
        return data.toString();
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        TreeNode that = (TreeNode)object;
        try {
            return this.data.equals(that.data);
        } 
        catch(NullPointerException error) {
            System.out.println("Null Error");
            return false;
        }
        catch (ClassCastException error) {
            System.out.println("Casting Error");
            return false;
        }
    }

    @Override
    public TreeNode clone() {
        return new TreeNode<>(this.data);
    }
    
}
