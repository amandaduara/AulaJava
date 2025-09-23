/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstrata;

/**
 *
 * @author 0041432513015
 */
public class Hamster extends Animal {

    public Hamster() {
        super(4);
    }

    @Override
    public void caminha() {
        System.out.println("O hamster corre rapidinho na rodinha!");
    }

    @Override
    public void emitirSom() {
        System.out.println("O hamster faz pequenos guinchos.");
    }
}

