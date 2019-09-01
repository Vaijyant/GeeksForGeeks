package DataStructures.Heap;

import java.util.Arrays;

public class Heap {
    private int capacity = 10;
    private int size = 0;
    int[] items = new int[capacity];

    private int getLeftChildIndex(int index) { return index * 2 + 1; }
    private int getRightChildIndex(int index) { return index * 2 + 2; }
    private int getParentIndex(int index) { return (index - 1) / 2; }

    private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; }
    private boolean hasParent(int index) { return index > 0 && getParentIndex(index) >= 0; }

    private void swap(int index1, int index2) {
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }

    private void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity = capacity * 2;
        }
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }

    public int poll() {
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        heapifyDown();
        return item;
    }

    public void add(int item) {
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && items[getParentIndex(index)] > items[index]) {
            swap(index, getParentIndex(index));
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && items[getRightChildIndex(index)] < items[getLeftChildIndex(index)]) {
                smallerChildIndex = getRightChildIndex(index);
            }
            if (items[index] < items[smallerChildIndex])
                break;
            else
                swap(index, smallerChildIndex);
            index = smallerChildIndex;
        }
    }
}