package taskprocessor;

public class HighPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(TaskCommand command) {
        if (command.getPriority() == 3) {
            System.out.println("High priority task handled: " + command.getTask());
        } else if (nextHandler != null) {
            nextHandler.handleTask(command);
        }
    }
}
