public class persona {
    //atributos-> son privados, para evitar que los datos sean vulnerables
   //modificador de acceso tipo Nombre;
   private String Nombre;
   private int Edad;
   private String Carrera;

   // metodos: 
   /* El primer metodo de una clase, debe ser el constructor
    */



    persona(){    // constructor precagardo
        this.Nombre = "*****";
        this.Edad = 0;
        this.Carrera = "******";

    }


    persona(String Nombre, int Edad, String Carrera){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Carrera = Carrera;
    }

    // metodos adicionales: publicos, puedo acceder a ellos fuera de la clase 

    // modificador de acceso tipo NombreMetodo( parametros)
    public void datos(){
        System.out.println("nombre: "+this.Nombre + ", edad: "+ this.Edad + ", carrera: "+this.Carrera);
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public int getEdad() {
        return Edad;
    }


    public void setEdad(int edad) {
        Edad = edad;
    }


    public String getCarrera() {
        return Carrera;
    }


    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    // metodos set y get 
 





}
