package ProblemasPropuestos;
//Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
//Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto
//cuadrante. Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.
import java.util.Scanner;
public class Propuesto10_CicloFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int f, n, x, y, cuad1, cuad2, cuad3, cuad4, fueraCuad;
        cuad1=0;
        cuad2=0;
        cuad3=0;
        cuad4=0;
        fueraCuad=0;
        System.out.println("¿Cuántos puntos cardinales ingresarás?: ");
        n=teclado.nextInt();
        for (f=1; f<=n; f++) {
            System.out.println("Ingresá el primer valor del cardinal Nº "+f+": ");
            x = teclado.nextInt();
            System.out.println("Ingresá el segundo valor del cardinal Nº "+f+": ");
            y = teclado.nextInt();
            if(x>0 && y>0){
                cuad1++;
            }else{
                if(x<0 && y>0){
                    cuad2++;
                }else{
                    if(x<0 && y<0){
                        cuad3++;
                    }else {
                        if (x>0 && y<0){
                            cuad4++;
                        }else{
                            //"Punto en eje al ingresar un 0, no se cuenta en cuadrante."
                            fueraCuad++;
                        }
                    }
                }
            }
        }
        System.out.println("Tenemos "+cuad1+" puntos en Cuadrante I.");
        System.out.println("Tenemos "+cuad2+" puntos en Cuadrante II.");
        System.out.println("Tenemos "+cuad3+" puntos en Cuadrante II.");
        System.out.println("Tenemos "+cuad4+" puntos en Cuadrante IV.");
        System.out.println("Tenemos "+fueraCuad+" puntos en Fuera de Cuadrante.");
        System.out.println("Fin del Programa.");
    }
}
