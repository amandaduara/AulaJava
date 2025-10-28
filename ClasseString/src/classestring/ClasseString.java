/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classestring;

/**
 *a
 * @author 0041432513015
 */
public class ClasseString {
    public static void main(String[] args) {
        
        String nomeOriginal = "Amanda Duara Ramos";
        
        int qntCaracteres = nomeOriginal.length();
        System.out.println("Quantidade de caracteres: " + qntCaracteres);
        
        String removeEspacos = nomeOriginal.trim();
        System.out.println("Nome sem espacos extras: '" + removeEspacos + "'");
        
        String nomeMaiusculo = nomeOriginal.toUpperCase();
        System.out.println("Nome em maiusculo: " + nomeMaiusculo);

        String[] nomeSparado = nomeOriginal.split(" ");
        String primeiroNome = nomeSparado[0];
        String segundoNome = nomeSparado[1];
        String ultimoSobrenome = nomeSparado[2];
        
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Segundo nome: " + segundoNome);
        System.out.println("Ultimo sobrenome: " + ultimoSobrenome);
    }
}

