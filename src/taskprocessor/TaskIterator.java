package taskprocessor;

import java.util.List;
import java.util.ArrayList;

public class TaskIterator {
    private List<TaskCommand> tasks;
    private int position;

    public TaskIterator() {
        this.tasks = new ArrayList<>();
        this.position = 0;
    }

    public void addTask(TaskCommand task) {
        tasks.add(task);
    }

    public boolean hasNext() {
        return position < tasks.size();
    }

    public TaskCommand next() {
        return tasks.get(position++);
    }
}
