package sustavov.goit.enterprise.module32_1;

import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by SUSTAVOV on 11.10.2016.
 */
public class ArraysCalculation implements Runnable {
    private Phaser phaser;
    private int[] values;
    private int currentThread;
    private int numberOfThreads;
    private AtomicLong sum;

    public ArraysCalculation(Phaser phaser, int[] values, int currentThread, int numberOfThreads, AtomicLong sum) {
        this.phaser = phaser;
        this.phaser.register();
        this.values = values;
        this.currentThread = currentThread;
        this.numberOfThreads = numberOfThreads;
        this.sum = sum;
    }

    @Override
    public void run() {
        int step = values.length / numberOfThreads;
        int balance = values.length % numberOfThreads;
        int start = currentThread * step;
        int end = start + step;
        if (balance != 0 && currentThread == numberOfThreads-1) {
            end = values.length;

        }
        for (int i = start; i < end; i++) {
            sum.getAndAdd(values[i]*values[i]);
        }

        phaser.arriveAndDeregister();
    }
}
