import java.time.LocalDate;


enum Status{
    Not_started,
    In_progress,
    Done
}
enum Priority{
    High,
    Medium,
    Low
}
public class Task {
    private int id;
    public String title;
    public LocalDate due_date;
    public Status status;
    public Priority priority;

    public Task (int id ,String title, LocalDate due_date, Status status, Priority priority ){
        this.id = id;
        this.title = title;
        this.due_date= due_date;
        this.status = status;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public java.time.LocalDate getDueDate() {
        return due_date;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDueDate(java.time.LocalDate due_date) {
        this.due_date = due_date;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

}
