package sustavov.goit.module3.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by SUSTAVOV on 12.06.2016.
 */
public interface InstrumentRepository {
    void addInstrument(Instrument instrument);
    void removeInstrument(Instrument instrument);
    void removeInstrument(TypeInstrument typeInstrument, int count);
    Instrument getInstrument(Instrument instrument);
    Map<TypeInstrument, ArrayList<Instrument>> getStore();
    List<Instrument> getListInstruments(TypeInstrument typeInstrument);

}
