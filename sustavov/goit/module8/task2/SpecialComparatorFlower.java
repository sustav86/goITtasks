package sustavov.goit.module8.task2;

import sustavov.goit.module3.task2.CommonAbstractFlower;

import java.util.Comparator;

/**
 * Created by SUSTAVOV on 19.06.2016.
 */
public class SpecialComparatorFlower implements Comparator<CommonAbstractFlower> {
    @Override
    public int compare(CommonAbstractFlower o1, CommonAbstractFlower o2) {

        String str1 = o1.getName();
        String str2 = o2.getName();

        return str1.compareTo(str2);
    }
}
