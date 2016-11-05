package sustavov.goit.enterprise.ProducerConsumer;

/**
 * Created by SUSTAVOV on 16.10.2016.
 */
public interface StorageHub<E> {

    void put(E value);

    E get();

}
