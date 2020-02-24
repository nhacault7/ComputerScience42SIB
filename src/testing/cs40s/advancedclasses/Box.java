
/** required package class namespace */
package testing.cs40s.advancedclasses;

/** required imports */
import io.System;
import java.io.Serializable;


/**
 * Box.java - represents a box that can hold anything 
 *
 * @author Mr. Wachs 
 * @param <T> the generic type for the box contents
 * @since Nov. 6, 2019, 11:38:39 a.m.
 */
public class Box <T> implements Comparable, Serializable
{

    private T present;
    
    /**
     * Default constructor for the class, sets class properties
     * 
     * @param present the thing to put in the box 
     */
    public Box(T present) {
        this.present = present;
    }
    
    /**
     * Opens the box and returns the contents
     * 
     * @return the thing in the box
     */
    public T open() {
        return present;
    }
    
    /**
     * Does a "peek" in the box and outputs the contents
     */
    public void peek() {
        System.out.println(present.toString());
    }

    @Override
    public int compareTo(Object object) {
        if (object instanceof Box) {
            Box that = (Box)object;
            
            this.present.c
            
        } else {
            return 0;
        }
    }

}
