package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity{

    private String employer;
    private String skill;

    public Job() {
    }

    // Initialize the id and value fields.
    public Job(String anEmployer, String someSkill) {
        super();
        this.employer = anEmployer;
        this.skill = someSkill;
    }

    // Getters and setters.

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
