package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;
import com.zipcodewilmington.singlylinkedlist.Node;

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

    @Test
    public void testFind2(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        Assert.assertEquals(1, llist.find(7));
    }

    @Test
    public void testFind3(){
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        llist.add(9);
        Assert.assertEquals(0, llist.find(5));
        Assert.assertEquals(2, llist.find(9));
    }

    // METHOD CONTAINS
    @Test
    public void testContains0() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        llist.add(9);
        Assert.assertTrue(llist.contains(5));
    }

    @Test
    public void testContains2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        llist.add(9);
        Assert.assertTrue(llist.contains(5));
        Assert.assertTrue(llist.contains(7));

    }

    @Test
    public void testContainsFalse() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        llist.add(9);
        Assert.assertFalse(llist.contains(4));

    }

    @Test
    public void testGet0() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        llist.add(9);
        int temp = llist.get(0);

        Assert.assertEquals(5, temp);
    }

    @Test
    public void testGet2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        llist.add(9);
        int temp = llist.get(2);

        Assert.assertEquals(9, temp);
    }

    @Test
    public void testGet1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Node temp = new Node(9);
        llist.add(temp);
        int actual = llist.get(0);

        Assert.assertEquals(temp.getData(), actual);
    }

    @Test
    public void testGet3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Node temp = new Node(9);
        Node temp1 = new Node(3);
        llist.add(temp);
        llist.add(temp1);
        int actual = llist.get(1);

        Assert.assertEquals(temp1.getData(), actual);
    }


    @Test
    public void testRemove3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();

        llist.add(4);
        llist.add(8);
        llist.add(12);
        llist.add(16);
        llist.remove(2);

        int actual = llist.size();

        Assert.assertEquals(3, actual);
    }

    @Test
    public void testRemove4() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();

        llist.add(4);
        llist.add(8);
        llist.add(12);
        llist.add(16);
        llist.remove(2);

        int actual = llist.get(2);


        Assert.assertEquals(16, actual);
    }

    @Test
    public void testCopy0() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();

        SinglyLinkedList<Integer> copy = llist.copy();

        Assert.assertEquals(llist.toString(), copy.toString());
    }

    @Test
    public void testCopy1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(4);

        SinglyLinkedList<Integer> copy = llist.copy();

        Assert.assertEquals(llist.toString(), copy.toString());
    }

    @Test
    public void testCopy2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(4);
        llist.add(8);

        SinglyLinkedList<Integer> copy = llist.copy();

        Assert.assertEquals(llist.toString(), copy.toString());
    }


    @Test
    public void testCopy4() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(4);
        llist.add(8);
        llist.add(12);
        llist.add(16);

        SinglyLinkedList<Integer> copy = llist.copy();

        Assert.assertEquals(llist.toString(), copy.toString());
    }

}
