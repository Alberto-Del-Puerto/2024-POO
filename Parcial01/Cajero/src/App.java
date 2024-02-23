import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        cajero c1 = new cajero();

        Scanner entrada = new Scanner(System.in);

        String nombre;

        System.out.println("ingrese el nombre del banco: ");
        nombre = entrada.next();
        c1.setBanco(nombre);

        
        c1.printDatos();
        c1.retiro(20000);
        c1.printDatos();
        c1.deposito(300000);
        c1.printDatos();


    }
}

/* Cree una clase llamada Operaciones, con tres atributos: n1, n2, resultado.
 * agregue dos metodos adicioneales, uno para sumar n1 y n2 y otro mas para
 * restar n1 -n2.
 * cree un objeto de operaciones y realice ambas operaciones
 */
