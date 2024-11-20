import java.util.ArrayList;
import java.util.List;

public class TeamMembers {
    private String username;
    private String email;
    private List<Task> tasks;

    // Constructor
    public TeamMembers(String username, String email) {
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    // Method to add a task
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to remove a task
    public void removeTask(Task task) {
        tasks.remove(task);
    }
}
