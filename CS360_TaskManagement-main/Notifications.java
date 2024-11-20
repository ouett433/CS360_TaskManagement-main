import java.time.LocalDate;

public class Notifications {
  private String message;
  private LocalDate date;
  private TeamMembers creator;
  private int urgency;
  
  public Notifications(String message, LocalDate date, TeamMembers creator, int urgency)
  {
    this.message = message;
    this.date = date;
    this.creator = creator;
    this.urgency = urgency;
  }
  public String getMessage()
  {
    return message;
  }

  public LocalDate getDate()
  {
    return date;
  }
  
  public TeamMembers getCreator()
  {
    return creator;
  }
  
  public int getUrgency()
  {
    return urgency;
  }
  
  public void setMessage(String message)
  {
    this.message = message;
  }
  
  public void setDate(LocalDate date)
  {
    this.date = date;
  }
  
  public void setCreator(TeamMembers creator)
  {
    this.creator = creator;
  }
  
  public void setUrgency(int urgency)
  {
    this.urgency = urgency;
  }
}
