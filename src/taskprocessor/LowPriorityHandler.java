package taskprocessor;

public class LowPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(TaskCommand command) {
        if (command.getPriority() == 1) {
            System.out.println("Low priority task handled: " + command.getTask());
        } else if (nextHandler != null) {
            nextHandler.handleTask(command);
        }
    }
}
