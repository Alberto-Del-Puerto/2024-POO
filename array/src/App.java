import java.util.Scanner;

/*ciclos y array
 * 
 * while(cond ){
 * ....
 * 
 * }
 * 
 * do{
 * 
 * 
 * }while(cond);
 * 
 * 
 * for(initContador; cond ; incremetoCont){
 * 
 * }
 * 
 * arreglos:
 * 
 * tipo[] nombre = new int[tamaño];
 * 
 * la indice del primer elemento de una array es el 0.
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        // imprimir los numeros del 0 al 10
        int cont=0;

        while(cont<=10){
            System.out.print(cont+", ");
            cont++; 
        }

        cont = 0;

        System.out.println();

        do{
            System.out.print(cont+",");
            cont++;
        }while(cont<=10);

        System.out.println();
        for(int i = 0; i<=10; i++){
            System.out.print(i+", ");
        }

        System.out.println();
        int[] numeros = {7,5,2};

        System.out.println("el numero del array es: "+numeros[2]);

        // el usuario indica el tamaño del array y los numeros que guarda
        int dim;

        Scanner input = new Scanner(System.in);
        System.out.println("indique el tamaño del array: ");
        dim = input.nextInt();

        // declaro el array

        int[] lista = new int[dim];
        for(int i=0; i<dim; i++){
            System.out.println("num "+i+": ");
            lista[i] = input.nextInt();
        }

        for(int i=0; i<dim; i++){
            System.out.print(lista[i]+", ");
        }

        System.out.println();

        // for each

        printArray(lista);

        int mayor = numMax(lista);
        System.out.println("el numero mayor es: "+mayor);


    }


    public static void printArray (int[] lista){
        for(int x:lista){
            System.out.print(x+",");
        }
    }

    // diseñe un metodo que encuentre el num mayor de un arreglo de numeros.
    public static int numMax(int[] vector){
        int max = vector[0]; 
        for(int x: vector){
            if(max<x){
                max = x;
            }
        }

        return max;
    }
}
