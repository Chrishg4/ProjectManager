/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Comentarios.comentario;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Task {
    private int id;
    private String description;
    private boolean complete;
    private User user;
    private ArrayList<comentario> comments;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean getComplete() {
        return complete;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<comentario> getComments() {
        return comments;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
    public void addComment(comentario comment) {
    this.comments.add(comment);
    }   

    public Task(int id, String description, String complete) {
        this.id = id;
        this.description = description;
        this.complete = false;
        this.user = user;
        this.comments = new ArrayList();
    }

    public Task() {
        this(0,"","");
    }
    
    
}
