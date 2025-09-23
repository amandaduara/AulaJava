/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstrata;

/**
 *
 * @author 0041432513015
 */
public abstract class Animal {
    protected int pernas;
    
    public Animal(){
        pernas = 0;
    }
    
    public Animal(int pernas){
        this.pernas = pernas;
    }
    
    public abstract void caminha();
    public abstract void emitirSom();
}
