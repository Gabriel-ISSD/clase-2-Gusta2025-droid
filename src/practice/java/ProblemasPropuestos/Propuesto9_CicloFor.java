package ProblemasPropuestos;
//Confeccionar un programa que permita ingresar un valor del 1 al 10 y
//nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
//Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.
import java.util.Scanner;
public class Propuesto9_CicloFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont, valor, f;
        cont=0;
        do {
            System.out.println("Ingresá un número del 1 al 10 para ver su tabla de multiplicar: ");
            valor = teclado.nextInt();
            if(valor>=1 && valor<=10){
                System.out.println("*".repeat(30));
                System.out.println("TABLA DEL "+valor+":");
                for (f=valor; f<=(valor*12); f+=valor) {
                    System.out.println(valor+" X "+(cont+1)+": "+f);
                    cont++;
                }
                System.out.println("*".repeat(30));
            }else{
                System.out.println("Error: Debe ingresar un número entre 1 y 10.");
            }
        }while(valor<1 || valor>10);

        System.out.println("Fin del Programa.");
    }
}