package EjemplosEnClases;
//Desarrollar un programa que permita la carga de 10 valores por teclado y
// nos muestre posteriormente la suma de los valores ingresados y su promedio.
import java.util.Scanner;
public class Clase7_CicloFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int f, valor, suma, promedio;
        suma=0;
        for (f=1;f<=10;f++){
            System.out.print("Ingrese el valor Nº "+f+": ");
            valor = teclado.nextInt();
            suma+=valor;
        }
        System.out.println("La Suma de los valores es: "+suma);
        promedio=suma/10;
        System.out.println("El Promedio de los valores es: "+promedio);
        System.out.println("Fin del Programa.");
    }
}
