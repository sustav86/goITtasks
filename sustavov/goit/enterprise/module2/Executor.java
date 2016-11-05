package sustavov.goit.enterprise.module2;

import java.util.List;

/**
 * Created by SUSTAVOV on 12.08.2016.
 */
public interface Executor<E> {

    // Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
    // Бросает Эксепшн если уже был вызван метод execute()
    void addTask(Task<E> task);

    // Добавить таск на выполнение и валидатор результата. Результат таска будет записан в ValidResults если validator.isValid вернет true для этого результата
    // Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
    // Бросает Эксепшн если уже был вызван метод execute()
    void addTask(Task<E> task, Validator<E> validator);

    // Выполнить все добавленые таски
    void execute();

    // Получить валидные результаты. Бросает Эксепшн если не был вызван метод execute()
    List<E> getValidResults();

    // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
    List<E> getInvalidResults();

}
