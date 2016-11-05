package sustavov.goit.module3.task3;

/**
 * Created by SUSTAVOV on 29.05.2016.
 */
public abstract class Instrument {
    private String name;
    private String caption;
    private String manufacturer;
    private int price;
    private TypeInstrument typeInstrument;

    public Instrument(String name, String manufacturer, TypeInstrument typeInstrument, String caption, int price)
    {
        this.name = name;
        this.manufacturer = manufacturer;
        this.typeInstrument = typeInstrument;
        this.caption = caption;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public String getCaption()
    {
        return caption;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public TypeInstrument getTypeInstrument()
    {
        return typeInstrument;
    }

    public int getPrice()
    {
        return price;
    }

    public void play()
    {
        System.out.println("I can't play on it...");
    }

    @Override
    public abstract String toString();
}
