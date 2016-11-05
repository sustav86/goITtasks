package sustavov.goit.enterprise.module2;

/**
 * Created by SUSTAVOV on 12.08.2016.
 */
public interface Validator<E> {

    // Валидирует переданое значение
    boolean isValid(E result);

}
