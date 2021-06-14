package com.liuning.algorithms.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<E> implements Iterable<E> {
	
    private Node<E> first;    // beginning of queue
    private Node<E> last;     // end of queue
    private int n;               // number of elements on queue

    // helper linked list class
    private static class Node<E> {
        private E data;
        private Node<E> next;
    }

    public Queue() {
        first = null;
        last  = null;
        n = 0;
    }

    public boolean isEmpty() {	return first == null;	}
 
    public int size() {	return n;	}

    public E peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return first.data;
    }

    public void enqueue(E data) {
        Node<E> oldlast = last;
        last = new Node<E>();
        last.data = data;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        n++;
    }
 
    public E dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        E data = first.data;
        first = first.next;
        n--;
        if (isEmpty()) last = null;   // to avoid loitering
        return data;
    }


    public String toString() {
        StringBuilder s = new StringBuilder();
        for (E data : this) {
            s.append(data);
            s.append(' ');
        }
        return s.toString();
    } 

    public Iterator<E> iterator()  {
        return new ListIterator<E>(first);  
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<E> implements Iterator<E> {
        private Node<E> current;

        public ListIterator(Node<E> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            E item = current.data;
            current = current.next; 
            return item;
        }
    }


    public static void main(String[] args) {
    	
        Queue<String> queue = new Queue<String>();
       
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        
        System.out.println("(" + queue.size() + " left on queue)");
    }
}

