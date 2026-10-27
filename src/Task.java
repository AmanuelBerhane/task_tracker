import java.time.LocalDate;
import java.time.LocalDateTime;

enum TaskStatus{
    Not_started,
    In_progress,
    Done
}
enum TaskPriority{
    High,
    Medium,
    Low
}
public class Task {
    private int id;
    public String title;
    public LocalDate dueDate;
    public TaskStatus status;
    public TaskPriority priority;
    private int categoryId;       // fk_category_id (nullable)
    private int goalId;           // fk_goal_id (nullable)
    private int jobId;            // job_id (nullable)
    private int estimatedMinutes; // estimated_minutes (nullable)
    private LocalDateTime completedAt;

    public Task (int id ,String title, LocalDate due_date, TaskStatus status,
                 TaskPriority priority, int categoryId, int goalId, int jobId, int estimatedMinutes, LocalDateTime completedAt ){
        this.id = id;
        this.title = title;
        this.dueDate= dueDate;
        this.status = status;
        this.priority = priority;
        this.categoryId = categoryId;
        this.goalId = goalId;
        this.jobId = jobId;
        this.estimatedMinutes = estimatedMinutes;
        this.completedAt = completedAt;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public TaskStatus getStatus() { return status; }
    public void setStatus(TaskStatus status) { this.status = status; }

    public TaskPriority getPriority() { return priority; }
    public void setPriority(TaskPriority priority) { this.priority = priority; }

    public Integer getCategoryId() { return categoryId; }
    public void setCategoryId(Integer categoryId) { this.categoryId = categoryId; }

    public Integer getGoalId() { return goalId; }
    public void setGoalId(Integer goalId) { this.goalId = goalId; }

    public Integer getJobId() { return jobId; }
    public void setJobId(Integer jobId) { this.jobId = jobId; }

    public Integer getEstimatedMinutes() { return estimatedMinutes; }
    public void setEstimatedMinutes(Integer estimatedMinutes) { this.estimatedMinutes = estimatedMinutes; }

    public LocalDateTime getCompletedAt() { return completedAt; }
    public void setCompletedAt(LocalDateTime completedAt) { this.completedAt = completedAt; }

    public boolean isDone() {
        return status == TaskStatus.Done;
    }

    public void markCompleted() {
        this.status = TaskStatus.Done;
        this.completedAt = LocalDateTime.now();
    }

}
