
/** required package class namespace */
package testing.cs42sib;

/** required imports */
import collections.BinaryTree;
import collections.TreeNode;
import io.Simulator;
import io.System;


/**
 * PermanentStorageTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Jan. 14, 2020, 8:01:03 a.m.
 */
public class TreesTest
{

    /**
     * Default constructor, set class properties
     */
    public TreesTest() {
        Simulator.header("Binary Trees Test started...");
        
        Simulator.comment("Creating some TreeNode objects");
        
        TreeNode<Integer> node1 = new TreeNode<>(10);
        TreeNode<Integer> node2 = new TreeNode<>(20);
        TreeNode<Integer> node3 = new TreeNode<>(10, node1, node2);
        node1.left = node2;
        node1.right = node3;
        
        if(node1.equals(node2)) System.out.println("1=2");
        if(node1.equals(node3)) System.out.println("1=3");
        
        System.out.println(node1.toString());
        System.out.println(node2.toString());
        System.out.println(node3.toString());
        
        Simulator.comment("Testing Tree Creation");
        
        BinaryTree<Integer> tree = new BinaryTree<>();
        
        System.out.println(tree.toString());
        
        tree.insert(10);
        tree.insert(20);
        tree.insert(16);
        tree.insert(4);
        tree.insert(8);
        tree.insert(0);
        tree.insert(21);
        
        System.out.println(tree.search(16));
        System.out.println(tree.search(6));
        
        Simulator.header("Binary Trees Test completed!");
    }   
    
    

}
