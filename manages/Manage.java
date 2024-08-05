/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manages;

import Projects.Project;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author krist
 */
public class Manage {
    private ArrayList<Project> projects; 
    private ArrayList<User> users;

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public ArrayList<User> getUsers() {
        return users;
    }   

    public Manage(ArrayList<Project> projects, ArrayList<User> users) {
        this.projects = projects;
        this.users = users;
    }
    
    
    
}
