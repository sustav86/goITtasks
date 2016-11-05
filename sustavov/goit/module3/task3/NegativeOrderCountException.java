package sustavov.goit.module3.task3;

/**
 * Created by SUSTAVOV on 06.06.2016.
 * @author SUSTAVOV
 */
public class NegativeOrderCountException extends Exception {
    private String instrument;

    public NegativeOrderCountException(final String instrument) {
        this.instrument = instrument;

    }

    public String getInstrument() {
        return instrument;
    }
}
