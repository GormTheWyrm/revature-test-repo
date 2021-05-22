package models;

public class Project {
    private String name;
    private int sprintLengthInDays;
    //would do a timestamp but lets not push ourselves too much yet


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSprintLengthInDays() {
        return sprintLengthInDays;
    }

    public void setSprintLengthInDays(int sprintLengthInDays) {
        this.sprintLengthInDays = sprintLengthInDays;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", sprintLengthInDays=" + sprintLengthInDays +
                '}';
    }



}
