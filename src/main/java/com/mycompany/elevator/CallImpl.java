/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elevator;

/**
 *
 * @author ekaterina
 */
public class CallImpl implements Call{
    public Purpose purpose;
    
    @Override
    public void Call(Purpose purpose) {
        this.purpose = purpose;
    }
    
}
