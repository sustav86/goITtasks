package sustavov.goit.module8.task2;

import sustavov.goit.module3.task3.*;

import java.util.TreeSet;

/**
 * Created by SUSTAVOV on 20.06.2016.
 */
public class Solution {
    public static void main(String[] args) {

        Guitar guitar1 = new Guitar("Fender", "China", TypeInstrument.STRINGED, "good good stuff", 12);
        Guitar guitar2 = new Guitar("FenderXL", "China", TypeInstrument.STRINGED, "good good stuff", 1234);
        Piano piano = new Piano("Piano name", "Indonesia", TypeInstrument.KEYBOARD, "do-re-mi", 234);
        Trumpet trumpet = new Trumpet("Sax", "USA", TypeInstrument.BRASS, "tuuuuuuuuuu", 345);

        TreeSet<Instrument> treeSet = new TreeSet<>(new SpecialComparatorInstrument());
        treeSet.add(trumpet);
        treeSet.add(piano);
        treeSet.add(guitar1);
        treeSet.add(guitar2);

        System.out.println(treeSet);
    }
}
