package sustavov.goit.enterprise.ProducerConsumer;

import java.util.Random;

/**
 * Created by SUSTAVOV on 16.10.2016.
 */
public class Producer extends Thread {
    private StorageHub<Integer> storageHub;
    private Random random = new Random();

    public Producer(StorageHub<Integer> storageHub) {
        this.storageHub = storageHub;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            storageHub.put(random.nextInt(100));
        }

    }
}
