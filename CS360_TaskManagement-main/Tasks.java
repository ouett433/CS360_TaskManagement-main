import java.time.LocalDate;

public class Tasks {
  private String description;
  private LocalDate dueDate;
  private boolean progress;
  private int priority;
  
  public Tasks(String description, LocalDate dueDate, boolean progress, int priority)
  {
    this.description = description;
    this.dueDate = dueDate;
    this.progress = progress;
    this.priority = priority;
  }
  
  public String getDescription()
  {
    return description;
  }
  
  public LocalDate getDueDate()
  {
    return dueDate;
  }
  
  public boolean getProgress()
  {
    return progress;
  }

  public int getPriority()
  {
    return priority;
  }
  
  public void setDescription(String description)
  {
    this.description = description;
  }
  
  public void setDueDate(LocalDate dueDate)
  {
    this.dueDate = dueDate;
  }
  
  public void setProgress(boolean progress)
  {
    this.progress = progress;
  }
  
  public void setPriority(int priority)
  {
    this.priority = priority;
  }
}
