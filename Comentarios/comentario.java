/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comentarios;

import Users.User;

/**
 *
 * @author krist
 */
public class comentario {
    private int id;
    private User user;
    private String Comentario;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public comentario(int id, User user, String Comentario) {
        this.id = id;
        this.user = user;
        this.Comentario = Comentario;
    }

    public comentario() {
        this(0,new User(),"");
    }
    
    
}
