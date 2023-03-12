/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import java.util.Scanner;

/**
 *
 * @author 57320
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
        //exercise 1 
       /*
        make a program to calculate and  print  the addition of three amounts 
        */
       /* int nota1,nota2,nota3;
        System.out.println("Ingrese la primera nota ");
      
        nota1=leer.nextInt();
        System.out.println("Ingrese la segunda nota");
        nota2=leer.nextInt();
        System.out.println("Ingrese la tercera nota");
        nota3=leer.nextInt();
       int  suma = nota1+nota2+nota3;
        System.out.println("La nota final es de: "+suma);
       */
        /*
        exercise 2
        make a program  to calculate  and print  the  weekly salary of a employee we'll  useful your  weekly hours worked
       with  your salary for hour 
        
        */
        /*int weeklysalary,hours,hoursalary;
        System.out.println("Bienvenido, por favor ingrese el salario por hora del trabajador");
        hoursalary=leer.nextInt();
        System.out.println("ingrese cuantas horas trabajo el empleado");
        hours=leer.nextInt();
        weeklysalary=hoursalary*hours;
        System.out.println("el salario semanal del empleado es de: "+weeklysalary);*/
        /*
        exercise 3
        guillermo get n dollars  luis get the half of dollar that guiller get, juan get half of luis
        and guillermo together, to make a program to calculate  and print  the addition  of money they have 
        */
      /*  int Nguillermo,Nluis,Njuan,Ngl,total;
        System.out.println("Ingrese la cantidad de dolares que tiene guillermo");
        Nguillermo=leer.nextInt();
        Nluis=Nguillermo/2;
        Ngl=(Nguillermo+Nluis)/2;
        total=Nguillermo+Nluis+Ngl;
        
        System.out.println("Lo que tienen en total es: "+total);
*/
     /*
        una compñia de venta de carros  usados, paga a su personal  de ventas un salario  de $1000 mensuales.
      Mas una comision  de 150 por cada  carro vendido mas el 5 %  del valor de la venta por carro, cada mes el capturista  de la empresa ingresa 
      en la computadora los datos pertinentes. hacer un programma que calcule e imprima el salario mensual  de un vendedor dado 
      
      */
  /*   double Msalary=1000,commission=150,sell,percentage,amount,SALARY,base;
        System.out.println("Ingrese  la cantidad de ventas de carros");
        amount=leer.nextInt();
        System.out.println("Ingrese  el valor de la venta");
        sell=leer.nextInt();
        percentage=sell*0.5;
        
        base=commission*amount;
        SALARY=sell*amount+percentage+Msalary+base;
        System.out.println("El valor de la venta es: "+SALARY);*/
  /*
  la calificaicon final  de un estudiante de informatica  se calcula  con base a las calificaciones 
  de cuatro aspectos de su rendimiento academico: participacion,primer examen parcial,segundo examen  parcial y examen final.
  sabiendo que las califcaciones  anteriores entran a la calificacion final con ponderaciones de 10%,25%,25% y 40%, hacer un programa
  que calcule e imprima la calificacion final obtenida por un estudiante
  
  */
  double note1,note2,note3,note4,finall;
        System.out.println("Ingrese las 4 notas");
        note1=leer.nextDouble()*0.10;
        note2=leer.nextDouble()*0.25;
        note3=leer.nextDouble()*0.25;
        note4=leer.nextDouble()*0.40;
        finall=note1+note2+note3+note4;
        System.out.println("La nota final  es: "+finall);
  
        
        
        
        
        
    }
    
}
