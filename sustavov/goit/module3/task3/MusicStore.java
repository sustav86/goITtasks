package sustavov.goit.module3.task3;

import java.util.*;

/**
 * The store of music instrument.
 * Created by SUSTAVOV on 29.05.2016.
 * @author ukr-sustavov
 * @version 1.0
 */
public class MusicStore {
    private String name;
    private String owner;
    private String property;
    private InstrumentRepository memoryStoreRepository = new MemoryInstrumentRepository();

    public MusicStore(String name, String owner, String property) {
        this.name = name;
        this.owner = owner;
        this.property = property;
    }

    /**
     *
     * @return the name of this music store
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the owner of this music store
     */
    public String getOwner() {
        return owner;
    }

    /**
     *
     * @return the property of music store
     */
    public String getProperty() {
        return property;
    }

    /**
     *
     * @param instrument object of instrument
     * @return the price of instrument
     */
    public int getPrice(Instrument instrument) {
        return instrument.getPrice();
    }

    /**
     * Add instrument to the store
     * @param instrument object of instrument
     */
    public void addStore(Instrument instrument) {
        memoryStoreRepository.addInstrument(instrument);
    }

    /**
     * Remove instrument from the store
     * @param instrument object of instrument
     */
    public void removeStore(Instrument instrument) {
        memoryStoreRepository.removeInstrument(instrument);
    }

    /**
     * Inventorisation of the store
     */
    public void inventoryStore() {
        System.out.println(memoryStoreRepository.getStore());

    }

    /**
     * Prepare instruments for sale
     * @param order with instruments for sale
     * @return the list of instruments
     * @throws ConcurrentModificationException
     *         If the count in order less then in the music store
     */
    public void prepareInstruments(Map<String, Integer> order) throws NegativeOrderCountException
    {
        Map<TypeInstrument, Integer> salesInvoiceList = new HashMap<>();

        for (Map.Entry<String, Integer> entry : order.entrySet())
        {
            String needInstrument = entry.getKey();
            int needCount = entry.getValue();

            TypeInstrument typeInstrument = TypeInstrument.getTypeInstrument(needInstrument);
            List<Instrument> listInstrument = memoryStoreRepository.getListInstruments(typeInstrument);
            if (listInstrument == null) {
                throw new NullPointerException("We have no any " + needInstrument);
            }
            if (needCount > listInstrument.size()) {
                throw new IllegalArgumentException("For the shipment of goods is not enough " + (needCount - listInstrument.size()) + " " + needInstrument);
            }
            salesInvoiceList.put(typeInstrument, needCount);

        }

        writeOffStore(salesInvoiceList);

    }

    /*
     *
     * @param instrumenList of instruments to sale
     */
    private void writeOffStore(Map<TypeInstrument, Integer> salesInvoiceList) {
        for (Map.Entry<TypeInstrument, Integer> entry : salesInvoiceList.entrySet()) {
            memoryStoreRepository.removeInstrument(entry.getKey(), entry.getValue());
        }


    }

}
