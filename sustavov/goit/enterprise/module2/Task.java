package sustavov.goit.enterprise.module2;

/**
 * Created by SUSTAVOV on 12.08.2016.
 */
public interface Task<E> {

    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    E getResult();
}
