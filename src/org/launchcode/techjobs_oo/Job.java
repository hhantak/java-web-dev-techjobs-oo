package org.launchcode.techjobs_oo;
//import java.util.Objects;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public Job() {
        id = nextId;
        nextId++;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    // getter/setter name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter/setter employer
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    //getter/setter location
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    //getter/setter positionType
    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    //getter/setter coreCompetency
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //getter for id
    public int getId() {
        return id;
    }

    // TODO: Create Test for toString

    @Override
    public String toString() {
        if (name == null) {
            this.setName("Data Not Available");
        } else if (employer == null) {
            employer.setValue("Data Not Available");
        } else if (location == null) {
            location.setValue("Data Not Available");
        } else if (positionType == null) {
            positionType.setValue("Data Not Available");
        } else if (coreCompetency == null) {
            coreCompetency.setValue("Data Not Available");
        }
        return "ID: __" + id + "__" +
                "\n Name: __" + name + "__" +
                "\n Employer: __" + employer + "__" +
                "\n Location: __" + location + "__" +
                "\n Position Type: __" + positionType + "__" +
                "\n Core Competency: __" + coreCompetency + "__";
    }
}