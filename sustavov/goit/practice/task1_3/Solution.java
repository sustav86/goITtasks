package sustavov.goit.practice.task1_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SUSTAVOV on 17.07.2016.
 */
public class Solution {
    public static void main(String[] args) {
        int[] ar = {2, 3, 8};
        System.out.println(OddNumericSearches.getFirstOddNumericIndex(ar));
        List<String> list = new ArrayList<>();
        list.add("dfsdf");
        System.out.println(OddNumericSearches.getFirstOddNumericIndex(list));

    }
}
