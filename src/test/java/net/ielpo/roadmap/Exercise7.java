package net.ielpo.roadmap;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomList<T> {
    private CustomListNode<T> firstNode;
    private CustomListNode<T> lastNode;

    public CustomList() {
    }

    public void push(T value) {
        var newNode = new CustomListNode<T>(value);

        if (firstNode == null) {
            // Empty list
            firstNode = newNode;
        } else {
            // Full list
            lastNode.setNextNode(newNode);
        }

        lastNode = newNode;
    }

    // Simil printAll to be unit tested
    public ArrayList<T> getAll() {
        var currentNode = firstNode;
        var values = new ArrayList<T>();

        while (currentNode != null) {
            // System.out.print(currentNode.getValue());
            values.add(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }

        return values;
    }
}

class CustomListNode<T> {
    private T value;
    private CustomListNode<T> nextNode;

    public CustomListNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public CustomListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(CustomListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

}

public class Exercise7 {
    @Test
    void customListTest1() {
        var customList = new CustomList<Integer>();
        var values = customList.getAll();

        Assertions.assertArrayEquals(new Integer[] {}, values.toArray());
    }

    @Test
    void customListTest2() {
        var customList = new CustomList<Integer>();
        customList.push(1);
        customList.push(2);
        customList.push(3);
        var values = customList.getAll();

        Assertions.assertArrayEquals(new Integer[] { 1, 2, 3 }, values.toArray());
    }
}
