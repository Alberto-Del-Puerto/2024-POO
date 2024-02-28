abstract class Figura {
    private double altura;
    private double lado;


   

    public Figura(double altura, double lado) {
        this.altura = altura;
        this.lado = lado;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getLado() {
        return lado;
    }


    public void setLado(double lado) {
        this.lado = lado;
    }

    abstract double perimetro();

    abstract double area();



}
