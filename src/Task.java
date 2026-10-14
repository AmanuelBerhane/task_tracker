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

}
