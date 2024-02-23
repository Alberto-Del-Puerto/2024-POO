/* Relaciones entre en objetos
 * arreglo de objetos
 * 
 * Diseñe una aplicación para administrar las cuentas bancarias de una sucursal
 * . se debe contar con con clases distintas, una clase cliente y una clase Cuenta
 * 
 * Clase cliente-> atributos : nombre, ine, email
 *                 metodos; constructor, set y get
 * Clase cuenta-> atributos: num cuenta, saldo, cliente, nip
 *                metodos: contructor, set y get , retiro, deposito, tranferencia
 */

public class App {
    public static void main(String[] args) throws Exception {
    
        Cliente cliente1 = new Cliente();

        cliente1.setNombre("majo");
        cliente1.setEmail("majo23@gamil.com");
        cliente1.setIne("adcd1233");

        Cuenta cuenta1 = new Cuenta("0000", 0, cliente1, "123");

        cuenta1.deposito(20000);
        cuenta1.retiro(22000);



        cuenta1.printDatos();


        Cuenta[] listaCuentas = new Cuenta[3];

        listaCuentas[0] = cuenta1;

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Ana");
        cliente2.setEmail("ana24@icloud.com");
        cliente2.setIne("1234acd");

        listaCuentas[1] = new Cuenta("1111", 0, cliente2, "0011");

        listaCuentas[1].printDatos();

        listaCuentas[0].tranferencia(listaCuentas[1], 3000);
        listaCuentas[1].printDatos();
        listaCuentas[0].printDatos();





    }
}
/*
 * llenar un arreglo de 4 cuentas, donde el usuario ingresa cada uno de los
 * datos. Utilizando un ciclo. Mostrar el listado de las cuentas ingresadas
 * 
 *  */