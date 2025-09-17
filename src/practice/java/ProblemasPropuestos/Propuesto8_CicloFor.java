package ProblemasPropuestos;
//Desarrollar un programa que muestre la tabla de multiplicar del 3 (del 3 al 30)
public class Propuesto8_CicloFor {
    public static void main(String[]args){
        int f, cont;
        cont=0;
        System.out.println("*".repeat(30));
        System.out.println("TABLA DE MULTIPLICAR DEL 3: ");
        for (f=3; f<=30; f+=3){
            System.out.println("3 X "+(cont+1)+": "+f);
            cont++;
        }
        System.out.println("*".repeat(30));
        System.out.print("Fin del Programa.");
    }
}
