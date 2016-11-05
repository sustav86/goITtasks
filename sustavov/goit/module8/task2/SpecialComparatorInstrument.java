package sustavov.goit.module8.task2;

import sustavov.goit.module3.task3.Instrument;

import java.util.Comparator;

/**
 * Created by SUSTAVOV on 19.06.2016.
 */
public class SpecialComparatorInstrument implements Comparator<Instrument> {
    @Override
    public int compare(Instrument o1, Instrument o2) {

        String str1 = o1.getName();
        String str2 = o2.getName();

        int i1 = str1.length();
        int i2 = str2.length();

        if (i1 < i2) {
            return -1;
        } else if (i1 > i2) {
            return 1;
        } else {
            return str1.compareTo(str2);
        }

    }

}
