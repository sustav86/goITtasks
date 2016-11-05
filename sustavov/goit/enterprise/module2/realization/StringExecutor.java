package sustavov.goit.enterprise.module2.realization;

import sustavov.goit.enterprise.module2.Executor;
import sustavov.goit.enterprise.module2.Task;
import sustavov.goit.enterprise.module2.Validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SUSTAVOV on 21.08.2016.
 */
public class StringExecutor implements Executor<String> {
    private boolean isExecute;
    private List<String> validResult = new ArrayList<>();
    private List<String> invalidResult = new ArrayList<>();
    private Map<Task<String>, Validator<String>> allTasks = new HashMap<>();

    @Override
    public void addTask(Task<String> task) {
        if (task.getResult() != null) {
            throw new RuntimeException();
        }
       addTask(task, new StringValidator());
    }

    @Override
    public void addTask(Task<String> task, Validator<String> validator) {
        if (task.getResult() != null) {
            throw new RuntimeException();
        }
        allTasks.put(task, validator);

    }

    @Override
    public void execute() {
        for (Map.Entry<Task<String>, Validator<String>> entry : allTasks.entrySet()) {
            Task<String> task = entry.getKey();
            Validator<String> validator = entry.getValue();
            task.execute();
            String result = task.getResult();
            if (validator.isValid(result)) {
                validResult.add(result);
            }else {
                invalidResult.add(result);
            }
            isExecute = true;
        }
    }

    @Override
    public List<String> getValidResults() {
        if (!isExecute) {
            throw new RuntimeException();
        }
        return validResult;
    }

    @Override
    public List<String> getInvalidResults() {
        if (!isExecute) {
            throw new RuntimeException();
        }
        return invalidResult;
    }
}
