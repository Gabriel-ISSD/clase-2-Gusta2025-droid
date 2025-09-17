package EjemplosEnClases;
//Escribir un programa que solicite la carga de números por teclado,
//obtener su promedio.
//Finalizar la carga de valores cuando se cargue el valor 0.
import java.util.Scanner;
public class Clase5_OpcionSalidaDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma, cant, valor, promedio;
        suma = 0;//acumula la suma de los valores
        cant = 0;//cuanta la cantidad de valores correctos para despues dividir en el promedio.
        do {
            System.out.print("Ingrese el valor(0 para terminar): ");
            valor = teclado.nextInt();
            if (valor!=0) {
                suma += valor;
                cant ++;
            }
        }while(valor!=0);
        if(cant != 0){
            promedio = suma/cant;
            System.out.println("El promedio de los valores ingresados es: "+promedio);
        }else {
            System.out.println("No ingresaste valores.");
        }
        System.out.print("Fin del Programa.");
    }
}
