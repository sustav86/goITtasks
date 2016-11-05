package sustavov.goit.module8.task2;

import sustavov.goit.module3.task1.CommonAbstractFile;

import java.util.Comparator;

/**
 * Created by SUSTAVOV on 19.06.2016.
 */
public class SpecialComparatorFile implements Comparator<CommonAbstractFile> {
    @Override
    public int compare(CommonAbstractFile o1, CommonAbstractFile o2) {

        String str1 = o1.getName();
        String str2 = o2.getName();

        return str1.compareTo(str2);
    }

}
