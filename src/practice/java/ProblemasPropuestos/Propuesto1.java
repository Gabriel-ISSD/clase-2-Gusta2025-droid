package ProblemasPropuestos;
//1 - Generar un valor aleatorio entre 0 y 1000.
//Mostrar la cantidad de dígitos que tiene dicho número.
public class Propuesto1 {
    public static void main(String[] args) {
        int aleatorio=(int)(Math.random()*1001);
        System.out.println("El número ingresado es: "+aleatorio);
        String texto = String.valueOf(aleatorio);
        int digitos=texto.length();
        System.out.println("Tú número tiene "+digitos+" digitos.");
    }
}
