package EjemplosEnClases;
//Escribir un programa que lea 10 números enteros y
//luego muestre cuántos valores ingresados fueron múltiplos de 3 y
//cuántos de 5. Debemos tener en cuenta que hay números que son múltiplos de 3 y
//de 5 a la vez.
import java.util.Scanner;
public class Clase8_CicloFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int f, mul3, mul5, valor;
        mul3=0;
        mul5=0;
        for(f=1;f<=10;f++) {
            System.out.println("Ingresá el valor Nº "+f+": ");
            valor = teclado.nextInt();
            if(valor%3==0) {
                mul3++;
            }
            if(valor%5==0) {//Hago el if fuera del esle para que verifique si tb es mul5
                mul5++;
            }
        }
        System.out.println("Hay "+mul3+" múltiplos de 3 y "+mul5+" de 5.");
    }
}
