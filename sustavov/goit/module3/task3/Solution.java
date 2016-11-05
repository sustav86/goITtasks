package sustavov.goit.module3.task3;

import org.omg.CORBA.StringHolder;
import sustavov.goit.module8.task1.PrintFieldsObjects;
import sustavov.goit.module8.task2.SpecialComparatorInstrument;

import java.util.*;

/**
 * Created by SUSTAVOV on 29.05.2016.
 */
public class Solution {
    public static void main(String[] args) throws NegativeOrderCountException {

        Guitar guitar1 = new Guitar("Fender", "China", TypeInstrument.STRINGED, "good good stuff", 12);
        Guitar guitar2 = new Guitar("FenderXL", "China", TypeInstrument.STRINGED, "good good stuff", 1234);
        Piano piano = new Piano("Piano name", "Indonesia", TypeInstrument.KEYBOARD, "do-re-mi", 234);
        Trumpet trumpet = new Trumpet("Sax", "USA", TypeInstrument.BRASS, "tuuuuuuuuuu", 345);


//        MusicStore musicStore = new MusicStore("SiDo", "Jack Michal", "USA, street Avenu, 56");
//        musicStore.addStore(guitar1);
//        musicStore.addStore(guitar2);
//        musicStore.addStore(piano);
//        musicStore.addStore(trumpet);
//
//        musicStore.inventoryStore();
//
//        Order myOrder = new Order("Order № 1", new Date(), "sustavov");
//        myOrder.addPositionOrder("guitar", 2);
//        myOrder.addPositionOrder("piano", 1);
//        musicStore.prepareInstruments(myOrder.getOrderList());
//        musicStore.inventoryStore();

//        List arrayList = new ArrayList();
//        arrayList.add(piano);
//        arrayList.add(guitar1);
//        arrayList.add(guitar2);
//
//        TreeSet treeSet = new TreeSet(new SpecialComparatorInstrument());
//        treeSet.add(trumpet);
//        treeSet.add(piano);
//        treeSet.add(guitar1);
//        treeSet.add(guitar2);
//
//        System.out.println(treeSet);
//
////        arrayList = null;
//        PrintFieldsObjects.printFields(arrayList);

//        String s = String.class.cast(10);

//        String s = ""  + 10;

//        String s = String.valueOf(10);

//        String s = "Hello, " && "world!";

//        String s = "Hello, ".concat("world!");
//        String s = "Hello, ".add("world!");
//        String ff ="sdfdsf";
//        ff.compareToIgnoreCase("sdfd");
//        StringHolder str = new StringHolder();

//        System.out.println(s);

    }
}
