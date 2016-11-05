package sustavov.goit.module3.task3;

/**
 * Created by SUSTAVOV on 29.05.2016.
 */
public class Trumpet extends Instrument {
    private String trumpetStringField;

    public Trumpet(String name, String manufacturer, TypeInstrument typeInstrument, String caption, int price) {
        super(name, manufacturer, typeInstrument, caption, price);
    }

    @Override
    public void play() {
        System.out.println("Play my trumpet...");
    }

    @Override
    public String toString() {
        return "trumpet";
    }
}
