package EjemplosEnClases;

public class Clase2_SecuenciaWhileRamdom {
    public static void main(String[] args) {
        int aleatorio=2+(int)(Math.random()*99);//Genera un valor que va a ser el limite de la lista
        int x=2;//la lista arranaca en 2
        System.out.println("Valores pares entre 2 y "+aleatorio);
        while (x<=aleatorio){//va de 2 en 2 hasta el valor final que habiamos generamos
            System.out.println(x+"-");
            x+=2;
        }
    }
}

