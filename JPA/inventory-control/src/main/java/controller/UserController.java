/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import models.Users;
import services.UserService;

/**
 *
 * @author dougl
 */

@Named
@ViewScoped
public class UserController implements Serializable {
    
    @EJB
    private UserService userService;
    
    private Users user;
    
    @PostConstruct
    void initInstance() {
        user = new Users();
    }
    
    private void save() {
        userService.findAll();
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
}
