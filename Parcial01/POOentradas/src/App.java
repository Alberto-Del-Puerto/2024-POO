import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*ingreso de datos:
         * -scanner -> consola
         * -joptionpane -> interface IU
         * 
         */

         Scanner input = new Scanner(System.in);
         String nombre;

         System.out.println("ingresa un nombre: ");
         nombre = input.nextLine();

         System.out.println("nombre: "+nombre);

         double numero;

         System.out.println("ingresa un numero: ");
         numero = input.nextDouble();
         System.out.println("numero:" +numero);


    }
}
