package ProblemasPropuestos;
//Desarrollar un programa que solicite la carga de 10 números
//e imprima la suma de los últimos 5 valores ingresados.
import java.util.Scanner;
public class Propuesto7_CicloFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int f, suma, valor;
        suma=0;
        for(f=1;f<=10;f++){
            System.out.println("Ingrese el valor Nº "+f+": ");
            valor = teclado.nextInt();
            if(f>5){
                suma+=valor;
            }
        }
        System.out.println("La suma de los últimos 5 valores ingresados es: "+suma);
    }
}
