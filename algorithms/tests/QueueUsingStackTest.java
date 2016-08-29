package practice.algorithms.tests;

import org.junit.Before;
import org.junit.Test;
import practice.algorithms.QueueUsingStack;

import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QueueUsingStackTest {

    @Before
    public void setUp(){

    }

    @Test
    public void addingOneItemAndRemovingFromQueueWillReturnThatItem() throws Exception {
        QueueUsingStack<String> queue = new QueueUsingStack<String>();
        queue.add("Item1");
        assertThat(queue.remove(), is("Item1"));
    }

    @Test
    public void addingMultipleItemsAndRemovingFromQueueWillReturnThatItem() throws Exception {
        QueueUsingStack<String> queue = new QueueUsingStack<String>();
        queue.add("Item1");
        queue.add("Item2");
        queue.add("Item3");
        assertThat(queue.remove(), is("Item1"));
    }

    @Test
    public void addingThreeThenRemoveTwoWillReturnItem1ThenItem2() throws Exception{
        QueueUsingStack<String> queue = new QueueUsingStack<String>();
        queue.add("Item1");
        queue.add("Item2");
        queue.add("Item3");
        assertThat(queue.remove(), is("Item1"));
        assertThat(queue.remove(), is("Item2"));
        queue.add("Item4");
        queue.add("Item5");
        assertThat(queue.remove(), is("Item3"));
        assertThat(queue.remove(), is("Item4"));
    }

    @Test(expected = NoSuchElementException.class)
    public void throwsErrorIfRemoveCalledOnEmptyQueue(){
        QueueUsingStack<String> queue = new QueueUsingStack<String>();
        queue.remove();
    }
}
