package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListJUnitTest {

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());
        list.push(24);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.top() == -1);

        list.push(11);
        Assert.assertTrue(list.top() == 11);

        list.push(-12);
        Assert.assertTrue(list.top() == -12);

        list.pop();
        Assert.assertTrue(list.top() == 11);

        list.pop();
        Assert.assertTrue(list.top() == -1);
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();

        Assert.assertTrue(list.pop() == -1);

        for(int i = 0; i < 10; i ++) {
            list.push(i);
        }

        for(int i = 9; i >= 0; i --) {
            int popResult = list.pop();
            Assert.assertEquals(i, popResult);
            Assert.assertTrue(list.top() == i - 1);
        }
        Assert.assertTrue(list.top() == -1);
    }

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        for (int i = 0; i < 10; i++) {
            list.push(i);
            Assert.assertTrue(list.top() == i);
        }
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertFalse(list.isFull());
    }

    @Test
    public void testPushAndPop() {
        int popResult;
        IntLinkedList list = new IntLinkedList(); // -
        Assert.assertFalse(list.isFull());

        list.push(24); // 24
        Assert.assertTrue(list.top() == 24);

        list.push(25); // 24, 25
        Assert.assertTrue(list.top() == 25);

        popResult = list.pop(); // 24
        Assert.assertTrue(popResult == 25);
        Assert.assertTrue(list.top() == 24);

        list.push(31); // 24, 31
        Assert.assertTrue(list.top() == 31);

        popResult = list.pop(); // 24
        Assert.assertTrue(popResult == 31);
        Assert.assertTrue(list.top() == 24);

        popResult = list.pop(); // -
        Assert.assertTrue(popResult == 24);
        Assert.assertTrue(list.top() == -1);

        popResult = list.pop(); // -
        Assert.assertTrue(popResult == -1);

    }
}
