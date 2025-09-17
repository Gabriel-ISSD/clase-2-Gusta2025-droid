package EjemplosEnClases;
//Desarrollar un programa que permita la carga de 5
// valores por teclado y nos muestre posteriormente la suma
// de los valores ingresados y su promedio.

import java.util.Scanner;

public class Clase3_IngresoDatosSumaPromedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, suma, valor, promedio;
        x = 1;
        suma = 0;
        while (x<=5){
            System.out.print("Ingrese el valor: ");
            valor = teclado.nextInt();
            suma += valor;
            x+=1;
        }
        promedio = suma/5;
        System.out.println("La suma de los 5 valores es: "+suma);
        System.out.println("La suma de los 5 valores es: "+promedio);
    }
}
