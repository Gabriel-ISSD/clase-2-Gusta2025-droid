package org.example;

public class Main {
    public static void main(String[] args) {

        //Ciclo While:

        System.out.printf("while loop: \n");//es el equivalente más cercano a los f-strings de Python en Java. Usamos "," para separar en lugar del "+"
        int i = 0;//Contador usado para controlar la cantidad de ciclos, sino se hace un ciclo infinito.
        while (i < 5) {
            System.out.println("i: "+ i);
            i++;
        }

        //Ciclo Do While: reproduce aunque sea una vez.
        System.out.printf("do while loop: \n");
        int j = 0;
        do{
            System.out.println("j: "+ j);
            j++;
        }while(j<3);

        //Ciclo for:
        System.out.printf("for loop: \n");
        for (int k=0; k<3; k++){
            System.out.println("k: "+ k);
        }

        //++ j=j+1
        //-- j=j-1
        //+= j=j+2
        //-= j=j-2
        //*= j=j*2
        // /= j=j/2
        // %= j=j%2

        //Ciclo for each: recorre elementos de una lista.
        System.out.printf("for each loop: \n");
        String[] list_name={"Ana", "Luis", "Pedro"};
        for(String name: list_name){
            System.out.println("name: "+ name);
        }

        String palabra="Hola mundo";
        for (char letra : palabra.toCharArray()){//toCharArray(): crea una lista con todos los caracteres del string.
            System.out.println("letra: "+ letra);//Imprime letra por letra.
        }
    }
}