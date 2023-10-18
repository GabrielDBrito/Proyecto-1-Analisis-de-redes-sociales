/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;
import EDD.Lista;
/**
 *
 * @author Gabriel
 * version 18/10/2023
 */
public class Helpers {

    public Helpers() {
    }
    
   /*
    Divide un string en 2, la primera parte hasta que encuentre ", " y la segunda parte el resto del string
    @param string
    @return lista
    
    */
   public Lista stringSplit(String string){
        String[] parts = string.split(", ");
        String part1 = parts[0]; // parte del string anterior a ", "
        String part2 = parts[1]; // parte del string posterior a ", "
       
        Lista lista = new Lista();
        lista.insertFinal(part1);
        lista.insertFinal(part2);
        lista.print();
        return lista;
   }
    
}
