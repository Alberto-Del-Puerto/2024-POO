
/* POO: 
 * crear una clase: Sirve como plantilla para generar objetos
 * de la misma clase. Una clase tiene atributos y metodos. Los
 * atributos son las caracteristicas de los objetos y metodoso
 * son los acciones los objetos.
 * 
 * 
 * instanciar un objeto: es crear un objeto de una clase en particular
 * 
 * constructor:  Es el metodo encargado de inicializar todos los
 * atributos de la clase.
 * 
 * metodos set y get : Son los metodos por los cuales se manipulan los atributos
 * de una clase.
 * 
 * Metodos Set-> Sirven para establecer el valor de cada atributo de la clase
 * Metodos Get -> Sriven para acceder al valor de cada atributo de la clase.
 * 
 */




public class App {
    public static void main(String[] args) throws Exception {

        persona p1 = new persona(); // instanciar 
        p1.datos();

        p1.setNombre("majo");
        p1.setEdad(21);
        p1.setCarrera("ISGC");
        System.out.println(p1.getNombre());
        p1.datos();



    }
}
