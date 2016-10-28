/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Projecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    String nom=null;
    String color=null;
    double diametre=0.0;
    boolean forat=false, omplit=false;
    char mander=' ';
    double preu=0.0;
    int valoració=0, menu=5;
    
    while(!(menu<1)) {
    System.out.println("||||||||||||||||||||MENÚ||||||||||||||||||||");
    System.out.println("1. Afegir nova dilatació");
    System.out.println("2. Borrar dilatació ");
    System.out.println("3. Modificar dilatació");
    System.out.println("4. Mostrar dilatacions");
    System.out.println("0. Sortir del programa");
    menu=entrada.skip("[\r\n]*").nextInt();
    
    
    switch (menu) {
        case 1:
            if(!omplit) {
                System.out.println("Escriu el nom de la dilatació:");
                nom=entrada.skip("[\r\n]*").nextLine();
                System.out.println("Escriu el color de la dilatació:");
                color=entrada.skip("[\r\n]*").nextLine();
                System.out.println("Escriu el diàmetre en milímetres:");
                diametre=entrada.skip("[\r\n]*").nextInt(); 
                System.out.println("Té forat (S/N)?");
                do {
                    mander = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (mander != 'S' && mander != 'N');
                forat = (mander == 'S');
                System.out.println("Quin es el seu preu?");
                System.out.println("Quina es la teva valoració? (Del 1 al 10)");
                
                
                
                
                
                
                omplit=true;
            } else {
                System.out.println("Ja has introduït dades!");
            }
            break;
        case 2:
            break;
        case 3:
            break;
        case 4:
            break;
        case 0:
            System.out.println("Fins un altra!");
            break;
        default:
             System.out.println("Opció invàlida, torna a intentar-ho.");
    }
    
    }
}
}