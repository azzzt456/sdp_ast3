package taskprocessor;

public class TaskCommand implements Command {
    private String task;
    private int priority;

    public TaskCommand(String task, int priority) {
        this.task = task;
        this.priority = priority;
    }

    public String getTask() {
        return task;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public void execute() {
        System.out.println("Executing task: " + task + " with priority " + priority);
    }
}
