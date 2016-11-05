package sustavov.goit.enterprise.module32;

import java.util.concurrent.Callable;
import java.util.concurrent.Phaser;

/**
 * Created by SUSTAVOV on 11.10.2016.
 */
public class ArraysCalculation implements Callable<Long> {
    private Phaser phaser;
    private int[] values;
    private int start;
    private int end;
    private long sum;

    public ArraysCalculation(Phaser phaser, int[] values, int start, int end) {
        this.phaser = phaser;
        this.values = values;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        for (int i = start; i < end; i++) {
            sum += values[i]*values[i];
        }
        phaser.arriveAndAwaitAdvance();

        return sum;
    }
}
