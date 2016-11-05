package sustavov.goit.module3.task2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SUSTAVOV on 29.05.2016.
 */
public class BushRoses {
    private String name;
    private float price;
    private int amountRoses;
    private ArrayList bushRoses = new ArrayList();

    public BushRoses(String name, float price, int amountRoses) {
        this.name = name;
        this.price = price;
        this.amountRoses = amountRoses;
        constructorRoses(amountRoses);
    }

    private void constructorRoses(int amountRoses) {

        while (amountRoses > 0) {
            bushRoses.add(new Rose("Rose", Color.RED, 100, true));
            amountRoses--;
        }

    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getAmountRoses() {
        return amountRoses;
    }

    public void add(String name, Color color, int length) {
        bushRoses.add(new Rose(name, color, length, true));
        amountRoses++;
    }

    public void displayBouquetRosesInformation() {
        System.out.println(getName());

        Iterator iterator = bushRoses.iterator();

        while (iterator.hasNext()) {
            CommonAbstractFlower fileInfo = (CommonAbstractFlower) iterator.next();
            System.out.println(fileInfo.getName() + " color " + fileInfo.getColor() + " length " + fileInfo.getLength());
        }


    }

    public void remove(int amountRoses) {
        if (amountRoses <= this.amountRoses) {
            for (int i = 0; i < amountRoses; i++) {
                bushRoses.remove(0);
            }
        }

    }
}
