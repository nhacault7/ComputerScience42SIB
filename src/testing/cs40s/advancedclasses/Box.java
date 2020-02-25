
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

//    private T present;
//    
//    /**
//     * Default constructor for the class, sets class properties
//     * 
//     * @param present the thing to put in the box 
//     */
//    public Box(T present) {
//        this.present = present;
//    }
//    
//    /**
//     * Opens the box and returns the contents
//     * 
//     * @return the thing in the box
//     */
//    public T open() {
//        return present;
//    }
//    
//    /**
//     * Does a "peek" in the box and outputs the contents
//     */
//    public void peek() {
//        System.out.println(present.toString());
//    }
//
//    @Override
//    public int compareTo(Object object) {
//        if (object instanceof Box) {
//            Box that = (Box)object;
//            
//            this.present.c
//            
//        } else {
//            return 0;
//        }
//    }
    
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

    /**
     * Compares two objects, based on the specifics definitions within the 
     * class
     * 
     * @param object the object to be compared to
     * @return A 0 if the argument is equal to this, a value less than 0 if  
     * this is less than the argument, and a value greater than 0 if this is       
     * greater than the argument  
     */
    @Override
    public int compareTo(Object object) {
        if (object instanceof Box) {            // ensure parameter is type box
            Box that = (Box)object;             // cast into a box
            String item1 = (String)this.present;    // get present item
            String item2 = (String)that.present;    // get present item
            return item1.compareTo(item2);      // return compare result
        }
        else {                                  // not of type box
            return 0;                           // return flag
        }
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return present.toString();
    }

}
