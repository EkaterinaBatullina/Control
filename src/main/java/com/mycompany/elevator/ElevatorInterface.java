/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.elevator;

/**
 *
 * @author ekaterina
 */
public interface ElevatorInterface {
    
    public ElevatorAb freeChet() throws NoFreeElevatorsException;
    public ElevatorAb freeNechet() throws NoFreeElevatorsException;
    public ElevatorAb freeSotr() throws NoFreeElevatorsException;
    //поскольку существует три случая вызова лифта, метод Elevator free() разделяем на три метода для разных ситуаций вызова (для каждого случая необходимо перебирать разные лифты)
}
