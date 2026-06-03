package com.example.spring_boot_practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class  Project {
    private final int id;
    private final String name;

    public Project(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

// 1st rule make class final
public final class ImmutableEmployeeObject {

    //2nd rule make all the fields private and final

    private final int id;
    private final String name;
    private final List<Project> projectList;

    // 3rd rule create parameterized constructor to initialize all the fields
    public ImmutableEmployeeObject(int id, String name, List<Project> projectList) {
        this.id = id;
        this.name = name;
        // 4th Rule Perform Defensive copy
        this.projectList = Collections.unmodifiableList(
                new ArrayList<>(projectList)
        );
    }

    // 5th rule create only getter method and no setter method
    public int getId() {
        return id;
    };

    public String getName() {
        return name;
    };

    public List<Project> getProjectList() {
        return projectList;
    };


}
