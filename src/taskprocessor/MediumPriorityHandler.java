package taskprocessor;

public class MediumPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(TaskCommand command) {
        if (command.getPriority() == 2) {
            System.out.println("Medium priority task handled: " + command.getTask());
        } else if (nextHandler != null) {
            nextHandler.handleTask(command);
        }
    }
}
