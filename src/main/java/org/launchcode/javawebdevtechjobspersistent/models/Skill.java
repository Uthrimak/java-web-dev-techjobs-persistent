package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<Job>();

    @NotBlank
    private String longDescription;

    public Skill() {}

    public Skill(@NotBlank String longDescription) {
        this.longDescription = longDescription;
    }

    //Getters and setters
    public String getDescription() {
        return longDescription;
    }
    public void setDescription(String longDescription) {
        this.longDescription = longDescription;
    }

}