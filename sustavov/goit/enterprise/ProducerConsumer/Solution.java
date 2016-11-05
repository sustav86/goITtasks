package sustavov.goit.enterprise.ProducerConsumer;

/**
 * Created by SUSTAVOV on 16.10.2016.
 */
public class Solution {
    public static void main(String[] args) {
//        Queue<Integer> queue = new PriorityQueue<>();
//        System.out.println(queue.size());
////        System.out.println(queue.element());
//        queue.add(3);
//        System.out.println(queue.size());
//        System.out.println(queue.element());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.size());
//        System.out.println(queue.poll());

        StorageHub<Integer> storageHub = new IntegerStorage<>(10);
//        IntStream.range(0, 5).forEach((i) -> new Producer(storageHub).start());
//        IntStream.range(0, 5).forEach((i) -> new Consumer(storageHub).start());
//        while (true) {
        new Producer(storageHub).start();
        new Consumer(storageHub).start();
        new Producer(storageHub).start();
//        new Consumer(storageHub).start();
//        }

    }
}
