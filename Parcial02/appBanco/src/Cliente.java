public class Cliente {
    //atributos-> privados
    private String nombre;
    private String ine;
    private String email;

    //metodos
    public Cliente(){
        this.nombre  = "******";
        this.ine = "*******";
        this.email = "******";
    } 

    // set y get
    /* set-> para asignar el valor al atributo
     * get-> para poder leer el valor del atributo
     * 
     */

     public void setNombre(String nombre){
        this.nombre = nombre;
     }

     public String getNombre(){
        return this.nombre;
     }

    public String getIne() {
        return ine;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

     



}
