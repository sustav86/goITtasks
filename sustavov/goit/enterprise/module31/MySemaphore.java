package sustavov.goit.enterprise.module31;

/**
 * Created by SUSTAVOV on 24.09.2016.
 */
public class MySemaphore implements Semaphore {

    private int counter = 0;
    private final Object lock = new Object();

    public MySemaphore(int counter) {
        this.counter = counter;
    }

    public MySemaphore() {

    }

    @Override
    public void acquire() {
        synchronized (lock) {
            while (counter == 0) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            counter--;
        }

    }

    @Override
    public void acquire(int permits) {
        synchronized (lock) {
            if (permits < 0) {
                throw new IllegalArgumentException("i < 0");
            }
            while (counter < permits) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            counter -= permits;
        }

    }

    @Override
    public void release() {
        synchronized (lock) {
            lock.notify();
            counter++;
        }
    }

    @Override
    public void release(int permits) {
        synchronized (lock) {
            if (permits < 0) {
                throw new IllegalArgumentException("i < 0");
            }
            for (int i = 0; i < permits; i++) {
                lock.notify();
            }
        }

    }

    @Override
    public int getAvailablePermits() {
        return counter;
    }
}
