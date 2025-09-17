package ProblemasPropuestos;
//Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar
// el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
// Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.
import java.util.Scanner;
public class Propuesto5_DoWhile {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int suma, i, valor;
        suma=0;
        i=0;
        do {
            System.out.print("Ingrese el valor Nº "+(i+1)+": ");
            valor=teclado.nextInt();
            if (valor!=9999){
                suma+=valor;
                i++;
            }
        }while(valor!=9999);
        System.out.println("La Suma de los valores es: "+suma);
        if (suma>0) {
            System.out.println("La Suma es Mayor a Cero.");
        }else{
            if (suma<0) {
                System.out.println("La Suma es Menor a Cero.");
            }else{
                System.out.println("La Suma es Igual a Cero.");
            }
        }
    }
}
