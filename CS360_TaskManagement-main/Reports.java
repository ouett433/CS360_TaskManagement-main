import java.util.Date;

import TeamMembers.java;

public class Reports {

    // Attributes
    private String project;
    private String message;
    private Date date;
    private TeamMembers member;
    private int progress;

    // Constructor
    public Reports(String project, String message, Date date, TeamMembers member, int progress) {
        this.project = project;
        this.message = message;
        this.date = date;
        this.member = member;
        this.progress = progress;
    }

    // Getters and Setters

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TeamMembers getMember() {
        return member;
    }

    public void setMember(TeamMembers member) {
        this.member = member;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    
   
