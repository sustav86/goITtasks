package sustavov.goit.enterprise.module32_1;

import java.util.IllegalFormatException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

/**
 * Created by SUSTAVOV on 11.10.2016.
 */
public class ParallelCalculationSquareSum implements SquareSum {
    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        if (values == null || numberOfThreads == 0) {
            throw new IllegalArgumentException("Wrong array or number of threads");
        }
        Phaser phaser = new Phaser();
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        AtomicLong sum = new AtomicLong(0);

        phaser.register();
        IntStream.range(0, numberOfThreads).forEach((i) -> executorService.submit(new ArraysCalculation(phaser, values, i, numberOfThreads, sum)));

        executorService.shutdown();
        phaser.arriveAndAwaitAdvance();

        return sum.longValue();
    }
}
