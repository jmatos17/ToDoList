import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


public class ToDoList {
    private int size;

    private boolean isEmpty;


    PriorityQueue<Task> toDoListPriorityQueue = new PriorityQueue<>();

    public void add(Importance Importance, int priority, String description) {
        Task task = new Task(Importance, priority, description);
        toDoListPriorityQueue.add(task);
    }

    public int getSize() {
        return size;
    }

    public Task remove() {
       return toDoListPriorityQueue.remove();
    }

    public boolean isEmpty() {
        return toDoListPriorityQueue.isEmpty();
    }

    public class Task implements Comparable <Task> {
        private int priority;
        private String description;
        Importance Importance;

        public Task(Importance importance, int priority, String description) {
            this.Importance = importance;
            this.priority = priority;
            this.description = description;
        }

        public int getPriority() {
            return priority;
        }

        public String getDescription() {
            return description;
        }

        public Importance getImportance() {
            return Importance;
        }

        @Override
        public int compareTo(Task task) {
            if(this.getImportance().compareTo(task.Importance) == 0){
                if (this.getPriority() > task.getPriority()) {
                    return 1;
                } else if (this.getPriority() < task.getPriority()) {
                    return -1;
                } else {
                    return 0;
                }
            }
            if(this.getImportance().compareTo(task.Importance) > 0){
                return 1;
            }

            return -1;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "priority=" + priority +
                    ", description='" + description + '\'' +
                    ", Importance=" + Importance +
                    '}';
        }
    }
}
