package javaapplication37;

import java.util.Scanner;
import javaapplication37.menu;
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          menu me = new menu();
          int expresion;
          int respuesta=0;
          try {
              do {
                  System.out.println("Bienvenido a su menu de opciones favor ingrese el numero de la opcion que necesita");
            System.out.println("=======================================");
            System.out.println("|           MENÚ DE OPCIONES          |");
            System.out.println("=======================================");
            System.out.println("| Opción 1: Sumar dos números         |");
            System.out.println("| Opción 2: Calcular el IMC           |");
            System.out.println("| Opción 3: Deteminar si un número   |");
            System.out.println("|           es par o impar            |");
            System.out.println("=======================================");
            System.out.println("| Opción 4: Dividir varios elementos |");
            System.out.println("| Opción 0: Salir                     |");
            System.out.println("=======================================");
            expresion=entrada.nextInt();
            
            if (expresion==0) {
                System.out.println("Hasta luego");
                break;
                
            }
            
            switch(expresion){
                case 1:
                    me.numerosSuma();
                    break;
                case 2:
                    me.calcularIMC();
                    break;
                case 3:
                    me.numerosParImpar();
                    break;
                case 4:
                    me.numerosDivision();
                    break;
                    default:
                        System.out.println("Por favor escriba una de las opciones disponibles");
                        System.out.println("Volvera a tener otro intento para ingresar bien los datos");
                        me.proyectoBien();
            }
                
            System.out.println("¿Desea continuar? Ingrese cualquier número diferente de 0: ");
            respuesta = entrada.nextInt();
                  
              } while (respuesta != 0);
              System.out.println("Hasta la proxima");
              
             
            
        } catch (Exception e) {
              System.out.println("Por favor vuelva a ingresar una opcion valida");
              System.out.println("Las opciones validas son: 0,1,2,3,4 otro tipo de dato no lo dejara ejecutar el programa");
              System.out.println("Tendra otra oportunitad para ingresar la opcion que es correcta");
              me.proyectoBien();
        }
        
    
}
}
