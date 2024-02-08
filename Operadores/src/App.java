import java.util.Scanner;

// simulacro 14 de feb
/*
 * operadores:  
 * 
 * aritmeticos : +,-,*,/, 2%N
 * asignacio:   x=2
 *              x+=2; x= x+2    
 *              x*=2; x = x*2
 * comparacion: <,>,<=,>=,==,!= . regresan un true o false
 * dependiendo si la condicion se cumple.   (2>3)
 * 
 * condicionales : if-else
 * 
 * if(cond1){
 * 
 * }else if(cond2){
 * 
 * }....else{
 * 
 * }
 * 
 * ciclos: while, for, for each.
 * 
 * array
 * 
 * 
 */
public class App {
    public static void main(String[] args) throws Exception {

        // ingresar nos numeros int y decir cual el mayor
        Scanner input = new Scanner(System.in); // creamos el objeto input para ingresar datos
        int n1, n2;

        System.out.println("ingresa el num 1: ");
        n1 = input.nextInt();
        System.out.println("ingresa num2: ");
        n2 = input.nextInt();

        // ingresar una letra
        //letra = input.next().charAt(0);

        if(n1<n2){
            System.out.println("el mayor es: "+n2);
        }else if(n1==n2){
            System.out.println(" n1 y n2 son iguales");
        }else{
            System.out.println("el mayor es: "+n1);
        }


        int max = maxNum(n1, n2);
        System.out.println("el numero mayor es: "+max);

    }

    // construir un metodo adiconal
    // nivel de acceso static retorna nombre (paremetros){

    //}

    public static int maxNum(int n1, int n2){
        if(n1<n2){
            return n2;
        }else if(n1==n2){
            return 0;
        }else{
            return n1;
        }
    }

}
