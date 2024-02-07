import java.util.Scanner;


public class App {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;
    
    System.out.println("ingrese el numero de elementos: ");
    num = input.nextInt();

    int[] numeros  = new int[num];

    for(int i=0; i<num; i++){
        System.out.println("ingresa un numero int: ");
        numeros[i] = input.nextInt();
    }

    // mostrar los numeros

    for(int i=0; i<num; i++){
        System.out.print(numeros[i]+", ");
    }

    // con for each
    System.out.println();

    for(int n: numeros){
        System.out.print(n+", ");
    }

    // encontrar el num mayor

    int max = maxVector(numeros);
    System.out.println("\nel num mayor es: "+max);




    }
public static int maxVector(int[] vector){

    int max = vector[0];

    for(int x: vector){
        if(x>max){
            max=x;
        }
    }

    return max;
}

}
