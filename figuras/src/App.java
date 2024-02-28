public class App {
    public static void main(String[] args) throws Exception {


        Cuadrado c1 = new Cuadrado(5.5, 5.5);
        System.out.println("perimetro :" +c1.perimetro()+", Area: "+c1.area());

        Triangulo t1 = new Triangulo(5.5, 5.5);
        System.out.println("perimetro :" +t1.perimetro()+", Area: "+t1.area());



    }
}
/* Cree una clase abstract Figura que herede a dos hijas: cuadrado 
* y triangulo. Aplique polimorfismo a los metodos adicionales para
calcular el perimetro y area de cada figura.
 * 
 */