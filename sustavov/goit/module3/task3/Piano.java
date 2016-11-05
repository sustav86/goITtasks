package sustavov.goit.module3.task3;

/**
 * SearchMaximalElement piano, music instrument
 * Created by SUSTAVOV on 29.05.2016.
 * @author ukr-sustavov
 * @version 1.0
 */
public class Piano extends Instrument {
    private boolean pianoBooleanField;
    private float pianoFloatField;

    public Piano(String name, String manufacturer, TypeInstrument typeInstrument, String caption, int price) {
        super(name, manufacturer, typeInstrument, caption, price);
    }

    @Override
    public void play() {
        System.out.println("Play my piano...");
    }

    @Override
    public String toString() {
        return "piano";
    }

}
