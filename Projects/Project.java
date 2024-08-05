/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import Tasks.Task;
import java.util.ArrayList;

/**
 *
 * @author krist
 */
public class Project {
    private int id;
    private String nombre;
    private ArrayList<Task> Task;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Task> getTask() {
        return Task;
    }
    
    public void add(Task Task){
        this.Task.add(Task);
    }

    public Project(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.Task = new ArrayList();
    }

    public Project() {
        this(0,"");
    }
    
    
    
    
}
