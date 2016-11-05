package sustavov.goit.module3.task3;

/**
 * Created by SUSTAVOV on 21.05.2016.
 */
public enum TypeInstrument {
    STRINGED,
    PERCUSSION,
    BRASS,
    KEYBOARD;

    public static TypeInstrument getTypeInstrument(String instrument) throws NegativeOrderCountException
    {
        switch (instrument)
        {
            case "guitar":
                return TypeInstrument.STRINGED;
            case "piano":
                return TypeInstrument.KEYBOARD;
            case "trumpet":
                return TypeInstrument.BRASS;
            default:
                throw new NegativeOrderCountException(instrument);
        }
    }
}
