package sustavov.goit.module3.task3;

import java.util.*;

/**
 * Created by SUSTAVOV on 13.06.2016.
 */
public class MemoryInstrumentRepository implements InstrumentRepository {
    private Map<TypeInstrument, ArrayList<Instrument>> store = new HashMap<>();

    @Override
    public void addInstrument(Instrument instrument) {
        ArrayList<Instrument> listInstrument = store.get(instrument.getTypeInstrument());
        if (listInstrument != null) {
            listInstrument.add(instrument);
        }else {
            ArrayList<Instrument> newList = new ArrayList<>();
            newList.add(instrument);
            store.put(instrument.getTypeInstrument(), newList);
        }
    }

    @Override
    public void removeInstrument(Instrument instrument) {
        ArrayList<Instrument> listInstrument = store.get(instrument.getTypeInstrument());
        if (listInstrument != null) {
            listInstrument.remove(instrument);
        }

    }

    @Override
    public void removeInstrument(TypeInstrument typeInstrument, int count)
    {
        ArrayList<Instrument> listInstrument = store.get(typeInstrument);
        if (listInstrument != null) {
            for (int i = 0; i < count; i++) {
                listInstrument.remove(0);
            }

        }

    }

    @Override
    public Instrument getInstrument(Instrument instrument) {
        ArrayList<Instrument> listInstrument = store.get(instrument.getTypeInstrument());
        if (listInstrument != null) {
            Iterator<Instrument> iterator = listInstrument.iterator();
            while (iterator.hasNext()) {
                Instrument currentInstrument = iterator.next();
                if (currentInstrument.equals(instrument)) {
                    return currentInstrument;
                }
            }
        }
        return null;
    }

    @Override
    public List<Instrument> getListInstruments(TypeInstrument typeInstrument)
    {
        return store.get(typeInstrument);
    }

    public Map<TypeInstrument, ArrayList<Instrument>> getStore() {
        return store;
    }

}
