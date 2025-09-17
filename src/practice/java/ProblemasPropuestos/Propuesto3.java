package ProblemasPropuestos;
//Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.
public class Propuesto3 {
    public static void main(String[] args) {
        int multi;
        multi=8;
        System.out.println("Iniciando programa.");
        System.out.println("*".repeat(30));
        System.out.println("Multiplos de 8 hasta el 500:");
        while (multi<=500){
            System.out.println(multi);
            multi=multi+8;
        }
        System.out.println("*".repeat(30));
        System.out.print("Fin del Programa.");
    }
}
