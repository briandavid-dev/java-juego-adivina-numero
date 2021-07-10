package juegoadivinanumero;

import java.util.Scanner;

public class JuegoAdivinaNumero {

    public static void main(String[] args) {
        
        System.out.println("Juego: Adivina el numero.");
        System.out.println("1. Facil (15 vidas)");
        System.out.println("2. Intermedio (7 vidas)");
        System.out.println("3. Dificil (3 vidas)");
        System.out.println("4. Salir");
        
        NOTACION_CHAO:
        while(true){
            System.out.print("Nivel: ");
            Scanner leer = new Scanner(System.in);
            int option = leer.nextInt();
            switch(option){
                case 1:
                    jugar(15);
                    break;
                case 2:
                    jugar(7);
                    break;
                case 3:
                    jugar(3);
                    break;
                case 4:
                    System.err.println("Chao");
                    break NOTACION_CHAO;
                default:
                    System.out.println("Opción invalida");
                    break ;
            }
        }
        
    }
    
    /**
     * <h2>Función jugar</h2>
     * Juego: Adivina el numero.
     * @since 07-07-2021
     * @param vidas Recibe un numero entero
     */
    static void jugar (int vidas){
        int numeroRandon = (int)(Math.random()*101);
        int numeroElegido = -1;
        
        Scanner leer =  new Scanner(System.in);
        
        // SALIR_WHILE:
        while(numeroElegido != numeroRandon){
            System.out.println("");
            System.out.print("Ingresa un número entre 1 y 100: ");
            numeroElegido = leer.nextInt();
            
            String pista = "";
            
            if(numeroElegido < numeroRandon){
                pista = "Pista: el numero es mayor que "+numeroElegido;    
                vidas--;
            } else if(numeroElegido > numeroRandon) {
                pista = "Pista: el numero es menor que "+numeroElegido;    
                vidas--;
            } 
            
            if(vidas > 0){
                System.out.println(pista);    
            }
             
            
            if(vidas == 0) {
                System.out.println("-------------------");
                System.out.println("-----GAME-OVER-----");
                System.out.println("-------------------");
                System.out.println("El número era "+numeroRandon);
                System.out.println("-------------------");
                System.out.println("");
                break;
                // break SALIR_WHILE;
                // continue;
            }
            
            //if(vidas > 0) {
                System.out.printf("Te quedan %d vidas\n",vidas);
            //}
        }
        
        if(numeroElegido == numeroRandon){
            System.out.println("-------------------");
            System.out.println("URRAA GANASTE!!!!!!");
            System.out.println("-------------------");
        }
        
        
    }
    
}
