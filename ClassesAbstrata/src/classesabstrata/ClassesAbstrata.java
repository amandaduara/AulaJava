/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesabstrata;

/**
 *
 * @author 0041432513015
 */
public class ClassesAbstrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hamster meuHamster = new Hamster();
        Peixe meuPeixe = new Peixe();
        
        System.out.println("Hamster: ");
        meuHamster.caminha();
        meuHamster.emitirSom();
        meuHamster.comer();
        meuHamster.comer("sementes");
        
        System.out.println("Peixe: ");
        meuPeixe.caminha();
        meuPeixe.emitirSom();
        meuPeixe.comer();
        meuPeixe.comer("algas");
    }
    
}
