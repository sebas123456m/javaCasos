
package javaapplication37;
import java.util.Scanner;

public class menu {
    
    public void proyectoBien(){
        Scanner entrada = new Scanner(System.in);
        int respuesta;
        int expresion; // se agrega la variable expresion
        menu me = new menu();
        try {
            
        
        do {
            System.out.println("Bienvenido a su menu de opciones favor ingrese el numero de la opcion que necesita");
            System.out.println("=======================================");
            System.out.println("|           MENÚ DE OPCIONES          |");
            System.out.println("=======================================");
            System.out.println("| Opción 1: Sumar dos números         |");
            System.out.println("| Opción 2: Calcular el IMC           |");
            System.out.println("| Opción 3: Determinar si un número   |");
            System.out.println("|           es par o impar            |");
            System.out.println("=======================================");
            System.out.println("| Opción 4: Dividir varios elementos |");
            System.out.println("| Opción 0: Salir                     |");
            System.out.println("=======================================");
            expresion = entrada.nextInt(); // se pide al usuario la expresion
            
            
            if (expresion==0) {
                System.out.println("Hasta luego");
                break;
                
            }
            
            else{
           

            switch (expresion) { // se inicia el switch
                case 1:
                    me.numerosSuma();
                   
                    break;
                case 2:
                    me.calcularIMC();
                    
                case 3:
                    me.numerosParImpar();
                  
                   
                    break;
                case 4:
                    me.numerosParImpar();
                   
                default:
                    System.out.println("Por favor escoja una de las 4 opciones correspondientes:, si no le sirve ninguna oprima 0 para salir del programa");
                    me.proyectoBien();
            }
             }
            System.out.println("¿Desea continuar? Ingrese cualquier número diferente de 0: ");
            respuesta = entrada.nextInt();
             if (respuesta==0) {
                 System.out.println("Hasta la proxima");
                 break;
        }
        }  while (respuesta != 0); // termina
        } catch (Exception e) {
            System.out.println("Por favor ingrese una opcion valida");
            System.out.println("Las opciones validas son: 0,1,2,3,4 otro tipo de dato no lo deara ejecutar el programa");
            System.out.println("Tendra otra oportunitad para ingresar la opcion que es correcta");
            me.proyectoBien();
        }
    }
    
    public void calcularIMC(){
          Scanner entrada = new Scanner(System.in);
          menu me = new menu();
         double altu = 0,imc=0,pe=0;
         try {
            
       
                    System.out.println("Bienvenido a continuación conocerás tu índice de masa corporal");
                    System.out.println("Ingrese su altura en metros: ");
                    altu=entrada.nextDouble();
                    System.out.println("Ingrese su peso en kilogramos: ");
                    pe=entrada.nextDouble();
                    imc=pe/(altu*altu);
                    System.out.println("Su índice de masa corporal es: " +imc);
                    if (imc<18.5) {
                        System.out.println("Usted tiene bajo peso. Su índice de masa corporal es: "+ imc);
                    }
                    else if (imc>=18.5 &&imc<=24.9) {
                        System.out.println("Su peso es normal, su índice de masa corporal es: "+ imc);
                    }
                    else if (imc>=25.0 && imc<=29.9) {
                        System.out.println("Usted tiene sobrepeso. Su índice de masa corporal es: " +imc);
                    }
                    else {
                        System.out.println("Usted tiene obesidad. Su índice de masa corporal es: " +imc);
                    }
                     } catch (Exception e) {
                         System.out.println("Recuerde ingresar un numero entero o decimal");
                         System.out.println("Para hacer la operacion no es valido las letras ni caracteres alfanumericos");
                         System.out.println("Tendra otra oportunitad para ingresar los datos correctamente");
                         me.calcularIMC();
                         
        }
        
    }
    public void numerosParImpar(){
        menu me = new menu();
        Scanner entrada = new Scanner(System.in);
        
        try {
            
        
         double numero;
                    System.out.println("Está en la opción 3");
                    System.out.println("Ingrese un numero");
                    numero=entrada.nextDouble();
                    if (numero% 2 ==0) {
                        System.out.println("Su número es par");
                    }
                    else {
                        System.out.println("Su número es impar");
                    }
                    } catch (Exception e) {
                        System.out.println("Por favor ingrese un dato valido, recuerde ingresar numeros enteros o decimales");
                        System.out.println("No es valido una letra  o caracter alfanumerico para hacer esta operacion.");
                        System.out.println("Tendra otra oportunitad para ingresar los datos correctamente");
                        me.numerosParImpar();
                        
        }
    }
    public void numerosSuma(){
        menu me = new menu();
        Scanner entrada = new Scanner(System.in);
         double PD=0,SD=0,TD=0;
                    System.out.println("Ingrese el primer numero");
                    
                    try {
                    PD=entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    SD=entrada.nextDouble();
                    TD=PD+SD;
                    System.out.println("La suma de los numeros es: "+TD);
                    } catch (Exception e) {
                     System.out.println("Por favor ingrese un dato valido, recuerde ingresar numeros enteros o decimales");
                      System.out.println("No es valido una letra  o caracter alfanumerico para hacer esta operacion.");
                        System.out.println("Tendra otra oportunitad para ingresar los datos correctamente");
                        System.out.println("O si quiere volver al menu presione el numero ");
                      me.numerosSuma();
                        
        }
                    
    }
    public void numerosDivision(){
        Scanner entrada = new Scanner(System.in);
        menu me = new menu();
          System.out.println("Bienvenido a la division de elementos");
          
                     System.out.print("Ingrese cuantos numeros quiere dividir ");
        int n = entrada.nextInt();
        try {
            
       

        // Declaramos el array con la longitud que quiere el usuario
        double[] numeros = new double[n];

        // Pedimos al usuario que ingrese los valores que contendra el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese   un valor");
            numeros[i] = entrada.nextDouble();
        }

        // Pedir el divisor al usuario
        System.out.print("Ingrese el divisor: ");
        double divisor = entrada.nextDouble();

        // Realizamos la división y mostrar los resultados
        for (int i = 0; i < numeros.length; i++) {
            double resultado = numeros[i] / divisor;
            System.out.println(numeros[i] + " dividido por " + divisor + " es igual a " + resultado);
        }
    }   catch (Exception e) {
            System.out.println("Recuerde ingresar numeros enteros o decimales en la operacion");
            System.out.println("No son validos las letras ni los caractares alfanumericos");
            System.out.println("Tendra otra oportunitad para ingresar los datos correctamente");
            me.numerosDivision();
        }
    }
    
         
    }
