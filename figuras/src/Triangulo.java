public class Triangulo extends Figura {

    public Triangulo(double altura, double lado){
        super(altura, lado);
    }
    
    @Override
    public double perimetro(){
        return getLado()*3;
    }

    @Override
    public double area(){
        return (getAltura()*getLado())/2.0;
    }

}
