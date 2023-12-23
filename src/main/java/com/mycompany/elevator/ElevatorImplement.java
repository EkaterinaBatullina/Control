/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elevator;

/**
 *
 * @author ekaterina
 */
public class ElevatorImplement implements ElevatorInterface{
    private Node currentChet;
    private Node currentNechet;
    private Node currentSotr;
    
    public ElevatorImplement(){
        
        Node rootChet = new Node(new ElevatorChet(Status.Free));
        currentChet = rootChet;
        for (int i = 0; i < 2; ++i) {
            currentChet.next = new Node (new ElevatorChet(Status.Free));
            currentChet = currentChet.next;
        }
        currentChet.next = rootChet;
        
        Node rootNechet = new Node(new ElevatorNechet(Status.Free));
        currentNechet = rootNechet;
        for (int i = 0; i < 2; ++i) {
            currentNechet.next = new Node (new ElevatorNechet(Status.Free));
            currentNechet = currentNechet.next;
        }
        currentNechet.next = rootNechet;
        
        Node rootSotr = new Node(new ElevatorSotr(Status.Free));
        currentSotr = rootSotr;
        currentSotr.next = rootSotr;
    }
    // с созданием объекта класса конструктор создает 3 закольцованных связных списка для 3 типов лифта
    // в узлы помещаем заданное количество лифтов со свободным (изначально) статусом
    
    @Override
    public ElevatorAb freeChet() throws NoFreeElevatorsException {
        currentChet = currentChet.next; //переход с последнего лифта на первый, так как в конструкторе текущий элемент остался последним (и так далее)
        if (currentChet.value.status == Status.Free) {
            currentChet.value.status = Status.NotFree;
        } //пока статус свободный можем вернуть лифт и изменить статус на несвободный
        
        else{
            throw new NoFreeElevatorsException();
        } // в противном случае выбрасываю собственное исключение
        return currentChet.value;
    }
    
    @Override
    public ElevatorAb freeNechet() throws NoFreeElevatorsException {
        currentNechet = currentNechet.next;
        if (currentNechet.value.status == Status.Free) {
            currentNechet.value.status = Status.NotFree;
        } 
        else{
            throw new NoFreeElevatorsException();
        } 
        return currentNechet.value;
    }
    
    @Override
    public ElevatorAb freeSotr() throws NoFreeElevatorsException {
        currentSotr = currentSotr.next;
        if (currentSotr.value.status == Status.Free) {
            currentSotr.value.status = Status.NotFree;
        }
        else{
            throw new NoFreeElevatorsException();
        } 
        return currentSotr.value;
    }
    
}
