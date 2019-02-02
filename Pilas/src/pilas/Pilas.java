
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;
import java.util.*;
/**
 *
 * @author JMHM
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        creacionpila pila=new creacionpila();
        pila.clear();
        
        Stack nombres=new Stack();
        for (int i = 0; i < 4; i++) {
            nombres.push("3");
        }
        // Push Mete Los datos
        nombres.push("Juanito");
        nombres.push(23);
        nombres.push(12.35);
        nombres.push("Juan Manuel");
        
        //QUe hace peek?
        
        System.out.println(nombres.peek()+"Muestro solo el ultimo elemento");
        System.out.println(nombres.pop()+"Nel yo lo elimino ");
        System.out.println(nombres.peek()+"Mostrare el ultimo elemento");
        
        nombres.clear();
        if (nombres.size()<=0) {
            System.out.println("no hay nada");
        }
        
        //Muestra el ultimo elemento que se introdujo
        
        
    }
    
}
