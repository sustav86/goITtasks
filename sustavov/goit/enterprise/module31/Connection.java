package sustavov.goit.enterprise.module31;

/**
 * Created by SUSTAVOV on 01.10.2016.
 */
public class Connection {
    private static Connection instance = new Connection();
    private int connections = 0;
    private Semaphore sem = new MySemaphore(10);

    private Connection() {

    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {

        sem.acquire();

        try {
            doConnect();
        }finally {
            sem.release();
        }
    }

    public void doConnect() {
        synchronized (this) {
            connections++;
            System.out.println("Current connections: " + connections);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            connections--;
        }

    }
}
