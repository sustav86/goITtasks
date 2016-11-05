package sustavov.goit.module8.task1;

import sustavov.goit.module3.task3.Instrument;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by SUSTAVOV on 16.06.2016.
 */
public class PrintFieldsObjects {
    public static void printFields(List<Instrument> objectsCollections) {
        if (objectsCollections == null) {
            throw new NullPointerException("This list is null");
        }
        Iterator iterator = objectsCollections.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            List<Field> fields = Arrays.asList(object.getClass().getDeclaredFields());
            System.out.print(object.getClass().getName() + "\t");
            fields.stream().forEach(p -> System.out.print(p.getName() + "\t"));
            System.out.println();
        }

    }
}
