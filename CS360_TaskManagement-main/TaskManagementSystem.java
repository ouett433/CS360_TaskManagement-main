import java.util.ArrayList;

import Task.java
import TeamMembers.java
import Notifications.java
  

public class TaskManagementSystem {
  //variables
  private String systemName;
  private TeamMembers members[];
  private String access;

  //constructor
  public TaskManagementSystem(String systemName, TeamMembers members[], String access) {
    this.systemName = systemName;
    this.members = members;
    this.access = access;
  }

  //setters&getters
  public String getSystemName(){
    return systemName;
  }
  public void setSystemName(String systemName){
    this.systemName = systemName;
  }
  
  public TeamMembers getMembers(){
    return members;
  }
  public TeamMembers setMembers(TeamMembers members[]){
    this members = members;
  }
  
  public String getAccess(){
    return systemName;
  }
  public void setAccess(String access){
    this.access = access;
  }
  
  
  //methods
  public void updateAccess(TeamMember memberID){
  }

  public void assignTast(Task taskName){
    
  }

  public void addTask(Task taskName){
  }

  public void deleteTask(Task taskName){
  }

  public void updateTask(Task taskName){
  }

  public void addTeamMember(TeamMembers memberID){
  }

  public void deleteTeamMember(TeamMembers memberID){
  }

  public void addNotification(Notifications message){
  }
  
  public void deleteNotification(Notifications message){
  }
  
}
