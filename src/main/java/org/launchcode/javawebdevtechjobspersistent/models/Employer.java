package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.NotBlank;

public class Employer extends AbstractEntity {

    @NotBlank
    private String location;

    public String getLocation(){
        return this.location;
    };
    
    public void setLocation(String location){
      this.location = location;
    };


}
