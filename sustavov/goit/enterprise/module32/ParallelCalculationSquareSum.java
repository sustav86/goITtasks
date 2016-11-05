package sustavov.goit.enterprise.module32;

import java.util.concurrent.*;

/**
 * Created by SUSTAVOV on 07.10.2016.
 */
public class ParallelCalculationSquareSum implements SquareSum {
    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        if (values == null || numberOfThreads == 0) {
            throw new IllegalArgumentException("Wrong array or number of threads");
        }
        Phaser phaser = new Phaser(1);
        ExecutorService executorService = Executors.newCachedThreadPool();

        int step = values.length / numberOfThreads;
        int balance = values.length % numberOfThreads;
        int start = 0;
        int end;
        long sum = 0;

        for (int i = 0; i < numberOfThreads; i++) {
            if (balance != 0 && i+1 == numberOfThreads) {
                end = values.length-1;
            }else {
                end = start + start;
            }
            Future<Long> future = executorService.submit(new ArraysCalculation(phaser, values, start, end));
            try {
                sum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            start = start + step;
        }
        return sum;
    }
}
