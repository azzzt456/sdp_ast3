package taskprocessor;

public class Main {
    public static void main(String[] args) {
        TaskHandler lowPriorityHandler = new LowPriorityHandler();
        TaskHandler mediumPriorityHandler = new MediumPriorityHandler();
        TaskHandler highPriorityHandler = new HighPriorityHandler();

        lowPriorityHandler.setNextHandler(mediumPriorityHandler);
        mediumPriorityHandler.setNextHandler(highPriorityHandler);

        TaskIterator taskIterator = new TaskIterator();
        taskIterator.addTask(new TaskCommand("Task 1", 1));
        taskIterator.addTask(new TaskCommand("Task 2", 3));
        taskIterator.addTask(new TaskCommand("Task 3", 2));

        TaskMediator mediator = new TaskMediator(lowPriorityHandler);

        mediator.processTasks(taskIterator);
    }
}

