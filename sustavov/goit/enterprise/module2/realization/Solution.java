package sustavov.goit.enterprise.module2.realization;

import sustavov.goit.enterprise.module2.Executor;

import java.util.List;

/**
 * Created by SUSTAVOV on 22.08.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Executor<String> executor = new StringExecutor();

        executor.addTask(new StringTask("Bodhisattva"));
        executor.addTask(new StringTask("Shi111va"), new StringValidator());
        executor.addTask(new StringTask("12345"), new StringValidator());

        executor.execute();

        printResults(executor.getInvalidResults(), "Invalid results :");
        printResults(executor.getValidResults(), "Valid results :");

    }

    public static void printResults(List<String> results, String informationString) {
        System.out.println(informationString);
        results.forEach(System.out::println);

    }
}
