package sustavov.goit.module3.task2;

/**
 * Created by SUSTAVOV on 28.05.2016.
 */
public class Solution {
    public static void main(String[] args) {
        BouquetFlowers bouquetFlowers = new BouquetFlowers("Bouquet", 123, 10);
        bouquetFlowers.displayBouquetInformation();

        bouquetFlowers.addFlowerByName("Chrysanthemum", Color.GREEN, 23);

        BushRoses bushRoses = new BushRoses("Red roses", 1000, 101);
        bushRoses.add("White rose", Color.WHITE, 100);
        bushRoses.remove(102);

        bushRoses.displayBouquetRosesInformation();

    }
}
