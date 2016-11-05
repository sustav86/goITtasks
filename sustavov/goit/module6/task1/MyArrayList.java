package sustavov.goit.module6.task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/**
 * Tiny clone class of <t>ArrayList</t>
 *
 * Created by SUSTAVOV on 04.07.2016.
 */
public class MyArrayList<E> implements RandomAccess
{
    /**
     * Default initial capacity
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Object[] EMPTY_ARRAY = {};

    /**
     * The array buffer into which the elements of the ArrayList are stored.
     */
    transient Object[] currentArray;

    /**
     * The size of the MyArrayList
     */
    private int size;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyArrayList() {
        currentArray = EMPTY_ARRAY;
    }

    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param  capacity  the initial capacity of the list
     * @throws IllegalArgumentException if the specified initial capacity
     *         is negative
     */
    public MyArrayList(int capacity) {
        if (capacity > 0) {
            currentArray = new Object[capacity];
        }else if (capacity == 0) {
            currentArray = EMPTY_ARRAY;
        }else {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
    }

    /**
     * Constructs a list containing the elements of the specified
     * collection, in the order they are returned by the collection's
     * iterator.
     *
     * @param c the collection whose elements are to be placed into this list
     * @throws NullPointerException if the specified collection is null
     */
    public MyArrayList(Collection<? extends E> c) {
        currentArray = c.toArray();
        if ((size = currentArray.length) != 0) {
            if (currentArray.getClass() != Object[].class)
                currentArray = Arrays.copyOf(currentArray, size, Object[].class);
        } else {
            currentArray = EMPTY_ARRAY;
        }
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return size;
    }

    /**
     * Returns <tt>true</tt> if this list contains no elements.
     *
     * @return <tt>true</tt> if this list contains no elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(E element) {
        riseArray(size + 1);
        currentArray[size++] = element;
        return true;
    }

    private void riseArray(int sizeValue) {
        if (currentArray == EMPTY_ARRAY) {
            sizeValue = Math.max(DEFAULT_CAPACITY, sizeValue);
        }

        if (sizeValue - currentArray.length > 0) {
            grow(sizeValue);
        }
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkIndex(index);

        return (E) currentArray[index];
    }

    /**
     * The maximum size of array to allocate.
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * Increases the capacity to ensure that it can hold at least the
     * number of elements specified by the minimum capacity argument.
     *
     * @param sizeArray the desired minimum capacity
     */
    private void grow(int sizeArray) {
        int oldCapacity = currentArray.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - sizeArray < 0) {
            newCapacity = sizeArray;
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            newCapacity = setMaxCapacity(newCapacity);
        }

        currentArray = Arrays.copyOf(currentArray, newCapacity);
    }

    /**
     * Return max Integer value
     *
     * @param newCapacity the desired minimum capacity
     * @return max Integer value
     */
    private int setMaxCapacity(int newCapacity) {
        if (newCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return MAX_ARRAY_SIZE;
    }

    /**
     * Checks if the given index is in range.  If not, throws an appropriate
     * runtime exception.  This method does *not* check if the index is
     * negative: It is always used immediately prior to an array access,
     * which throws an ArrayIndexOutOfBoundsException if index is negative.
     */
    private void checkIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + ", should be less than size " + size);
        }
    }

}
