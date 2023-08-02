package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testConstructor(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertNotNull(llist);
    }

    @Test
    public void testIsEmpty(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertEquals(true, llist.isEmpty());
    }

    @Test
    public void testAdd1(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(false, llist.isEmpty());
    }

    @Test
    public void testAdd2(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        llist.add(2);
        Assert.assertEquals(false, llist.isEmpty());
    }

    @Test
    public void testToString(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        String expected = "head -> NULL";
        Assert.assertEquals(expected, llist.toString());
    }

    @Test
    public void testToString2(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        String expected = "head -> [1] -> NULL";
        Assert.assertEquals(expected, llist.toString());
    }

    @Test
    public void testToString3(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        llist.add(2);
        String expected = "head -> [1] -> [2] -> NULL";
        Assert.assertEquals(expected, llist.toString());
    }

    //METHOD SIZE
    @Test
    public void testSize0(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertEquals(0, llist.size());
    }

    @Test
    public void testSize1(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(1, llist.size());
    }

    @Test
    public void testSize2(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        llist.add(2);
        Assert.assertEquals(2, llist.size());
    }

    // METHOD FIND
    @Test
    public void testFind0(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertEquals(-1, llist.find(1));
    }

    @Test
    public void testFind1(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(0, llist.find(1));
    }

    @Test
    public void testFind1A(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        Assert.assertEquals(llist.size() - 1, llist.find(1));
    }
}
