package ProblemasPropuestos;
//Desarrollar un programa que permita cargar n números enteros y
// luego nos informe cuántos valores fueron pares y cuántos impares.
import java.util.Scanner;
public class Propuesto4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i, n, valor, pares, impares;
        i=0;
        pares=0;
        impares=0;

        System.out.println("¿Cuántos Números ingresarás?: ");
        n=teclado.nextInt();
        while(i<n){
            System.out.println("Ingresá el valor Nº "+(i+1)+": ");
            valor=teclado.nextInt();
            if(valor%2==0){
                pares+=1;
            }else{
                impares+=1;
            }
            i++;
        }
        System.out.println("Hay "+pares+" pares y "+impares+" impares.");
        System.out.print("Fin del Programa.");
    }
}