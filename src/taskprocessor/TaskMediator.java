package taskprocessor;

public class TaskMediator {
    private TaskHandler firstHandler;

    public TaskMediator(TaskHandler firstHandler) {
        this.firstHandler = firstHandler;
    }

    public void processTasks(TaskIterator iterator) {
        while (iterator.hasNext()) {
            TaskCommand task = iterator.next();
            firstHandler.handleTask(task);
        }
    }
}
