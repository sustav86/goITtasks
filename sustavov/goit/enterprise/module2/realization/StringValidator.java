package sustavov.goit.enterprise.module2.realization;

import sustavov.goit.enterprise.module2.Validator;

/**
 * Created by SUSTAVOV on 21.08.2016.
 */
public class StringValidator implements Validator<String> {
    @Override
    public boolean isValid(String result) {
        if (result.matches("(?i).*[a-zа-я].*")) {
            return true;
        }
        return false;
    }
}
