/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elevator;

/**
 *
 * @author ekaterina
 */
public class Elevator {

    public static void main(String[] args) throws NoFreeElevatorsException {
        
        ElevatorImplement elevator = new ElevatorImplement();
        
        
        for (int i = 0; i < 20; ++i) { //в случайном порядке распределяем 20 вызовов по различным надобностям
            // тест на последовательные вызовы каждого типа лифта, считаем, что занять лифт удается первым трем (для четных), трем (для нечетных) и одному (для сотрудника)
            // остальные вызовы провальные
            if (i < 10) {
                CallImpl call = new CallImpl ();    
                call.Call(Purpose.Chet);
                try{
                    ElevatorAb elevatorChetFree = elevator.freeChet(); //получаем свободный лифт пока это возможно (до выброса искоючения)
                    System.out.println("Осуществлен успешный вызов четного лифта");
                }
                catch (NoFreeElevatorsException e) {
                    System.out.println("Осуществлен вызов четного лифта, каждый из которых в настоящий момент занят");
                }
                //получаем 7 выбросов исключения с сообщением, следовательно, 3 вызова успешные
            }
            
            else if (i > 9 && i < 15) {
                CallImpl call = new CallImpl ();    
                call.Call(Purpose.Nechet);
                try{
                    ElevatorAb elevatorNechetFree = elevator.freeNechet();
                    System.out.println("Осуществлен успешный вызов нечетного лифта");
                }
                catch (NoFreeElevatorsException e) {
                    System.out.println("Осуществлен вызов нечетного лифта, каждый из которых в настоящий момент занят");
                }
                //получаем 2 выброса исключения с сообщением, следовательно, 3 вызова успешные
            }
            
            else {
                CallImpl call = new CallImpl ();    
                call.Call(Purpose.Sotr);
                try{
                    ElevatorAb elevatorSotrFree = elevator.freeSotr();
                    System.out.println("Осуществлен успешный вызов лифта для сотрудника");
                }
                catch (NoFreeElevatorsException e) {
                    System.out.println("Осуществлен вызов лифта для сотрудника, каждый из которых в настоящий момент занят");
                }
                //получаем 4 выброса исключения с сообщением, следовательно, 1 вызов успешный
            }  
        }
        
    }
}
