public class Cuadrado extends Figura {
    

        public Cuadrado(double altura, double lado){
            super(altura, lado);
        }


    @Override
    public double perimetro(){
        return getLado()*4;
    }

    @Override
    public double area(){
        return getAltura()*getLado();
    }
}
