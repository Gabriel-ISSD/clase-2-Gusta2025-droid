package EjemplosEnClases;
//Escribir un programa que solicite la carga de un número entre 0 y 999,
//y nos muestre un mensaje de cuántos dígitos tiene el mismo.
//Finalizar el programa cuando se cargue el valor 0.
import java.util.Scanner;
public class Clase4_DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese un valor entre 0 y 999 o finaliza con 0... ");
            valor = teclado.nextInt();
            if (valor >= 100) {
                System.out.println("Tu número tiene 3 dígitos");
            }else{
                if(valor>=10){
                    System.out.println("Tu número tiene 2 dígitos");
                }else{
                    System.out.println("Tu número tiene 1 dígitos");
                }
            }
        }while (valor!=0);
        System.out.println("Presionaste 0");
        System.out.println("Saliendo del programa.");
        System.out.print("Fin del programa.");
    }
}
