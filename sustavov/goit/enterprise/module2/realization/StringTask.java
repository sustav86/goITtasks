package sustavov.goit.enterprise.module2.realization;

import sustavov.goit.enterprise.module2.Task;

/**
 * Created by SUSTAVOV on 21.08.2016.
 */
public class StringTask implements Task<String> {
    private String result;
    private String task;

    public StringTask(String task) {
        this.task = task;
    }

    @Override
    public void execute() {
        StringBuilder stringBuilder = new StringBuilder(task);
        stringBuilder.reverse();
        result = stringBuilder.toString();
    }

    @Override
    public String getResult() {
        return result;
    }

}
