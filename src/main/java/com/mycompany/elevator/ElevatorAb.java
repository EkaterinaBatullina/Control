/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elevator;

/**
 *
 * @author ekaterina
 */
public abstract class ElevatorAb {
    protected Status status;
    
    public void setStatus (Status status) {
        this.status = status;
    }
    
    public Status getStatus () {
        return status;
    }
    
}
