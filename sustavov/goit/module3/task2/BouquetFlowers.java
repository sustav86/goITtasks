package sustavov.goit.module3.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by SUSTAVOV on 28.05.2016.
 */
public class BouquetFlowers {
    private ArrayList bouquetFlowers = new ArrayList();
    private String name;
    private float price;
    private int amountFlowers;

    public BouquetFlowers(String name, float price, int amountFlowers) {
        this.name = name;
        this.price = price;
        this.amountFlowers = amountFlowers;
        constructorFlowers(amountFlowers);
    }

    private void constructorFlowers(int amountFlowers) {
        Random randomAmountFlowers = new Random();
        while (amountFlowers > 0) {
            int count = randomAmountFlowers.nextInt(4);
            //Move switch to a new method, cause we use twice in this class.
            switch (count) {
                case 0 :
                    switchFlower("Aster", Color.PINK, 100);
                    break;
                case 1 :
                    switchFlower("Rose", Color.RED, 100);
                    break;
                case 2 :
                    switchFlower("Chamomile", Color.WHITE, 45);
                    break;
                case 3 :
                    switchFlower("Tulip", Color.YELLOW, 50);
                    break;
                default:
                    switchFlower("Rose", Color.RED, 100);
                    break;
            }
            amountFlowers--;
        }
    }

    private void add(CommonAbstractFlower commonAbstractFlower) {
        bouquetFlowers.add(commonAbstractFlower);
    }

    public void addFlowerByName(String nameFlower, Color color, int length) {
        //Move switch to a new method
        switchFlower(nameFlower, color, length);
    }

    public void remove(CommonAbstractFlower commonAbstractFlower) {
        bouquetFlowers.remove(commonAbstractFlower);
        amountFlowers--;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getAmountFlowers() {
        return amountFlowers;
    }

    public void displayBouquetInformation() {
        System.out.println(getName());

        Iterator iterator = bouquetFlowers.iterator();

        while (iterator.hasNext()) {
            CommonAbstractFlower fileInfo = (CommonAbstractFlower) iterator.next();
            System.out.println(fileInfo.getName() + " color " + fileInfo.getColor() + " length " + fileInfo.getLength());
        }


    }

    private void switchFlower(String nameFlower, Color color, int length) {
        switch (nameFlower) {
            case "Aster" :
                add(new Aster("Aster", color, length, false));
                break;
            case "Rose" :
                add(new Aster("Rose", color, length, true));
                break;
            case "Chamomile" :
                add(new Aster("Chamomile", color, length, false));
                break;
            case "Tulip" :
                add(new Aster("Tulip", color, length, false));
                break;
            default:
                System.out.println("Sorry, we have not this flower");
                break;
        }

    }
}
