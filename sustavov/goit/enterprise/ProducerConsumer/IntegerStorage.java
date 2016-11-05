package sustavov.goit.enterprise.ProducerConsumer;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by SUSTAVOV on 16.10.2016.
 */
public class IntegerStorage<T> implements StorageHub<T> {
    private int capacity;
    private Object monitor = new Object();
    private volatile Queue<T> storage = new PriorityQueue<>();

    public IntegerStorage(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void put(T value) {
        synchronized (monitor) {
            while (storage.size() == capacity) {
                try {
                    System.out.println(Thread.currentThread().getName() + " waiting for put()");
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            storage.add(value);
            System.out.println(Thread.currentThread().getName() + " add value: " + value);
            monitor.notifyAll();
        }

    }

    @Override
    public T get() {
        synchronized (monitor) {
            while (storage.isEmpty()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " waiting for get() ");
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            T val = storage.poll();
            System.out.println(Thread.currentThread().getName() + " get value: " + val);
            monitor.notifyAll();

            return val;

        }

    }
}
