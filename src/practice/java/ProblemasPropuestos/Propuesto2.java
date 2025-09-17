package ProblemasPropuestos;
//2 – Se ingresan un conjunto de n alturas de personas por teclado,
//ingresar n por teclado. Mostrar la altura promedio de las personas.
import java.util.Scanner;
public class Propuesto2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int cantidadAlturas, x;
        float valor, suma, promedio;
        x=1;
        suma=0;
        System.out.println("¿Cuántas alturas desea ingresar?: ");
        cantidadAlturas=teclado.nextInt();
        teclado.nextLine();
        System.out.println("Genial! Agregaremos "+cantidadAlturas+" alturas.");
        while(x<=cantidadAlturas){
            System.out.println("Ingrese el valor de la altura a ingresar: ");
            valor=teclado.nextFloat();
            suma+=valor;
            x++;
        }
        System.out.printf("El valor de la suma de las alturas ingresadas es: %.2f\n", suma);
        //Uso printf para que detecte %.2f que solo muestra 2 decimales
        promedio=suma/cantidadAlturas;
        System.out.printf("El promedio de las alturas es de: %.2f\n", promedio);
        System.out.println("Fin del Programa.");
    }
}
