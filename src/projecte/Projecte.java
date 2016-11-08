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
    boolean forat=false, omplit=false, mostrar=false, borrar=false;
    char mander=' ', esmostrar=' ', esborrar=' ';
    double preu=0.0;
    int valoracio=0, menu=5, nemo=0;
    
    while(!(menu<1)) {
    System.out.println("||||||||||||||||||||MENÚ||||||||||||||||||||");
    System.out.println("1. Afegir nova dilatació");
    System.out.println("2. Borrar dilatació");
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
                diametre=entrada.skip("[\r\n]*").nextDouble(); 
                System.out.println("Té forat (S/N)?");
                do {
                    mander = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (mander != 'S' && mander != 'N');
                forat = (mander == 'S');
                System.out.println("Quin es el seu preu? (en euros)");
                preu=entrada.skip("[\r\n]*").nextDouble();
                System.out.println("Quina es la teva valoració? (Del 1 al 10)");
                valoracio=entrada.nextInt();
                omplit=true;
            } else {
                System.out.println("Ja has introduït dades!");
            }
            break;
        case 2:
            if (omplit != false) {
                System.out.println("Vols vore les dades de la dilatació? (S/N)");
                do {
                    esmostrar = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esmostrar != 'S' && esmostrar != 'N');
                mostrar = (esmostrar == 'S');
            } else {
                System.out.println("No hi ha informació que borrar!");
                break;
            }
                    if (mostrar != false) {
                        System.out.println("Nom de la dilatació: " +nom);
                        System.out.println("Color de la dilatació: " +color);
                        System.out.println("Diàmetre de la dilatació: " +diametre);
                        System.out.println("Té forat la dilatació? " +forat);
                        System.out.println("Preu de la dilatació: " +preu);
                        System.out.println("Valoració de la dilatació: " +valoracio);
                     
                        System.out.println("Vols borrar les dades? (S/N)");
                         do {
                            esborrar = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esborrar != 'S' && esborrar != 'N');
                        borrar = (esborrar == 'S');
                            if (borrar != false) {
                                nom = null;
                                color = null;
                                diametre = 0;
                                forat = false;
                                preu = 0;
                                valoracio = 0;
                                omplit = false;
                                System.out.println("Dades esborrades!");
                            } else { 
                                System.out.println("No s'ha esborrat rés!");
                            }    
                            
                    } else { 
                        System.out.println("Vols borrar les dades? (S/N)");
                         do {
                            esborrar = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esborrar != 'S' && esborrar != 'N');
                        borrar = (esborrar == 'S');
                            if (borrar != false) {
                                nom = null;
                                color = null;
                                diametre = 0;
                                forat = false;
                                preu = 0;
                                valoracio = 0;
                                omplit = false;
                                System.out.println("Dades esborrades!");
                            } else {
                                System.out.println("No s'ha esborrat rés!");
                            }        
                    }           
            break;
        case 3:
            System.out.println("Vols vore les dades de la dilatació? (S/N)");
            do {
                    esmostrar = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esmostrar != 'S' && esmostrar != 'N');
                mostrar = (esmostrar == 'S');
                
                if (mostrar != false) {
                        System.out.println("Nom de la dilatació: " +nom);
                        System.out.println("Color de la dilatació: " +color);
                        System.out.println("Diàmetre de la dilatació: " +diametre);
                        System.out.println("Té forat la dilatació? " +forat);
                        System.out.println("Preu de la dilatació: " +preu);
                        System.out.println("Valoració de la dilatació: " +valoracio);
                     
                        System.out.println("Vols modificar les dades? (S/N)");
            break;
                }
        case 4:
            if (omplit != false) {
                System.out.println("Nom de la dilatació: " +nom);
                System.out.println("Color de la dilatació: " +color);
                System.out.println("Diàmetre de la dilatació: " +diametre);
                System.out.println("Té forat la dilatació? " +forat);
                System.out.println("Preu de la dilatació: " +preu);
                System.out.println("Valoració de la dilatació: " +valoracio);
            } else { 
                System.out.println("No hi ha informació que mostrar!");
            }    
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