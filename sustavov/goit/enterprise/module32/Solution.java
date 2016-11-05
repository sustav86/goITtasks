package sustavov.goit.enterprise.module32;


/**
 * Created by SUSTAVOV on 11.10.2016.
 */
public class Solution {
    public static void main(String[] args) {
        ParallelCalculationSquareSum parallelCalculationSquareSum = new ParallelCalculationSquareSum();
        int[] values = {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(parallelCalculationSquareSum.getSquareSum(values, 5));
    }
}
